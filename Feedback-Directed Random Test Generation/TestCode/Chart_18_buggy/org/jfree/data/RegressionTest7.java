package org.jfree.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        java.lang.Object obj26 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 100.0d, (double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        java.util.List list20 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), 0.0d);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.clear();
        java.util.List list18 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 1L);
        int int10 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 4);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int16 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D14.getRowKeys();
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int21 = defaultKeyedValues2D14.getColumnCount();
        java.util.List list22 = defaultKeyedValues2D14.getColumnKeys();
        int int23 = defaultKeyedValues2D14.getRowCount();
        defaultKeyedValues2D14.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) '#');
        defaultKeyedValues2D14.removeColumn((java.lang.Comparable) false);
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (java.lang.Number) 1L);
        int int7 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) (short) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 100);
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
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
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        int int13 = defaultKeyedValues8.getItemCount();
        defaultKeyedValues8.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues8.insertValue((int) (byte) 100, (java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1), (java.lang.Comparable) "");
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        int int9 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Comparable comparable11 = defaultKeyedValues2D1.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "" + "'", comparable11, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100.0f);
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 1.0d);
        java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (short) 0);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        int int28 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) "");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        defaultKeyedValues10.setValue((java.lang.Comparable) 0.0f, (double) (byte) -1);
        int int43 = defaultKeyedValues10.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        java.lang.Number number23 = defaultKeyedValues0.getValue(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0.0d + "'", number23, 0.0d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        int int8 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) "hi!");
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) 5, (java.lang.Comparable) 1);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int4 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        int int8 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (short) 10);
        defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (double) 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) -1);
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeRow(0);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 10.0f);
        java.lang.Comparable comparable32 = defaultKeyedValues0.getKey(0);
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (byte) -1 + "'", comparable32, (byte) -1);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        defaultKeyedValues0.clear();
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue(comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) 5, (java.lang.Comparable) 1);
        java.util.List list20 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list22 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        defaultKeyedValues2D1.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 2);
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.util.List list2 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) false);
        defaultKeyedValues2D1.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) ' ', (java.lang.Comparable) (short) 1);
        java.lang.Object obj10 = defaultKeyedValues2D1.clone();
        java.lang.Number number11 = null;
        defaultKeyedValues2D1.addValue(number11, (java.lang.Comparable) 0.0d, (java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        int int13 = defaultKeyedValues8.getItemCount();
        boolean boolean14 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues2D1.clear();
        int int16 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0L, (java.lang.Comparable) "", (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (-1));
        int int12 = defaultKeyedValues0.getItemCount();
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
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 0);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        int int12 = defaultKeyedValues11.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 0);
        int int17 = defaultKeyedValues13.getIndex((java.lang.Comparable) false);
        defaultKeyedValues13.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list24 = defaultKeyedValues21.getKeys();
        boolean boolean25 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues21);
        boolean boolean26 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues21);
        java.util.List list27 = defaultKeyedValues21.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj29 = defaultKeyedValues2D28.clone();
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean34 = defaultKeyedValues21.equals((java.lang.Object) (short) 10);
        defaultKeyedValues21.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        int int39 = defaultKeyedValues21.getItemCount();
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues21);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues41 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues41.setValue((java.lang.Comparable) 100, 1.0d);
        java.util.List list45 = defaultKeyedValues41.getKeys();
        int int46 = defaultKeyedValues41.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D47 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj48 = defaultKeyedValues2D47.clone();
        int int50 = defaultKeyedValues2D47.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj51 = defaultKeyedValues2D47.clone();
        java.lang.Object obj52 = defaultKeyedValues2D47.clone();
        int int53 = defaultKeyedValues2D47.getColumnCount();
        java.lang.Class<?> wildcardClass54 = defaultKeyedValues2D47.getClass();
        boolean boolean55 = defaultKeyedValues41.equals((java.lang.Object) defaultKeyedValues2D47);
        boolean boolean56 = defaultKeyedValues21.equals((java.lang.Object) defaultKeyedValues41);
        java.lang.Object obj57 = null;
        boolean boolean58 = defaultKeyedValues41.equals(obj57);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.lang.Object obj3 = defaultKeyedValues0.clone();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        java.lang.Number number20 = defaultKeyedValues0.getValue((int) (byte) 1);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 100, (java.lang.Number) (short) -1);
        int int26 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj27 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass28 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.lang.Object obj3 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) 100);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (byte) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int16 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues12.equals((java.lang.Object) int16);
        java.lang.Object obj18 = defaultKeyedValues12.clone();
        defaultKeyedValues12.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues12.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues12.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        java.lang.Object obj27 = null;
        boolean boolean28 = defaultKeyedValues12.equals(obj27);
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        int int33 = defaultKeyedValues12.getIndex((java.lang.Comparable) 5);
        java.lang.Comparable comparable35 = defaultKeyedValues12.getKey((int) (byte) 1);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) comparable35);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) (byte) 100, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (byte) 100 + "'", comparable35, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) 4);
        int int17 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        java.util.List list14 = defaultKeyedValues0.getKeys();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) true, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D27.clear();
        int int30 = defaultKeyedValues2D27.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean35 = defaultKeyedValues2D27.equals((java.lang.Object) defaultKeyedValues31);
        defaultKeyedValues31.removeValue((java.lang.Comparable) (-1L));
        boolean boolean38 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues31);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D16.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 1.0d);
        java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 0.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10L, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) -1);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 0);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int3 = defaultKeyedValues2D1.getRowCount();
        int int5 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        int int14 = defaultKeyedValues2D3.getColumnCount();
        int int15 = defaultKeyedValues2D3.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D3.getValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        int int27 = defaultKeyedValues26.getItemCount();
        defaultKeyedValues26.clear();
        java.util.List list29 = defaultKeyedValues26.getKeys();
        defaultKeyedValues26.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues26.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int36 = defaultKeyedValues26.getItemCount();
        defaultKeyedValues26.removeValue((java.lang.Comparable) 1);
        int int40 = defaultKeyedValues26.getIndex((java.lang.Comparable) 2);
        int int42 = defaultKeyedValues26.getIndex((java.lang.Comparable) false);
        boolean boolean44 = defaultKeyedValues26.equals((java.lang.Object) 100L);
        int int45 = defaultKeyedValues26.getItemCount();
        defaultKeyedValues26.setValue((java.lang.Comparable) 0.0f, (double) 5);
        boolean boolean49 = defaultKeyedValues2D15.equals((java.lang.Object) defaultKeyedValues26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 10.0f, 100.0d);
        defaultKeyedValues0.removeValue(1);
        int int33 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int3 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) 1);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 10);
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 1L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues0.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1L) + "'", comparable20, (-1L));
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        int int28 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj29 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 1.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int13 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list14 = defaultKeyedValues2D11.getRowKeys();
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int18 = defaultKeyedValues2D11.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D11.getColumnKeys();
        int int20 = defaultKeyedValues2D11.getRowCount();
        defaultKeyedValues2D11.clear();
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        boolean boolean13 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.setValue((java.lang.Number) 52.0d, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        int int31 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) '4');
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 1.0f);
        java.util.List list23 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) 10L);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        int int11 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0);
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1L));
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) 100, (java.lang.Number) (byte) 100);
        java.lang.Object obj26 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultKeyedValues14.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 0);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        int int12 = defaultKeyedValues11.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 0);
        int int17 = defaultKeyedValues13.getIndex((java.lang.Comparable) false);
        defaultKeyedValues13.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list24 = defaultKeyedValues21.getKeys();
        boolean boolean25 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues21);
        boolean boolean26 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues21);
        java.util.List list27 = defaultKeyedValues21.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj29 = defaultKeyedValues2D28.clone();
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D28.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean34 = defaultKeyedValues21.equals((java.lang.Object) (short) 10);
        defaultKeyedValues21.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        int int39 = defaultKeyedValues21.getItemCount();
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues21);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues41 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues41.setValue((java.lang.Comparable) 100, 1.0d);
        java.util.List list45 = defaultKeyedValues41.getKeys();
        int int46 = defaultKeyedValues41.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D47 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj48 = defaultKeyedValues2D47.clone();
        int int50 = defaultKeyedValues2D47.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj51 = defaultKeyedValues2D47.clone();
        java.lang.Object obj52 = defaultKeyedValues2D47.clone();
        int int53 = defaultKeyedValues2D47.getColumnCount();
        java.lang.Class<?> wildcardClass54 = defaultKeyedValues2D47.getClass();
        boolean boolean55 = defaultKeyedValues41.equals((java.lang.Object) defaultKeyedValues2D47);
        boolean boolean56 = defaultKeyedValues21.equals((java.lang.Object) defaultKeyedValues41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number58 = defaultKeyedValues41.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100);
        int int20 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 100.0f, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '#');
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
        int int28 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        int int34 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj36 = defaultKeyedValues2D35.clone();
        defaultKeyedValues2D35.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D35.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj43 = defaultKeyedValues2D35.clone();
        int int45 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) "");
        int int47 = defaultKeyedValues2D35.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D35.addValue((java.lang.Number) 4, (java.lang.Comparable) '#', (java.lang.Comparable) 2);
        java.util.List list55 = defaultKeyedValues2D35.getRowKeys();
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 100);
        boolean boolean59 = defaultKeyedValues2D0.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        int int11 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (byte) 10);
        int int30 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D11.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) 1);
        java.util.List list18 = defaultKeyedValues2D11.getColumnKeys();
        defaultKeyedValues2D11.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        int int23 = defaultKeyedValues2D11.getColumnCount();
        java.lang.Object obj24 = defaultKeyedValues2D11.clone();
        defaultKeyedValues2D11.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 2);
        defaultKeyedValues2D11.removeColumn((java.lang.Comparable) 10.0d);
        boolean boolean31 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) 10L);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        int int13 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) 2);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 10L, (java.lang.Number) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + (short) 0 + "'", number26, (short) 0);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) '#');
        java.util.List list20 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) true, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        int int41 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable43 = defaultKeyedValues2D1.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) 100);
        int int8 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 0, comparable10, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 100);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), number13);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        int int16 = defaultKeyedValues15.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        int int21 = defaultKeyedValues17.getIndex((java.lang.Comparable) false);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list28 = defaultKeyedValues25.getKeys();
        boolean boolean29 = defaultKeyedValues17.equals((java.lang.Object) defaultKeyedValues25);
        boolean boolean30 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues25);
        java.util.List list31 = defaultKeyedValues25.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj33 = defaultKeyedValues2D32.clone();
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean38 = defaultKeyedValues25.equals((java.lang.Object) (short) 10);
        defaultKeyedValues25.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D43.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D43.removeColumn((java.lang.Comparable) 1);
        java.util.List list50 = defaultKeyedValues2D43.getColumnKeys();
        defaultKeyedValues2D43.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D43.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 1);
        boolean boolean59 = defaultKeyedValues25.equals((java.lang.Object) (short) 1);
        int int61 = defaultKeyedValues25.getIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues25.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        boolean boolean65 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        int int66 = defaultKeyedValues25.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number68 = defaultKeyedValues25.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        java.util.List list19 = defaultKeyedValues2D8.getRowKeys();
        int int20 = defaultKeyedValues2D8.getRowCount();
        defaultKeyedValues2D8.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
        int int13 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.util.List list14 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        java.util.List list14 = defaultKeyedValues0.getKeys();
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        java.util.List list3 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass5 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (double) (byte) 1);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 1.0d);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        int int5 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0L, (java.lang.Comparable) 1.0d, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        int int21 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (-1.0d));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) 100, 1.0d);
        java.lang.Object obj21 = defaultKeyedValues17.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D23.removeColumn((java.lang.Comparable) (byte) 10);
        boolean boolean26 = defaultKeyedValues17.equals((java.lang.Object) defaultKeyedValues2D23);
        boolean boolean27 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int9 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0L);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.removeColumn(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 0L, (java.lang.Comparable) 4);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 4);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        java.util.List list30 = defaultKeyedValues2D16.getRowKeys();
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
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        int int11 = defaultKeyedValues2D1.getRowCount();
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        java.util.List list4 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 0.0d, (double) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) 100.0f);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.clear();
        int int5 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultKeyedValues2D1.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 4);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowCount();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        int int25 = defaultKeyedValues2D16.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        java.lang.Number number13 = null;
        defaultKeyedValues2D0.setValue(number13, (java.lang.Comparable) 0, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues36.removeValue((java.lang.Comparable) (short) 0);
        int int40 = defaultKeyedValues36.getIndex((java.lang.Comparable) false);
        defaultKeyedValues36.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues44 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues44.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list47 = defaultKeyedValues44.getKeys();
        boolean boolean48 = defaultKeyedValues36.equals((java.lang.Object) defaultKeyedValues44);
        defaultKeyedValues36.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues36.clear();
        defaultKeyedValues36.setValue((java.lang.Comparable) (short) 1, 0.0d);
        defaultKeyedValues36.removeValue((java.lang.Comparable) ' ');
        defaultKeyedValues36.addValue((java.lang.Comparable) 0.0d, (java.lang.Number) (-1));
        defaultKeyedValues36.setValue((java.lang.Comparable) (-1.0f), (double) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D65 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int67 = defaultKeyedValues2D65.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list68 = defaultKeyedValues2D65.getRowKeys();
        defaultKeyedValues2D65.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int72 = defaultKeyedValues2D65.getColumnCount();
        java.util.List list73 = defaultKeyedValues2D65.getColumnKeys();
        int int74 = defaultKeyedValues2D65.getRowCount();
        defaultKeyedValues2D65.clear();
        boolean boolean76 = defaultKeyedValues36.equals((java.lang.Object) defaultKeyedValues2D65);
        int int77 = defaultKeyedValues36.getItemCount();
        boolean boolean78 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues36);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
            defaultKeyedValues0.insertValue(5, (java.lang.Comparable) 10.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 0.0d, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D8.addValue((java.lang.Number) 1, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D8.getValue((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) 100L, (java.lang.Comparable) (short) 0);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100L);
        int int17 = defaultKeyedValues2D1.getColumnCount();
        java.lang.Object obj18 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        defaultKeyedValues10.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 2);
        java.lang.Class<?> wildcardClass33 = defaultKeyedValues10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue((int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        defaultKeyedValues10.removeValue((java.lang.Comparable) 1);
        int int27 = defaultKeyedValues10.getItemCount();
        java.util.List list28 = defaultKeyedValues10.getKeys();
        java.lang.Object obj29 = defaultKeyedValues10.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeRow(0);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) 10.0d);
        int int6 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Long (java.lang.Byte and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        int int29 = defaultKeyedValues0.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        java.lang.Number number32 = null;
        defaultKeyedValues2D18.addValue(number32, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
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
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Number number3 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) "", number3);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D3.removeRow((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 10);
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
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int10 = defaultKeyedValues2D1.getRowCount();
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        int int25 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 2);
        org.jfree.chart.util.SortOrder sortOrder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        defaultKeyedValues10.clear();
        int int17 = defaultKeyedValues10.getItemCount();
        int int18 = defaultKeyedValues10.getItemCount();
        java.util.List list19 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.addValue((java.lang.Comparable) 'a', (java.lang.Number) 100.0d);
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
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 100, (double) 100L);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) (short) 0);
        boolean boolean49 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues23);
        defaultKeyedValues10.addValue((java.lang.Comparable) 4, (java.lang.Number) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D0.getValue((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1), (java.lang.Comparable) "");
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.lang.Object obj3 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (short) -1);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.removeValue((java.lang.Comparable) (short) 0);
        int int13 = defaultKeyedValues9.getIndex((java.lang.Comparable) false);
        defaultKeyedValues9.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list20 = defaultKeyedValues17.getKeys();
        boolean boolean21 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues17);
        defaultKeyedValues9.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues9.removeValue((java.lang.Comparable) 100.0d);
        defaultKeyedValues9.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) (byte) 100);
        defaultKeyedValues9.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 0.0f);
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) 0.0f);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
            defaultKeyedValues2D0.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100L);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int13 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0, (java.lang.Comparable) (-1.0d));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int17 = defaultKeyedValues14.getItemCount();
        defaultKeyedValues14.setValue((java.lang.Comparable) (byte) 0, (double) 1);
        int int22 = defaultKeyedValues14.getIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues14.setValue((java.lang.Comparable) 100.0f, (double) 0);
        defaultKeyedValues14.setValue((java.lang.Comparable) (-1L), 0.0d);
        defaultKeyedValues14.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 100.0d);
        java.util.List list32 = defaultKeyedValues14.getKeys();
        boolean boolean33 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 'a', (java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        defaultKeyedValues10.setValue((java.lang.Comparable) (-1), (java.lang.Number) (byte) 10);
        int int27 = defaultKeyedValues10.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        int int9 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100L);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 100, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0d);
        java.util.List list15 = defaultKeyedValues2D0.getColumnKeys();
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 0);
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
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) 100L, (java.lang.Comparable) (short) 0);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Long (java.lang.Integer and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        int int10 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) -1);
        int int14 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues12.getItemCount();
        java.lang.Object obj14 = null;
        boolean boolean15 = defaultKeyedValues12.equals(obj14);
        defaultKeyedValues12.clear();
        java.util.List list17 = defaultKeyedValues12.getKeys();
        java.util.List list18 = defaultKeyedValues12.getKeys();
        defaultKeyedValues12.addValue((java.lang.Comparable) 0, (double) '#');
        java.util.List list22 = defaultKeyedValues12.getKeys();
        boolean boolean23 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues12);
        java.lang.Comparable comparable25 = defaultKeyedValues12.getKey((int) (short) 0);
        java.lang.Object obj26 = defaultKeyedValues12.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0 + "'", comparable25, 0);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        int int60 = defaultKeyedValues31.getItemCount();
        defaultKeyedValues31.addValue((java.lang.Comparable) ' ', (java.lang.Number) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1);
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        java.lang.Object obj30 = defaultKeyedValues2D15.clone();
        defaultKeyedValues2D15.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 2, (java.lang.Comparable) 1L);
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
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 0.0d, (double) (byte) 0);
        defaultKeyedValues0.clear();
        int int20 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (java.lang.Number) 3);
        defaultKeyedValues0.clear();
        java.util.List list14 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 10);
        defaultKeyedValues0.removeValue(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) 5, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 1);
        org.jfree.chart.util.SortOrder sortOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
            defaultKeyedValues0.insertValue(5, (java.lang.Comparable) 1L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        int int18 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (short) 100, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D1.removeColumn(0);
        int int15 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D1.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues22.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) 1.0d);
        java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (short) 0);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 0);
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        int int15 = defaultKeyedValues2D3.getColumnCount();
        int int17 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) 10);
        java.util.List list18 = defaultKeyedValues2D3.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) "", (double) 2);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 0.0d);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        int int20 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list21 = defaultKeyedValues2D8.getColumnKeys();
        int int22 = defaultKeyedValues2D8.getColumnCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.removeValue((java.lang.Comparable) (short) 0);
        int int28 = defaultKeyedValues24.getIndex((java.lang.Comparable) false);
        defaultKeyedValues24.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues32 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues32.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list35 = defaultKeyedValues32.getKeys();
        boolean boolean36 = defaultKeyedValues24.equals((java.lang.Object) defaultKeyedValues32);
        defaultKeyedValues24.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        defaultKeyedValues24.removeValue((java.lang.Comparable) 100.0d);
        defaultKeyedValues24.insertValue(2, (java.lang.Comparable) 3, (java.lang.Number) 1.0d);
        boolean boolean46 = defaultKeyedValues0.equals((java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue(4, (java.lang.Comparable) true, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (double) 10.0f);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        defaultKeyedValues14.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list25 = defaultKeyedValues22.getKeys();
        boolean boolean26 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues14.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable34 = defaultKeyedValues14.getKey(0);
        defaultKeyedValues14.removeValue((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable38 = defaultKeyedValues14.getKey((int) (byte) 0);
        boolean boolean39 = defaultKeyedValues2D0.equals((java.lang.Object) comparable38);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (-1L) + "'", comparable34, (-1L));
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (-1L) + "'", comparable38, (-1L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        int int20 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int31 = defaultKeyedValues2D29.getColumnIndex((java.lang.Comparable) 10L);
        int int32 = defaultKeyedValues2D29.getColumnCount();
        int int34 = defaultKeyedValues2D29.getColumnIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D29.clear();
        boolean boolean36 = defaultKeyedValues2D13.equals((java.lang.Object) defaultKeyedValues2D29);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        defaultKeyedValues2D18.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        int int36 = defaultKeyedValues35.getItemCount();
        defaultKeyedValues35.clear();
        java.util.List list38 = defaultKeyedValues35.getKeys();
        java.util.List list39 = defaultKeyedValues35.getKeys();
        defaultKeyedValues35.setValue((java.lang.Comparable) "", (java.lang.Number) (short) 0);
        defaultKeyedValues35.setValue((java.lang.Comparable) "hi!", (double) 10.0f);
        java.lang.Class<?> wildcardClass46 = defaultKeyedValues35.getClass();
        boolean boolean47 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D3 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int9 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D3.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D3.getColumnKeys();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D3);
        int int14 = defaultKeyedValues2D3.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D3.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        defaultKeyedValues2D9.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        defaultKeyedValues14.setValue((java.lang.Comparable) 0.0f, (double) (byte) 10);
        java.lang.Class<?> wildcardClass39 = defaultKeyedValues14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D19.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) 10.0d);
        boolean boolean24 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0d);
        java.util.List list25 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        org.jfree.chart.util.SortOrder sortOrder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 10, (java.lang.Comparable) 100L, (java.lang.Comparable) (short) 0);
        defaultKeyedValues2D1.removeRow((java.lang.Comparable) 100L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) ' ');
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        int int28 = defaultKeyedValues27.getItemCount();
        defaultKeyedValues27.clear();
        defaultKeyedValues27.removeValue((java.lang.Comparable) 1.0d);
        int int33 = defaultKeyedValues27.getIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj34 = defaultKeyedValues27.clone();
        boolean boolean35 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues27);
        defaultKeyedValues27.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues27.addValue((java.lang.Comparable) 10.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D1.addValue((java.lang.Number) 10, (java.lang.Comparable) 4, (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        int int15 = defaultKeyedValues2D3.getColumnCount();
        int int17 = defaultKeyedValues2D3.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj18 = null;
        boolean boolean19 = defaultKeyedValues2D3.equals(obj18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        int int36 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.clear();
        int int9 = defaultKeyedValues2D1.getRowCount();
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        int int22 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 1L, (java.lang.Comparable) (short) 0);
        int int27 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        int int28 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 5);
        defaultKeyedValues2D13.clear();
        int int30 = defaultKeyedValues2D13.getRowCount();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int30 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list31 = defaultKeyedValues2D28.getRowKeys();
        int int32 = defaultKeyedValues2D28.getRowCount();
        int int34 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultKeyedValues2D28.clear();
        defaultKeyedValues2D28.removeValue((java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int40 = defaultKeyedValues2D28.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list41 = defaultKeyedValues2D28.getRowKeys();
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        java.lang.Object obj30 = defaultKeyedValues2D15.clone();
        defaultKeyedValues2D15.removeColumn((java.lang.Comparable) 0);
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
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) 6);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        java.lang.Object obj34 = defaultKeyedValues10.clone();
        defaultKeyedValues10.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 5);
        java.lang.Object obj38 = defaultKeyedValues10.clone();
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (double) (short) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 10.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (double) (-1L));
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj16 = defaultKeyedValues2D15.clone();
        defaultKeyedValues2D15.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D18.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int24 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list27 = defaultKeyedValues2D18.getColumnKeys();
        boolean boolean28 = defaultKeyedValues2D15.equals((java.lang.Object) defaultKeyedValues2D18);
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D15);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D15.removeColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        boolean boolean14 = defaultKeyedValues2D0.equals((java.lang.Object) list13);
        defaultKeyedValues2D0.setValue((java.lang.Number) 100, (java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) '#');
        int int25 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list26 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), 0.0d);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) (-1L), (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        int int16 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D7.clear();
        defaultKeyedValues2D7.clear();
        java.lang.Object obj10 = defaultKeyedValues2D7.clone();
        int int11 = defaultKeyedValues2D7.getRowCount();
        defaultKeyedValues2D7.setValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) '4');
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) '4');
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (double) 1.0f);
        int int23 = defaultKeyedValues0.getIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
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
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) 5, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        int int12 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int6 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int7 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 1);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) false);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        int int12 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        defaultKeyedValues10.clear();
        int int17 = defaultKeyedValues10.getItemCount();
        int int18 = defaultKeyedValues10.getItemCount();
        java.util.List list19 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.addValue((java.lang.Comparable) 'a', (java.lang.Number) 100.0d);
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
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 100, (double) 100L);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) (short) 0);
        boolean boolean49 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues23);
        java.lang.Object obj50 = defaultKeyedValues23.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, 10.0d);
        java.util.List list30 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        java.lang.Number number20 = defaultKeyedValues0.getValue((int) (byte) 1);
        defaultKeyedValues0.clear();
        java.lang.Number number23 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, number23);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 0.0d);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 1.0f, (java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        java.lang.Number number20 = defaultKeyedValues0.getValue((int) (byte) 1);
        defaultKeyedValues0.clear();
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        java.lang.Class<?> wildcardClass25 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues38 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues38.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues38.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues38.addValue((java.lang.Comparable) false, (java.lang.Number) (byte) 100);
        defaultKeyedValues38.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 4);
        java.lang.Object obj50 = defaultKeyedValues38.clone();
        boolean boolean51 = defaultKeyedValues2D0.equals(obj50);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        java.util.List list20 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(5, (java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        java.util.List list2 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) false);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        java.lang.Object obj59 = defaultKeyedValues10.clone();
        org.jfree.chart.util.SortOrder sortOrder60 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.clear();
        int int17 = defaultKeyedValues2D0.getRowCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list13 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues10.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int20 = defaultKeyedValues10.getItemCount();
        java.lang.Object obj21 = defaultKeyedValues10.clone();
        defaultKeyedValues10.clear();
        boolean boolean23 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        defaultKeyedValues10.addValue((java.lang.Comparable) ' ', (java.lang.Number) (byte) -1);
        defaultKeyedValues10.addValue((java.lang.Comparable) true, (java.lang.Number) (byte) 1);
        defaultKeyedValues10.clear();
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
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        int int31 = defaultKeyedValues14.getIndex((java.lang.Comparable) '4');
        defaultKeyedValues14.setValue((java.lang.Comparable) 1L, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = defaultKeyedValues14.getValue((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 'a');
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) 3, (java.lang.Comparable) 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D1.getValue((java.lang.Comparable) '#', (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int3 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) 1);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) 'a');
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        int int18 = defaultKeyedValues17.getItemCount();
        java.util.List list19 = defaultKeyedValues17.getKeys();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) list19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) 'a', (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int11 = defaultKeyedValues2D0.getRowCount();
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) false);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 10L, (java.lang.Comparable) 1.0d);
        int int18 = defaultKeyedValues2D0.getColumnCount();
        int int20 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        int int19 = defaultKeyedValues18.getItemCount();
        java.lang.Number number21 = null;
        defaultKeyedValues18.addValue((java.lang.Comparable) "", number21);
        defaultKeyedValues18.clear();
        java.util.List list24 = defaultKeyedValues18.getKeys();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) list24);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj27 = defaultKeyedValues2D26.clone();
        defaultKeyedValues2D26.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D26.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D26.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int40 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean41 = defaultKeyedValues36.equals((java.lang.Object) int40);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj43 = defaultKeyedValues2D42.clone();
        int int45 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean46 = defaultKeyedValues36.equals((java.lang.Object) int45);
        defaultKeyedValues36.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues36.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean59 = defaultKeyedValues2D26.equals((java.lang.Object) 100.0f);
        boolean boolean60 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D26);
        defaultKeyedValues2D26.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D26.clear();
        defaultKeyedValues2D26.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 0, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        java.lang.Object obj32 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (-1L));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) 10.0d);
        int int18 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj20 = defaultKeyedValues2D19.clone();
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D19.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int28 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) (byte) 100);
        int int30 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 1);
        boolean boolean31 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        java.lang.Object obj28 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + (-1) + "'", number27, (-1));
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 0);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        int int12 = defaultKeyedValues0.getItemCount();
        int int13 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        defaultKeyedValues2D1.addValue((java.lang.Number) 3, (java.lang.Comparable) (-1), (java.lang.Comparable) 10.0d);
        java.lang.Comparable comparable34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = defaultKeyedValues2D1.getRowIndex(comparable34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (-1), (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int9 = defaultKeyedValues2D0.getRowCount();
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        int int7 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 'a');
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int4 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int6 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int3 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) 1);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (double) 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (double) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        int int16 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D7.clear();
        defaultKeyedValues2D7.clear();
        java.lang.Object obj10 = defaultKeyedValues2D7.clone();
        int int11 = defaultKeyedValues2D7.getRowCount();
        defaultKeyedValues2D7.setValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) '4');
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) '4');
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        int int34 = defaultKeyedValues14.getIndex((java.lang.Comparable) 4);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        java.util.List list20 = defaultKeyedValues0.getKeys();
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (byte) 10);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) -1);
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeRow(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        int int4 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        defaultKeyedValues2D6.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D9.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int15 = defaultKeyedValues2D9.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D9.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list18 = defaultKeyedValues2D9.getColumnKeys();
        boolean boolean19 = defaultKeyedValues2D6.equals((java.lang.Object) defaultKeyedValues2D9);
        java.util.List list20 = defaultKeyedValues2D9.getRowKeys();
        int int22 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) 100);
        int int24 = defaultKeyedValues2D9.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean25 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D9);
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D28 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int30 = defaultKeyedValues2D28.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list31 = defaultKeyedValues2D28.getRowKeys();
        defaultKeyedValues2D28.clear();
        java.util.List list33 = defaultKeyedValues2D28.getRowKeys();
        defaultKeyedValues2D28.clear();
        defaultKeyedValues2D28.setValue((java.lang.Number) 0L, (java.lang.Comparable) 1.0d, (java.lang.Comparable) "");
        java.lang.Comparable comparable40 = defaultKeyedValues2D28.getRowKey((int) (short) 0);
        int int41 = defaultKeyedValues2D28.getColumnCount();
        boolean boolean42 = defaultKeyedValues2D1.equals((java.lang.Object) int41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 1.0d + "'", comparable40, 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        int int11 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list12 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) true);
        java.lang.Object obj17 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Short (java.lang.Float and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 100.0d);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByValues(sortOrder17);
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
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        int int7 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "hi!");
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, comparable11, (java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeRow((int) (short) 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (double) 3);
        java.lang.Class<?> wildcardClass28 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "hi!");
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey(1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int21 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 10L);
        int int22 = defaultKeyedValues2D19.getColumnCount();
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) (short) -1);
        int int26 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list27 = defaultKeyedValues2D19.getColumnKeys();
        int int29 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 100.0f);
        int int31 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues32 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues32.removeValue((java.lang.Comparable) (short) 0);
        int int36 = defaultKeyedValues32.getIndex((java.lang.Comparable) false);
        defaultKeyedValues32.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues40.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list43 = defaultKeyedValues40.getKeys();
        boolean boolean44 = defaultKeyedValues32.equals((java.lang.Object) defaultKeyedValues40);
        defaultKeyedValues32.setValue((java.lang.Comparable) (-1.0d), 10.0d);
        boolean boolean48 = defaultKeyedValues2D19.equals((java.lang.Object) defaultKeyedValues32);
        defaultKeyedValues2D19.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) 1, (java.lang.Comparable) '4');
        boolean boolean53 = defaultKeyedValues2D0.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = defaultKeyedValues2D0.getValue(3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "hi!" + "'", comparable17, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues2D1.equals(obj5);
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj37 = defaultKeyedValues2D36.clone();
        defaultKeyedValues2D36.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D36.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D36.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D36.clear();
        defaultKeyedValues2D36.removeColumn((java.lang.Comparable) (-1.0f));
        boolean boolean51 = defaultKeyedValues2D25.equals((java.lang.Object) defaultKeyedValues2D36);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D36.removeRow((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        int int19 = defaultKeyedValues18.getItemCount();
        java.lang.Number number21 = null;
        defaultKeyedValues18.addValue((java.lang.Comparable) "", number21);
        defaultKeyedValues18.clear();
        java.util.List list24 = defaultKeyedValues18.getKeys();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) list24);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj27 = defaultKeyedValues2D26.clone();
        defaultKeyedValues2D26.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D26.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D26.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int40 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean41 = defaultKeyedValues36.equals((java.lang.Object) int40);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj43 = defaultKeyedValues2D42.clone();
        int int45 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean46 = defaultKeyedValues36.equals((java.lang.Object) int45);
        defaultKeyedValues36.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues36.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean59 = defaultKeyedValues2D26.equals((java.lang.Object) 100.0f);
        boolean boolean60 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable62 = defaultKeyedValues2D26.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 4, (java.lang.Comparable) 0L);
        int int19 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number20 = null;
        defaultKeyedValues2D0.addValue(number20, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
        int int24 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D0.getValue((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        java.lang.Object obj26 = defaultKeyedValues10.clone();
        java.util.List list27 = defaultKeyedValues10.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue(100, (java.lang.Comparable) "", (double) (short) 0);
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
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        defaultKeyedValues0.removeValue((int) (byte) 1);
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
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        int int6 = defaultKeyedValues5.getItemCount();
        java.lang.Number number8 = null;
        defaultKeyedValues5.addValue((java.lang.Comparable) "", number8);
        defaultKeyedValues5.clear();
        java.lang.Object obj11 = defaultKeyedValues5.clone();
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        int int14 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 100, (double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (double) (byte) 1);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue(comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D1.clear();
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) 5, (java.lang.Comparable) (-1.0d));
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj3 = defaultKeyedValues2D2.clone();
        defaultKeyedValues2D2.removeColumn((java.lang.Comparable) true);
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) true);
        defaultKeyedValues2D1.clear();
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        java.util.List list35 = defaultKeyedValues2D0.getColumnKeys();
        int int36 = defaultKeyedValues2D0.getColumnCount();
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
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) 1.0d);
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (-1.0f), (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D8.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj16 = defaultKeyedValues2D8.clone();
        int int18 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) "");
        int int19 = defaultKeyedValues2D8.getRowCount();
        int int21 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) false);
        defaultKeyedValues2D8.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 10L, (java.lang.Comparable) 1.0d);
        int int26 = defaultKeyedValues2D8.getColumnCount();
        defaultKeyedValues2D8.addValue((java.lang.Number) 0, (java.lang.Comparable) true, (java.lang.Comparable) (byte) 100);
        boolean boolean31 = defaultKeyedValues2D1.equals((java.lang.Object) true);
        java.lang.Comparable comparable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue(comparable32, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        java.util.List list33 = defaultKeyedValues2D1.getColumnKeys();
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
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10 + "'", comparable18, 10);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int28 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 100L);
        java.util.List list13 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, (double) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, (double) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) "", (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        defaultKeyedValues10.addValue((java.lang.Comparable) ' ', (java.lang.Number) (byte) -1);
        defaultKeyedValues10.addValue((java.lang.Comparable) true, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue((int) 'a', (java.lang.Comparable) 4, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
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
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj9 = null;
        boolean boolean10 = defaultKeyedValues2D1.equals(obj9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues2D1.getValue((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        java.util.List list30 = defaultKeyedValues2D16.getColumnKeys();
        int int31 = defaultKeyedValues2D16.getColumnCount();
        defaultKeyedValues2D16.addValue((java.lang.Number) (short) 10, (java.lang.Comparable) 6, (java.lang.Comparable) (byte) 1);
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
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D27.clear();
        int int30 = defaultKeyedValues2D27.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean35 = defaultKeyedValues2D27.equals((java.lang.Object) defaultKeyedValues31);
        defaultKeyedValues31.removeValue((java.lang.Comparable) (-1L));
        boolean boolean38 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues31);
        int int39 = defaultKeyedValues31.getItemCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        int int19 = defaultKeyedValues18.getItemCount();
        java.lang.Number number21 = null;
        defaultKeyedValues18.addValue((java.lang.Comparable) "", number21);
        defaultKeyedValues18.clear();
        java.util.List list24 = defaultKeyedValues18.getKeys();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) list24);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj27 = defaultKeyedValues2D26.clone();
        defaultKeyedValues2D26.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D26.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D26.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int40 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean41 = defaultKeyedValues36.equals((java.lang.Object) int40);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj43 = defaultKeyedValues2D42.clone();
        int int45 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean46 = defaultKeyedValues36.equals((java.lang.Object) int45);
        defaultKeyedValues36.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues36.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean59 = defaultKeyedValues2D26.equals((java.lang.Object) 100.0f);
        boolean boolean60 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D26);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        java.lang.Object obj24 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        java.util.List list18 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj19 = defaultKeyedValues2D0.clone();
        java.util.List list20 = defaultKeyedValues2D0.getColumnKeys();
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        int int36 = defaultKeyedValues2D0.getRowCount();
        int int37 = defaultKeyedValues2D0.getColumnCount();
        int int39 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        int int13 = defaultKeyedValues8.getItemCount();
        boolean boolean14 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D1.getValue((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 10, (java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 6");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        int int18 = defaultKeyedValues17.getItemCount();
        java.lang.Object obj19 = null;
        boolean boolean20 = defaultKeyedValues17.equals(obj19);
        defaultKeyedValues17.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues17.setValue((java.lang.Comparable) 10L, (double) (-1.0f));
        boolean boolean26 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues17);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues8.getIndex((java.lang.Comparable) false);
        int int13 = defaultKeyedValues8.getItemCount();
        boolean boolean14 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues8);
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            int int23 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Long (java.lang.Float and java.lang.Long are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        boolean boolean6 = defaultKeyedValues2D1.equals((java.lang.Object) (-1.0f));
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D1.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        int int16 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) ' ');
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        defaultKeyedValues10.removeValue((java.lang.Comparable) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) 100, 1.0d);
        java.util.List list31 = defaultKeyedValues27.getKeys();
        boolean boolean32 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues27);
        defaultKeyedValues10.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = null;
        boolean boolean5 = defaultKeyedValues2D1.equals(obj4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) true);
        java.lang.Comparable comparable11 = defaultKeyedValues2D1.getRowKey(0);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D1.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) 0 + "'", comparable11, (byte) 0);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) true);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) '#');
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
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int28 = defaultKeyedValues2D26.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean29 = defaultKeyedValues24.equals((java.lang.Object) int28);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj31 = defaultKeyedValues2D30.clone();
        int int33 = defaultKeyedValues2D30.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean34 = defaultKeyedValues24.equals((java.lang.Object) int33);
        defaultKeyedValues24.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues24.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues24.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 100, (double) 100L);
        boolean boolean47 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues24);
        defaultKeyedValues24.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.addValue((java.lang.Number) 4, (java.lang.Comparable) 100, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 0.0f, (double) 100.0f);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) "hi!");
        int int12 = defaultKeyedValues2D1.getRowCount();
        int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) false, 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        int int19 = defaultKeyedValues18.getItemCount();
        java.lang.Number number21 = null;
        defaultKeyedValues18.addValue((java.lang.Comparable) "", number21);
        defaultKeyedValues18.clear();
        java.util.List list24 = defaultKeyedValues18.getKeys();
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) list24);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj27 = defaultKeyedValues2D26.clone();
        defaultKeyedValues2D26.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D26.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D26.removeColumn((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int40 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean41 = defaultKeyedValues36.equals((java.lang.Object) int40);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj43 = defaultKeyedValues2D42.clone();
        int int45 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean46 = defaultKeyedValues36.equals((java.lang.Object) int45);
        defaultKeyedValues36.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) 0L);
        defaultKeyedValues36.addValue((java.lang.Comparable) (byte) -1, (double) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) (-1L));
        boolean boolean59 = defaultKeyedValues2D26.equals((java.lang.Object) 100.0f);
        boolean boolean60 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D26);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, 0.0d);
        defaultKeyedValues0.removeValue(3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int10 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list11 = defaultKeyedValues2D8.getRowKeys();
        defaultKeyedValues2D8.clear();
        int int14 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list15 = defaultKeyedValues2D8.getRowKeys();
        defaultKeyedValues2D8.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D8.clear();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) (short) 10);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj7 = defaultKeyedValues2D6.clone();
        int int9 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 1);
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        java.util.List list11 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 'a');
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (short) 100);
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), number13);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1L);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 100);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int15 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean16 = defaultKeyedValues11.equals((java.lang.Object) int15);
        java.lang.Object obj17 = defaultKeyedValues11.clone();
        defaultKeyedValues11.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues11.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues11.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues11.removeValue((java.lang.Comparable) (byte) 100);
        int int30 = defaultKeyedValues11.getIndex((java.lang.Comparable) 100);
        int int31 = defaultKeyedValues11.getItemCount();
        boolean boolean32 = defaultKeyedValues0.equals((java.lang.Object) int31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0d);
        int int12 = defaultKeyedValues2D0.getRowCount();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int15 = defaultKeyedValues2D0.getRowCount();
        java.util.List list16 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 0);
        java.lang.Object obj21 = defaultKeyedValues2D0.clone();
        int int23 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        int int24 = defaultKeyedValues2D0.getRowCount();
        int int26 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        int int28 = defaultKeyedValues27.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.removeValue((java.lang.Comparable) (short) 0);
        int int33 = defaultKeyedValues29.getIndex((java.lang.Comparable) false);
        defaultKeyedValues29.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues37.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list40 = defaultKeyedValues37.getKeys();
        boolean boolean41 = defaultKeyedValues29.equals((java.lang.Object) defaultKeyedValues37);
        boolean boolean42 = defaultKeyedValues27.equals((java.lang.Object) defaultKeyedValues37);
        defaultKeyedValues37.removeValue((java.lang.Comparable) (byte) 10);
        defaultKeyedValues37.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 100.0f);
        defaultKeyedValues37.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1L));
        boolean boolean51 = defaultKeyedValues2D0.equals((java.lang.Object) (-1L));
        int int53 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        defaultKeyedValues16.insertValue(0, (java.lang.Comparable) 1.0d, (java.lang.Number) 10.0f);
        defaultKeyedValues16.removeValue((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0f);
        int int11 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (short) 0, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) false, (java.lang.Comparable) "");
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (double) (short) -1);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        java.util.List list36 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 2, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (-1.0d));
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0d) + "'", comparable13, (-1.0d));
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
        java.lang.Number number5 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, number5);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        defaultKeyedValues2D10.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (short) 10, (java.lang.Comparable) '#');
        int int21 = defaultKeyedValues2D10.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder16);
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
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (double) (byte) 0);
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
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        java.lang.Object obj30 = defaultKeyedValues2D15.clone();
        int int32 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) (byte) 100);
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
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        boolean boolean10 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, 0.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues6.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        boolean boolean15 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        int int17 = defaultKeyedValues6.getIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues6.addValue((java.lang.Comparable) (-1L), (double) (byte) 100);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 100);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), number13);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0d);
        java.lang.Number number18 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, number18);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 52.0d);
        int int22 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        defaultKeyedValues10.addValue((java.lang.Comparable) 100.0f, (double) (short) 0);
        defaultKeyedValues10.removeValue(0);
        defaultKeyedValues10.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D39 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj40 = defaultKeyedValues2D39.clone();
        defaultKeyedValues2D39.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D39.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int48 = defaultKeyedValues2D39.getRowIndex((java.lang.Comparable) (byte) 100);
        java.util.List list49 = defaultKeyedValues2D39.getColumnKeys();
        int int51 = defaultKeyedValues2D39.getRowIndex((java.lang.Comparable) "");
        java.util.List list52 = defaultKeyedValues2D39.getColumnKeys();
        boolean boolean53 = defaultKeyedValues10.equals((java.lang.Object) list52);
        java.lang.Object obj54 = defaultKeyedValues10.clone();
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
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable41 = defaultKeyedValues10.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        java.lang.Comparable comparable35 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 10.0f);
        int int39 = defaultKeyedValues0.getItemCount();
        int int40 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (-1L) + "'", comparable35, (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable15 = defaultKeyedValues2D0.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) -1 + "'", comparable15, (short) -1);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) "hi!");
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (short) 100);
        int int14 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D1.getValue((int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        java.lang.Object obj57 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable59 = defaultKeyedValues2D1.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '#');
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) 3, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        java.util.List list28 = defaultKeyedValues2D18.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D18.getRowKey((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getColumnKeys();
        int int6 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 4);
        java.lang.Object obj7 = defaultKeyedValues2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (java.lang.Number) (-1));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        defaultKeyedValues10.clear();
        defaultKeyedValues10.removeValue((java.lang.Comparable) 4);
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder19);
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
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Number number3 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) "", number3);
        defaultKeyedValues0.clear();
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int12 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean13 = defaultKeyedValues8.equals((java.lang.Object) int12);
        java.lang.Object obj14 = defaultKeyedValues8.clone();
        defaultKeyedValues8.setValue((java.lang.Comparable) 0L, (java.lang.Number) 0.0d);
        boolean boolean18 = defaultKeyedValues2D7.equals((java.lang.Object) 0.0d);
        defaultKeyedValues2D7.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 1L, (java.lang.Comparable) 100.0f);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        int int5 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (-1.0f), (java.lang.Comparable) true);
        int int10 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int4 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (byte) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj5 = defaultKeyedValues2D4.clone();
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D4.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean14 = defaultKeyedValues0.equals((java.lang.Object) (short) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        int int16 = defaultKeyedValues15.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        int int21 = defaultKeyedValues17.getIndex((java.lang.Comparable) false);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list28 = defaultKeyedValues25.getKeys();
        boolean boolean29 = defaultKeyedValues17.equals((java.lang.Object) defaultKeyedValues25);
        boolean boolean30 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues25);
        java.util.List list31 = defaultKeyedValues25.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj33 = defaultKeyedValues2D32.clone();
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean38 = defaultKeyedValues25.equals((java.lang.Object) (short) 10);
        defaultKeyedValues25.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list43 = defaultKeyedValues25.getKeys();
        java.util.List list44 = defaultKeyedValues25.getKeys();
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        defaultKeyedValues25.addValue((java.lang.Comparable) 0, (java.lang.Number) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues49 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues49.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list52 = defaultKeyedValues49.getKeys();
        defaultKeyedValues49.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues49.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj59 = defaultKeyedValues49.clone();
        defaultKeyedValues49.clear();
        int int62 = defaultKeyedValues49.getIndex((java.lang.Comparable) (-1.0f));
        java.util.List list63 = defaultKeyedValues49.getKeys();
        boolean boolean64 = defaultKeyedValues25.equals((java.lang.Object) list63);
        java.lang.Object obj65 = defaultKeyedValues25.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues2D1.getValue(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        int int4 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) -1);
        java.lang.Number number7 = null;
        defaultKeyedValues2D1.addValue(number7, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 0);
        int int17 = defaultKeyedValues13.getIndex((java.lang.Comparable) false);
        defaultKeyedValues13.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list24 = defaultKeyedValues21.getKeys();
        boolean boolean25 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues21);
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues13.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable33 = defaultKeyedValues13.getKey(0);
        defaultKeyedValues13.addValue((java.lang.Comparable) 1.0f, (double) 100);
        java.lang.Object obj37 = defaultKeyedValues13.clone();
        boolean boolean38 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues13);
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (double) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (-1L) + "'", comparable33, (-1L));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        defaultKeyedValues31.setValue((java.lang.Comparable) '4', (double) 100);
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
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: true");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        int int19 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) (byte) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) (short) 10);
        defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj22 = defaultKeyedValues2D21.clone();
        int int24 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj25 = defaultKeyedValues2D21.clone();
        java.util.List list26 = defaultKeyedValues2D21.getColumnKeys();
        java.util.List list27 = defaultKeyedValues2D21.getColumnKeys();
        boolean boolean28 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D21);
        org.jfree.chart.util.SortOrder sortOrder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0f, (double) (-1.0f));
        int int10 = defaultKeyedValues0.getItemCount();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        java.lang.Number number22 = defaultKeyedValues0.getValue(0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 100);
        int int27 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj30 = defaultKeyedValues2D29.clone();
        defaultKeyedValues2D29.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D29.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean38 = defaultKeyedValues2D29.equals((java.lang.Object) 1L);
        defaultKeyedValues2D29.removeColumn((java.lang.Comparable) (byte) 100);
        int int41 = defaultKeyedValues2D29.getRowCount();
        int int43 = defaultKeyedValues2D29.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable48 = defaultKeyedValues2D29.getRowKey((int) (byte) 0);
        boolean boolean49 = defaultKeyedValues0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder50 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + (short) 0 + "'", number22, (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + comparable48 + "' != '" + 10.0d + "'", comparable48, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int5 = defaultKeyedValues2D0.getRowCount();
        boolean boolean7 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 1);
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        defaultKeyedValues2D37.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 4);
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
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        java.util.List list4 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        int int6 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues2D1.equals(obj5);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 1.0f, comparable8, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        java.util.List list4 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D(true);
        boolean boolean7 = defaultKeyedValues0.equals((java.lang.Object) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 1);
        defaultKeyedValues0.removeValue(0);
        java.util.List list13 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues0.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues10.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.clear();
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) ' ');
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) 100L);
        int int11 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (double) 'a');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues14.getIndex((java.lang.Comparable) false);
        defaultKeyedValues14.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list25 = defaultKeyedValues22.getKeys();
        boolean boolean26 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues14.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 10L);
        java.lang.Comparable comparable34 = defaultKeyedValues14.getKey(0);
        java.util.List list35 = defaultKeyedValues14.getKeys();
        defaultKeyedValues14.setValue((java.lang.Comparable) 2, (double) (byte) 1);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues14);
        org.jfree.chart.util.SortOrder sortOrder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues14.sortByKeys(sortOrder40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (-1L) + "'", comparable34, (-1L));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D1.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) "hi!", (java.lang.Comparable) 100.0d);
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 100);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = defaultKeyedValues2D1.getRowIndex(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        boolean boolean7 = defaultKeyedValues2D1.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D1.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) 0.0f, (java.lang.Comparable) "hi!");
        java.lang.Object obj12 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        java.lang.Number number32 = defaultKeyedValues14.getValue((int) (byte) 1);
        java.lang.Comparable comparable34 = defaultKeyedValues14.getKey((int) (short) 1);
        defaultKeyedValues14.insertValue((int) (short) 1, (java.lang.Comparable) (short) 10, 52.0d);
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
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 10.0d + "'", number32, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (-1.0d) + "'", comparable34, (-1.0d));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        defaultKeyedValues10.clear();
        java.util.List list17 = defaultKeyedValues10.getKeys();
        defaultKeyedValues10.addValue((java.lang.Comparable) 10.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D12.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D12.removeColumn((java.lang.Comparable) 1);
        java.util.List list19 = defaultKeyedValues2D12.getColumnKeys();
        defaultKeyedValues2D12.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D12.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D12.removeColumn(1);
        boolean boolean30 = defaultKeyedValues0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) 10.0f);
        java.util.List list28 = defaultKeyedValues2D16.getRowKeys();
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
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 10.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj22 = defaultKeyedValues2D21.clone();
        defaultKeyedValues2D21.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D21.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj29 = defaultKeyedValues2D21.clone();
        int int31 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) "");
        int int32 = defaultKeyedValues2D21.getColumnCount();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) int32);
        int int35 = defaultKeyedValues0.getIndex((java.lang.Comparable) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowCount();
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (byte) 100);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues8.getKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        int int5 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        int int7 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list8 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        int int10 = defaultKeyedValues2D1.getRowCount();
        int int11 = defaultKeyedValues2D1.getRowCount();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) '4', (java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        defaultKeyedValues10.removeValue((java.lang.Comparable) false);
        int int20 = defaultKeyedValues10.getItemCount();
        defaultKeyedValues10.addValue((java.lang.Comparable) 0, 1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        java.util.List list38 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        defaultKeyedValues10.clear();
        java.util.List list25 = defaultKeyedValues10.getKeys();
        int int26 = defaultKeyedValues10.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.sortByKeys(sortOrder27);
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
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 'a');
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) -1);
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
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
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
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1L), (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 1.0f);
        org.jfree.chart.util.SortOrder sortOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        int int21 = defaultKeyedValues2D0.getRowCount();
        java.lang.Comparable comparable23 = defaultKeyedValues2D0.getColumnKey(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 1.0f + "'", comparable23, 1.0f);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
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
        int int15 = defaultKeyedValues2D3.getColumnCount();
        defaultKeyedValues2D3.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D3.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D7 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D7.clear();
        defaultKeyedValues2D7.clear();
        java.lang.Object obj10 = defaultKeyedValues2D7.clone();
        int int11 = defaultKeyedValues2D7.getRowCount();
        defaultKeyedValues2D7.setValue((java.lang.Number) 4, (java.lang.Comparable) true, (java.lang.Comparable) '4');
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) '4');
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (double) 1.0f);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 4);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        defaultKeyedValues2D3.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 1.0f, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D3.removeRow((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 100);
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
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
        int int23 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 0);
        boolean boolean9 = defaultKeyedValues2D0.equals((java.lang.Object) 1L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int12 = defaultKeyedValues2D0.getRowCount();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable19 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
        java.util.List list20 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int7 = defaultKeyedValues2D0.getRowCount();
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        int int41 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable43 = defaultKeyedValues0.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) (-1.0d));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj33 = defaultKeyedValues2D32.clone();
        int int35 = defaultKeyedValues2D32.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj36 = defaultKeyedValues2D32.clone();
        java.util.List list37 = defaultKeyedValues2D32.getColumnKeys();
        java.lang.Object obj38 = defaultKeyedValues2D32.clone();
        java.util.List list39 = defaultKeyedValues2D32.getRowKeys();
        defaultKeyedValues2D32.setValue((java.lang.Number) 2, (java.lang.Comparable) 1.0d, (java.lang.Comparable) true);
        boolean boolean44 = defaultKeyedValues0.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int4 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = defaultKeyedValues0.equals(obj5);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 100L);
        java.util.List list13 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, (double) 0);
        int int17 = defaultKeyedValues0.getItemCount();
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int21 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean22 = defaultKeyedValues17.equals((java.lang.Object) int21);
        java.lang.Object obj23 = defaultKeyedValues17.clone();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues17.setValue((java.lang.Comparable) 'a', (double) 100);
        defaultKeyedValues17.addValue((java.lang.Comparable) (byte) 100, (double) (-1));
        java.lang.Object obj32 = null;
        boolean boolean33 = defaultKeyedValues17.equals(obj32);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1.0d), 100.0d);
        int int38 = defaultKeyedValues17.getIndex((java.lang.Comparable) 5);
        java.lang.Comparable comparable40 = defaultKeyedValues17.getKey((int) (byte) 1);
        java.lang.Object obj41 = defaultKeyedValues17.clone();
        boolean boolean42 = defaultKeyedValues2D0.equals(obj41);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (byte) 100 + "'", comparable40, (byte) 100);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
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
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        defaultKeyedValues10.addValue((java.lang.Comparable) 100.0f, (double) (short) 0);
        defaultKeyedValues10.removeValue(0);
        int int36 = defaultKeyedValues10.getItemCount();
        java.lang.Object obj37 = defaultKeyedValues10.clone();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (double) (short) 10);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 10L);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowCount();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        int int11 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 1);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 100, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 10L, (java.lang.Comparable) "hi!");
        int int12 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) true, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int2 = defaultKeyedValues2D1.getColumnCount();
        int int3 = defaultKeyedValues2D1.getRowCount();
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 100);
        int int8 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        defaultKeyedValues0.removeValue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) '#', (java.lang.Number) 100L);
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
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = defaultKeyedValues2D0.equals(obj6);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable15 = defaultKeyedValues2D0.getColumnKey(0);
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) -1 + "'", comparable15, (short) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj2 = null;
        boolean boolean3 = defaultKeyedValues0.equals(obj2);
        defaultKeyedValues0.clear();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 'a');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) 10L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        int int4 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int7 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int4 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        defaultKeyedValues5.setValue((java.lang.Comparable) 2, (double) 1.0f);
        int int13 = defaultKeyedValues5.getItemCount();
        defaultKeyedValues5.removeValue((java.lang.Comparable) 10.0f);
        defaultKeyedValues5.removeValue((java.lang.Comparable) 10);
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        defaultKeyedValues2D0.removeRow(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable41 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int3 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) 1);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        int int9 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 1);
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues6 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues6.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list9 = defaultKeyedValues6.getKeys();
        defaultKeyedValues6.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        java.lang.Object obj13 = defaultKeyedValues6.clone();
        java.lang.Object obj14 = defaultKeyedValues6.clone();
        boolean boolean15 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues6);
        int int17 = defaultKeyedValues6.getIndex((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues6.insertValue((int) 'a', comparable19, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 100.0f);
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (-1.0d));
        java.util.List list16 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
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
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) 5, (java.lang.Comparable) 1);
        java.util.List list20 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) (-1), (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 100);
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
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
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable15, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 100);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (double) (byte) 100);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D1.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj9 = defaultKeyedValues2D8.clone();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) true);
        boolean boolean12 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D8);
        int int13 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj15 = defaultKeyedValues2D1.clone();
        int int16 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list17 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 100);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), number13);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        int int16 = defaultKeyedValues15.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        int int21 = defaultKeyedValues17.getIndex((java.lang.Comparable) false);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list28 = defaultKeyedValues25.getKeys();
        boolean boolean29 = defaultKeyedValues17.equals((java.lang.Object) defaultKeyedValues25);
        boolean boolean30 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues25);
        java.util.List list31 = defaultKeyedValues25.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj33 = defaultKeyedValues2D32.clone();
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean38 = defaultKeyedValues25.equals((java.lang.Object) (short) 10);
        defaultKeyedValues25.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D43.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D43.removeColumn((java.lang.Comparable) 1);
        java.util.List list50 = defaultKeyedValues2D43.getColumnKeys();
        defaultKeyedValues2D43.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D43.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (byte) 1);
        boolean boolean59 = defaultKeyedValues25.equals((java.lang.Object) (short) 1);
        int int61 = defaultKeyedValues25.getIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues25.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (-1));
        boolean boolean65 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        defaultKeyedValues25.insertValue(0, (java.lang.Comparable) (short) 100, (java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list3 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 1.0f);
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj16 = defaultKeyedValues2D15.clone();
        defaultKeyedValues2D15.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D18.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        int int24 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list27 = defaultKeyedValues2D18.getColumnKeys();
        boolean boolean28 = defaultKeyedValues2D15.equals((java.lang.Object) defaultKeyedValues2D18);
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D15);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (double) 10);
        java.util.List list33 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        java.util.List list3 = defaultKeyedValues2D1.getRowKeys();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list5 = defaultKeyedValues2D1.getRowKeys();
        int int6 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) -1);
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        defaultKeyedValues10.insertValue(3, (java.lang.Comparable) 2, (double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj10 = defaultKeyedValues2D1.clone();
        int int12 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        java.util.List list15 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1L));
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) 0L, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Short (java.lang.Float and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0L, (java.lang.Comparable) 0.0d);
        int int24 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list25 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list3 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj5 = defaultKeyedValues2D4.clone();
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D4.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 10L);
        boolean boolean14 = defaultKeyedValues0.equals((java.lang.Object) (short) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        int int16 = defaultKeyedValues15.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.removeValue((java.lang.Comparable) (short) 0);
        int int21 = defaultKeyedValues17.getIndex((java.lang.Comparable) false);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1L), (java.lang.Number) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.removeValue((java.lang.Comparable) (short) 0);
        java.util.List list28 = defaultKeyedValues25.getKeys();
        boolean boolean29 = defaultKeyedValues17.equals((java.lang.Object) defaultKeyedValues25);
        boolean boolean30 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues25);
        java.util.List list31 = defaultKeyedValues25.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj33 = defaultKeyedValues2D32.clone();
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D32.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean38 = defaultKeyedValues25.equals((java.lang.Object) (short) 10);
        defaultKeyedValues25.insertValue((int) (short) 0, (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 1);
        java.util.List list43 = defaultKeyedValues25.getKeys();
        java.util.List list44 = defaultKeyedValues25.getKeys();
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        int int47 = defaultKeyedValues25.getIndex((java.lang.Comparable) 0L);
        java.lang.Comparable comparable48 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues25.setValue(comparable48, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) false, (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.addValue((java.lang.Number) 10.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 2);
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1.0d));
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        int int11 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 0);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 4, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D1.getValue((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D2 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int4 = defaultKeyedValues2D2.getColumnIndex((java.lang.Comparable) 10L);
        boolean boolean5 = defaultKeyedValues0.equals((java.lang.Object) int4);
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (-1.0f), (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10);
        defaultKeyedValues0.clear();
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (short) 1);
        int int27 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues0.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1.0d + "'", comparable21, 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }
}

