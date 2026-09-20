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
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj7 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj9 = keyedObjects2D8.clone();
        java.util.List list10 = keyedObjects2D8.getColumnKeys();
        int int11 = keyedObjects2D8.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        boolean boolean14 = keyedObjects2D12.equals((java.lang.Object) (byte) 10);
        boolean boolean16 = keyedObjects2D12.equals((java.lang.Object) 10.0d);
        keyedObjects2D8.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) 'a');
        java.util.List list21 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        int int11 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int7 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) '4', (java.lang.Comparable) (short) 100);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        java.util.List list6 = keyedObjects2D0.getColumnKeys();
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        boolean boolean10 = keyedObjects2D8.equals((java.lang.Object) (byte) 10);
        boolean boolean12 = keyedObjects2D8.equals((java.lang.Object) (-1L));
        keyedObjects2D8.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        int int16 = keyedObjects2D8.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj18 = keyedObjects2D17.clone();
        int int20 = keyedObjects2D17.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj21 = keyedObjects2D17.clone();
        int int22 = keyedObjects2D17.getColumnCount();
        keyedObjects2D17.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int27 = keyedObjects2D17.getRowCount();
        int int29 = keyedObjects2D17.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list30 = keyedObjects2D17.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj32 = keyedObjects2D31.clone();
        int int34 = keyedObjects2D31.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D31.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int39 = keyedObjects2D31.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj40 = keyedObjects2D31.clone();
        java.lang.Comparable comparable41 = null;
        int int42 = keyedObjects2D31.getColumnIndex(comparable41);
        keyedObjects2D17.setObject((java.lang.Object) int42, (java.lang.Comparable) 0, (java.lang.Comparable) 0);
        int int47 = keyedObjects2D17.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj49 = keyedObjects2D48.clone();
        int int51 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj52 = keyedObjects2D48.clone();
        int int53 = keyedObjects2D48.getColumnCount();
        keyedObjects2D48.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D48.removeColumn(0);
        int int61 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int62 = keyedObjects2D48.getRowCount();
        boolean boolean63 = keyedObjects2D17.equals((java.lang.Object) keyedObjects2D48);
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0f);
        java.util.List list67 = keyedObjects2D8.getColumnKeys();
        boolean boolean68 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        java.lang.Object obj69 = null;
        boolean boolean70 = keyedObjects2D8.equals(obj69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int5 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        java.util.List list9 = keyedObjects2D6.getColumnKeys();
        boolean boolean10 = keyedObjects2D0.equals((java.lang.Object) list9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        boolean boolean13 = keyedObjects2D11.equals((java.lang.Object) (byte) 10);
        java.util.List list14 = keyedObjects2D11.getColumnKeys();
        java.util.List list15 = keyedObjects2D11.getRowKeys();
        java.lang.Object obj16 = keyedObjects2D11.clone();
        int int17 = keyedObjects2D11.getColumnCount();
        int int18 = keyedObjects2D11.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D11, (java.lang.Comparable) '4', (java.lang.Comparable) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        boolean boolean24 = keyedObjects2D22.equals((java.lang.Object) (byte) 10);
        boolean boolean26 = keyedObjects2D22.equals((java.lang.Object) (-1L));
        java.lang.Object obj27 = keyedObjects2D22.clone();
        int int28 = keyedObjects2D22.getColumnCount();
        java.util.List list29 = keyedObjects2D22.getColumnKeys();
        java.util.List list30 = keyedObjects2D22.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        boolean boolean33 = keyedObjects2D31.equals((java.lang.Object) (byte) 10);
        boolean boolean35 = keyedObjects2D31.equals((java.lang.Object) (-1L));
        int int37 = keyedObjects2D31.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj38 = keyedObjects2D31.clone();
        java.util.List list39 = keyedObjects2D31.getColumnKeys();
        keyedObjects2D22.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj44 = keyedObjects2D43.clone();
        java.util.List list45 = keyedObjects2D43.getColumnKeys();
        int int46 = keyedObjects2D43.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        boolean boolean49 = keyedObjects2D47.equals((java.lang.Object) (byte) 10);
        boolean boolean51 = keyedObjects2D47.equals((java.lang.Object) 10.0d);
        keyedObjects2D43.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int56 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 100L);
        keyedObjects2D43.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0);
        java.util.List list60 = keyedObjects2D43.getRowKeys();
        keyedObjects2D22.addObject((java.lang.Object) list60, (java.lang.Comparable) ' ', (java.lang.Comparable) 10L);
        java.util.List list64 = keyedObjects2D22.getColumnKeys();
        keyedObjects2D11.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) 3, (java.lang.Comparable) 10);
        java.util.List list68 = keyedObjects2D11.getColumnKeys();
        java.lang.Class<?> wildcardClass69 = list68.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getColumnKeys();
        int int17 = keyedObjects2D14.getRowCount();
        boolean boolean18 = keyedObjects2D12.equals((java.lang.Object) int17);
        java.util.List list19 = keyedObjects2D12.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj25 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        boolean boolean28 = keyedObjects2D26.equals((java.lang.Object) (byte) 10);
        java.util.List list29 = keyedObjects2D26.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        boolean boolean32 = keyedObjects2D30.equals((java.lang.Object) (byte) 10);
        boolean boolean34 = keyedObjects2D30.equals((java.lang.Object) (-1L));
        java.lang.Object obj35 = keyedObjects2D30.clone();
        int int36 = keyedObjects2D30.getColumnCount();
        keyedObjects2D26.setObject((java.lang.Object) int36, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        boolean boolean42 = keyedObjects2D40.equals((java.lang.Object) (byte) 10);
        boolean boolean44 = keyedObjects2D40.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj46 = keyedObjects2D45.clone();
        int int48 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list49 = keyedObjects2D45.getRowKeys();
        keyedObjects2D40.setObject((java.lang.Object) list49, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int54 = keyedObjects2D40.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D26.setObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj59 = keyedObjects2D58.clone();
        int int61 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list62 = keyedObjects2D58.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj64 = keyedObjects2D63.clone();
        int int66 = keyedObjects2D63.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D63.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D70 = new org.jfree.data.KeyedObjects2D();
        boolean boolean72 = keyedObjects2D70.equals((java.lang.Object) (byte) 10);
        boolean boolean74 = keyedObjects2D70.equals((java.lang.Object) (-1L));
        int int76 = keyedObjects2D70.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj77 = keyedObjects2D70.clone();
        boolean boolean78 = keyedObjects2D63.equals((java.lang.Object) keyedObjects2D70);
        java.lang.Object obj79 = keyedObjects2D70.clone();
        keyedObjects2D58.setObject((java.lang.Object) keyedObjects2D70, (java.lang.Comparable) '#', (java.lang.Comparable) (-1));
        java.lang.Object obj83 = null;
        keyedObjects2D58.setObject(obj83, (java.lang.Comparable) false, (java.lang.Comparable) 2);
        int int87 = keyedObjects2D58.getColumnCount();
        boolean boolean88 = keyedObjects2D26.equals((java.lang.Object) keyedObjects2D58);
        keyedObjects2D0.setObject((java.lang.Object) boolean88, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 0);
        java.lang.Comparable comparable93 = keyedObjects2D0.getRowKey((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + comparable93 + "' != '" + (short) 100 + "'", comparable93, (short) 100);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean9 = keyedObjects2D7.equals((java.lang.Object) (byte) 10);
        boolean boolean11 = keyedObjects2D7.equals((java.lang.Object) (-1L));
        int int13 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj14 = keyedObjects2D7.clone();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.lang.Object obj16 = keyedObjects2D7.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj18 = keyedObjects2D17.clone();
        java.util.List list19 = keyedObjects2D17.getColumnKeys();
        java.lang.Class<?> wildcardClass20 = keyedObjects2D17.getClass();
        keyedObjects2D7.setObject((java.lang.Object) wildcardClass20, (java.lang.Comparable) 1L, (java.lang.Comparable) false);
        int int25 = keyedObjects2D7.getRowIndex((java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        java.util.List list28 = keyedObjects2D26.getRowKeys();
        int int30 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj32 = keyedObjects2D31.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj34 = keyedObjects2D33.clone();
        java.util.List list35 = keyedObjects2D33.getColumnKeys();
        int int36 = keyedObjects2D33.getRowCount();
        boolean boolean37 = keyedObjects2D31.equals((java.lang.Object) int36);
        java.util.List list38 = keyedObjects2D31.getColumnKeys();
        boolean boolean39 = keyedObjects2D26.equals((java.lang.Object) list38);
        keyedObjects2D7.setObject((java.lang.Object) keyedObjects2D26, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) true);
        java.lang.Object obj46 = keyedObjects2D26.clone();
        int int48 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) "", (java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj10 = keyedObjects2D9.clone();
        java.util.List list11 = keyedObjects2D9.getColumnKeys();
        int int12 = keyedObjects2D9.getRowCount();
        int int13 = keyedObjects2D9.getColumnCount();
        java.util.List list14 = keyedObjects2D9.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        boolean boolean17 = keyedObjects2D15.equals((java.lang.Object) (byte) 10);
        boolean boolean19 = keyedObjects2D15.equals((java.lang.Object) (-1L));
        java.lang.Object obj20 = keyedObjects2D15.clone();
        java.util.List list21 = keyedObjects2D15.getColumnKeys();
        boolean boolean22 = keyedObjects2D9.equals((java.lang.Object) keyedObjects2D15);
        java.lang.Object obj23 = keyedObjects2D9.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        int int27 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        boolean boolean30 = keyedObjects2D28.equals((java.lang.Object) (byte) 10);
        boolean boolean32 = keyedObjects2D28.equals((java.lang.Object) (-1L));
        int int34 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean36 = keyedObjects2D28.equals((java.lang.Object) 0);
        java.util.List list37 = keyedObjects2D28.getRowKeys();
        int int39 = keyedObjects2D28.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj41 = keyedObjects2D40.clone();
        int int43 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj44 = keyedObjects2D40.clone();
        int int45 = keyedObjects2D40.getColumnCount();
        keyedObjects2D40.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int50 = keyedObjects2D40.getRowCount();
        int int52 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list53 = keyedObjects2D40.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj55 = keyedObjects2D54.clone();
        java.util.List list56 = keyedObjects2D54.getRowKeys();
        int int58 = keyedObjects2D54.getRowIndex((java.lang.Comparable) 10.0d);
        keyedObjects2D40.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        boolean boolean64 = keyedObjects2D62.equals((java.lang.Object) (byte) 10);
        java.util.List list65 = keyedObjects2D62.getRowKeys();
        keyedObjects2D40.addObject((java.lang.Object) list65, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 3);
        keyedObjects2D28.setObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (short) 100);
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 'a');
        int int76 = keyedObjects2D9.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) "");
        java.lang.Comparable comparable17 = keyedObjects2D0.getColumnKey((int) (short) 1);
        keyedObjects2D0.removeColumn(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "" + "'", comparable17, "");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) 0);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        int int10 = keyedObjects2D0.getColumnCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) ' ');
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        int int16 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D13.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        boolean boolean22 = keyedObjects2D20.equals((java.lang.Object) (byte) 10);
        boolean boolean24 = keyedObjects2D20.equals((java.lang.Object) (-1L));
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj27 = keyedObjects2D20.clone();
        boolean boolean28 = keyedObjects2D13.equals((java.lang.Object) keyedObjects2D20);
        java.lang.Object obj29 = keyedObjects2D20.clone();
        java.util.List list30 = keyedObjects2D20.getColumnKeys();
        int int32 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj34 = keyedObjects2D33.clone();
        int int36 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        int int38 = keyedObjects2D33.getColumnCount();
        keyedObjects2D33.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int43 = keyedObjects2D33.getRowCount();
        int int45 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 100.0d);
        int int46 = keyedObjects2D33.getRowCount();
        keyedObjects2D20.setObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) '#', (java.lang.Comparable) '#');
        boolean boolean50 = keyedObjects2D0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean9 = keyedObjects2D7.equals((java.lang.Object) (byte) 10);
        boolean boolean11 = keyedObjects2D7.equals((java.lang.Object) (-1L));
        int int13 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj14 = keyedObjects2D7.clone();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.lang.Object obj16 = keyedObjects2D7.clone();
        java.util.List list17 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        boolean boolean20 = keyedObjects2D18.equals((java.lang.Object) (byte) 10);
        boolean boolean21 = keyedObjects2D7.equals((java.lang.Object) boolean20);
        java.util.List list22 = keyedObjects2D7.getRowKeys();
        int int23 = keyedObjects2D7.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj25 = keyedObjects2D24.clone();
        int int27 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj28 = keyedObjects2D24.clone();
        int int29 = keyedObjects2D24.getColumnCount();
        keyedObjects2D24.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D24.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj39 = keyedObjects2D38.clone();
        java.util.List list40 = keyedObjects2D38.getColumnKeys();
        int int41 = keyedObjects2D38.getRowCount();
        boolean boolean42 = keyedObjects2D36.equals((java.lang.Object) int41);
        java.util.List list43 = keyedObjects2D36.getColumnKeys();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj49 = keyedObjects2D24.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj51 = keyedObjects2D50.clone();
        int int53 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 1);
        int int55 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) true);
        java.util.List list56 = keyedObjects2D50.getColumnKeys();
        java.lang.Object obj57 = keyedObjects2D50.clone();
        boolean boolean58 = keyedObjects2D24.equals(obj57);
        java.util.List list59 = keyedObjects2D24.getColumnKeys();
        java.util.List list60 = keyedObjects2D24.getColumnKeys();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D24, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100);
        int int65 = keyedObjects2D7.getRowIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        java.util.List list7 = keyedObjects2D5.getColumnKeys();
        int int8 = keyedObjects2D5.getRowCount();
        int int9 = keyedObjects2D5.getColumnCount();
        java.util.List list10 = keyedObjects2D5.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        boolean boolean13 = keyedObjects2D11.equals((java.lang.Object) (byte) 10);
        boolean boolean15 = keyedObjects2D11.equals((java.lang.Object) (-1L));
        java.lang.Object obj16 = keyedObjects2D11.clone();
        java.util.List list17 = keyedObjects2D11.getColumnKeys();
        boolean boolean18 = keyedObjects2D5.equals((java.lang.Object) keyedObjects2D11);
        java.lang.Object obj19 = keyedObjects2D5.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj21 = keyedObjects2D20.clone();
        java.util.List list22 = keyedObjects2D20.getRowKeys();
        keyedObjects2D20.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj28 = keyedObjects2D27.clone();
        java.util.List list29 = keyedObjects2D27.getRowKeys();
        keyedObjects2D20.addObject((java.lang.Object) list29, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        keyedObjects2D20.removeRow((int) (byte) 0);
        int int36 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 3);
        keyedObjects2D5.setObject((java.lang.Object) 3, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        int int41 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj43 = keyedObjects2D42.clone();
        int int45 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list46 = keyedObjects2D42.getRowKeys();
        int int47 = keyedObjects2D42.getRowCount();
        java.util.List list48 = keyedObjects2D42.getColumnKeys();
        java.util.List list49 = keyedObjects2D42.getColumnKeys();
        keyedObjects2D5.addObject((java.lang.Object) list49, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        java.util.List list53 = keyedObjects2D5.getColumnKeys();
        boolean boolean54 = keyedObjects2D0.equals((java.lang.Object) list53);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        java.util.List list3 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) (-1L));
        java.lang.Object obj9 = keyedObjects2D4.clone();
        int int10 = keyedObjects2D4.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int10, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = keyedObjects2D14.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj20 = keyedObjects2D19.clone();
        int int22 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list23 = keyedObjects2D19.getRowKeys();
        keyedObjects2D14.setObject((java.lang.Object) list23, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int28 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj33 = keyedObjects2D32.clone();
        int int35 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list36 = keyedObjects2D32.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj38 = keyedObjects2D37.clone();
        int int40 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D37.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        boolean boolean46 = keyedObjects2D44.equals((java.lang.Object) (byte) 10);
        boolean boolean48 = keyedObjects2D44.equals((java.lang.Object) (-1L));
        int int50 = keyedObjects2D44.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj51 = keyedObjects2D44.clone();
        boolean boolean52 = keyedObjects2D37.equals((java.lang.Object) keyedObjects2D44);
        java.lang.Object obj53 = keyedObjects2D44.clone();
        keyedObjects2D32.setObject((java.lang.Object) keyedObjects2D44, (java.lang.Comparable) '#', (java.lang.Comparable) (-1));
        java.lang.Object obj57 = null;
        keyedObjects2D32.setObject(obj57, (java.lang.Comparable) false, (java.lang.Comparable) 2);
        int int61 = keyedObjects2D32.getColumnCount();
        boolean boolean62 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D32);
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj64 = keyedObjects2D63.clone();
        int int66 = keyedObjects2D63.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D63.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D70 = new org.jfree.data.KeyedObjects2D();
        boolean boolean72 = keyedObjects2D70.equals((java.lang.Object) (byte) 10);
        boolean boolean74 = keyedObjects2D70.equals((java.lang.Object) (-1L));
        int int76 = keyedObjects2D70.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj77 = keyedObjects2D70.clone();
        boolean boolean78 = keyedObjects2D63.equals((java.lang.Object) keyedObjects2D70);
        java.util.List list79 = keyedObjects2D63.getColumnKeys();
        boolean boolean80 = keyedObjects2D32.equals((java.lang.Object) keyedObjects2D63);
        org.jfree.data.KeyedObjects2D keyedObjects2D81 = new org.jfree.data.KeyedObjects2D();
        boolean boolean83 = keyedObjects2D81.equals((java.lang.Object) (byte) 10);
        boolean boolean85 = keyedObjects2D81.equals((java.lang.Object) (-1L));
        java.lang.Object obj86 = keyedObjects2D81.clone();
        int int87 = keyedObjects2D81.getColumnCount();
        java.util.List list88 = keyedObjects2D81.getColumnKeys();
        java.lang.Object obj89 = keyedObjects2D81.clone();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D81, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) "");
        int int93 = keyedObjects2D32.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 3 + "'", int93 == 3);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        int int4 = keyedObjects2D0.getColumnCount();
        java.util.List list5 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        boolean boolean10 = keyedObjects2D6.equals((java.lang.Object) (-1L));
        keyedObjects2D6.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list14 = keyedObjects2D6.getColumnKeys();
        int int15 = keyedObjects2D6.getRowCount();
        java.util.List list16 = keyedObjects2D6.getColumnKeys();
        int int18 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj20 = keyedObjects2D19.clone();
        int int22 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj23 = keyedObjects2D19.clone();
        int int24 = keyedObjects2D19.getColumnCount();
        keyedObjects2D19.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int30 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) "hi!");
        boolean boolean31 = keyedObjects2D6.equals((java.lang.Object) int30);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100, (java.lang.Comparable) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj36 = keyedObjects2D35.clone();
        java.util.List list37 = keyedObjects2D35.getColumnKeys();
        java.lang.Object obj38 = keyedObjects2D35.clone();
        keyedObjects2D35.removeObject((java.lang.Comparable) (byte) 100, (java.lang.Comparable) "");
        keyedObjects2D6.addObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) 10, (java.lang.Comparable) ' ');
        keyedObjects2D6.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable49 = keyedObjects2D6.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) '4', (java.lang.Comparable) (short) 100);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj9 = keyedObjects2D8.clone();
        int int11 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int16 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj17 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj19 = keyedObjects2D18.clone();
        int int21 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj22 = keyedObjects2D18.clone();
        int int23 = keyedObjects2D18.getColumnCount();
        keyedObjects2D8.addObject((java.lang.Object) int23, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0d));
        keyedObjects2D8.removeObject((java.lang.Comparable) 0, (java.lang.Comparable) (short) 100);
        keyedObjects2D0.setObject((java.lang.Object) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D36.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int46 = keyedObjects2D36.getRowCount();
        int int48 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list49 = keyedObjects2D36.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj51 = keyedObjects2D50.clone();
        java.util.List list52 = keyedObjects2D50.getRowKeys();
        int int54 = keyedObjects2D50.getRowIndex((java.lang.Comparable) 10.0d);
        keyedObjects2D36.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D36.removeColumn((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj10 = keyedObjects2D9.clone();
        int int12 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        int int14 = keyedObjects2D9.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D9.removeColumn(0);
        int int22 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int23 = keyedObjects2D9.getRowCount();
        int int24 = keyedObjects2D9.getRowCount();
        java.util.List list25 = keyedObjects2D9.getColumnKeys();
        keyedObjects2D7.setObject((java.lang.Object) list25, (java.lang.Comparable) 3, (java.lang.Comparable) 100.0f);
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int30 = keyedObjects2D0.getColumnCount();
        java.lang.Class<?> wildcardClass31 = keyedObjects2D0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getRowCount();
        java.util.List list6 = keyedObjects2D0.getColumnKeys();
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj10 = keyedObjects2D0.clone();
        int int12 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        int int16 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D13.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        boolean boolean22 = keyedObjects2D20.equals((java.lang.Object) (byte) 10);
        boolean boolean24 = keyedObjects2D20.equals((java.lang.Object) (-1L));
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj27 = keyedObjects2D20.clone();
        boolean boolean28 = keyedObjects2D13.equals((java.lang.Object) keyedObjects2D20);
        java.lang.Object obj29 = keyedObjects2D20.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj31 = keyedObjects2D30.clone();
        java.util.List list32 = keyedObjects2D30.getColumnKeys();
        java.lang.Class<?> wildcardClass33 = keyedObjects2D30.getClass();
        keyedObjects2D20.setObject((java.lang.Object) wildcardClass33, (java.lang.Comparable) 1L, (java.lang.Comparable) false);
        int int38 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj40 = keyedObjects2D39.clone();
        java.util.List list41 = keyedObjects2D39.getRowKeys();
        int int43 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj45 = keyedObjects2D44.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj47 = keyedObjects2D46.clone();
        java.util.List list48 = keyedObjects2D46.getColumnKeys();
        int int49 = keyedObjects2D46.getRowCount();
        boolean boolean50 = keyedObjects2D44.equals((java.lang.Object) int49);
        java.util.List list51 = keyedObjects2D44.getColumnKeys();
        boolean boolean52 = keyedObjects2D39.equals((java.lang.Object) list51);
        keyedObjects2D20.setObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100.0f);
        keyedObjects2D39.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) true);
        boolean boolean59 = keyedObjects2D0.equals((java.lang.Object) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        boolean boolean62 = keyedObjects2D60.equals((java.lang.Object) (byte) 10);
        java.util.List list63 = keyedObjects2D60.getColumnKeys();
        java.util.List list64 = keyedObjects2D60.getRowKeys();
        int int66 = keyedObjects2D60.getRowIndex((java.lang.Comparable) ' ');
        java.util.List list67 = keyedObjects2D60.getColumnKeys();
        java.lang.Class<?> wildcardClass68 = keyedObjects2D60.getClass();
        keyedObjects2D0.setObject((java.lang.Object) wildcardClass68, (java.lang.Comparable) 4, (java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getRowCount();
        java.util.List list6 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        int int13 = keyedObjects2D7.getRowIndex((java.lang.Comparable) 0.0d);
        int int15 = keyedObjects2D7.getRowIndex((java.lang.Comparable) 100);
        keyedObjects2D0.addObject((java.lang.Object) int15, (java.lang.Comparable) 1L, (java.lang.Comparable) (byte) 10);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        int int3 = keyedObjects2D0.getRowCount();
        boolean boolean5 = keyedObjects2D0.equals((java.lang.Object) (short) -1);
        int int6 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D0.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        int int18 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj19 = keyedObjects2D15.clone();
        int int20 = keyedObjects2D15.getColumnCount();
        keyedObjects2D15.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D15.removeColumn(0);
        java.util.List list27 = keyedObjects2D15.getRowKeys();
        int int28 = keyedObjects2D15.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D15, (java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj33 = keyedObjects2D32.clone();
        int int35 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj36 = keyedObjects2D32.clone();
        int int37 = keyedObjects2D32.getColumnCount();
        keyedObjects2D32.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int42 = keyedObjects2D32.getRowCount();
        int int44 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 100.0d);
        int int45 = keyedObjects2D32.getColumnCount();
        keyedObjects2D32.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 0L);
        java.util.List list49 = keyedObjects2D32.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D32, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        java.util.List list53 = keyedObjects2D32.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) 0);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj10 = keyedObjects2D0.clone();
        java.util.List list11 = keyedObjects2D0.getRowKeys();
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 10);
        java.util.List list16 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj11 = keyedObjects2D10.clone();
        int int13 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj14 = keyedObjects2D10.clone();
        int int15 = keyedObjects2D10.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) int15, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0d));
        keyedObjects2D0.removeObject((java.lang.Comparable) 0, (java.lang.Comparable) (short) 100);
        java.util.List list25 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj26 = null;
        keyedObjects2D0.addObject(obj26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1.0f));
        int int31 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        int int33 = keyedObjects2D32.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        boolean boolean36 = keyedObjects2D34.equals((java.lang.Object) (byte) 10);
        boolean boolean38 = keyedObjects2D34.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj40 = keyedObjects2D39.clone();
        int int42 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list43 = keyedObjects2D39.getRowKeys();
        keyedObjects2D34.setObject((java.lang.Object) list43, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D32.setObject((java.lang.Object) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
        java.lang.Object obj50 = null;
        keyedObjects2D32.setObject(obj50, (java.lang.Comparable) 0, (java.lang.Comparable) false);
        int int55 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 100.0d);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D32, (java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
        int int60 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getColumnKeys();
        int int17 = keyedObjects2D14.getRowCount();
        boolean boolean18 = keyedObjects2D12.equals((java.lang.Object) int17);
        java.util.List list19 = keyedObjects2D12.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj25 = keyedObjects2D0.getObject(0, 0);
        int int27 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list28 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0f, (java.lang.Comparable) ' ');
        java.util.List list34 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean9 = keyedObjects2D7.equals((java.lang.Object) (byte) 10);
        boolean boolean11 = keyedObjects2D7.equals((java.lang.Object) (-1L));
        int int13 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj14 = keyedObjects2D7.clone();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int16 = keyedObjects2D0.getRowCount();
        java.util.List list17 = keyedObjects2D0.getRowKeys();
        int int18 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 10);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj9 = keyedObjects2D8.clone();
        java.util.List list10 = keyedObjects2D8.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        java.util.List list17 = keyedObjects2D15.getColumnKeys();
        java.lang.Class<?> wildcardClass18 = keyedObjects2D15.getClass();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D15, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        int int23 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 10.0d);
        int int24 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 'a', (java.lang.Comparable) 100);
        java.util.List list28 = keyedObjects2D8.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean9 = keyedObjects2D7.equals((java.lang.Object) (byte) 10);
        boolean boolean11 = keyedObjects2D7.equals((java.lang.Object) (-1L));
        int int13 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj14 = keyedObjects2D7.clone();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        boolean boolean18 = keyedObjects2D16.equals((java.lang.Object) (byte) 10);
        boolean boolean20 = keyedObjects2D16.equals((java.lang.Object) (-1L));
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj23 = keyedObjects2D16.clone();
        boolean boolean24 = keyedObjects2D0.equals(obj23);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        boolean boolean27 = keyedObjects2D25.equals((java.lang.Object) (byte) 10);
        boolean boolean29 = keyedObjects2D25.equals((java.lang.Object) (-1L));
        java.lang.Object obj30 = keyedObjects2D25.clone();
        int int31 = keyedObjects2D25.getColumnCount();
        java.util.List list32 = keyedObjects2D25.getColumnKeys();
        java.util.List list33 = keyedObjects2D25.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0f);
        java.lang.Object obj37 = keyedObjects2D25.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable39 = keyedObjects2D25.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getColumnKeys();
        int int17 = keyedObjects2D14.getRowCount();
        boolean boolean18 = keyedObjects2D12.equals((java.lang.Object) int17);
        java.util.List list19 = keyedObjects2D12.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj25 = keyedObjects2D0.getObject(0, 0);
        int int27 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list28 = keyedObjects2D0.getColumnKeys();
        java.lang.Comparable comparable29 = null;
        int int30 = keyedObjects2D0.getColumnIndex(comparable29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        boolean boolean33 = keyedObjects2D31.equals((java.lang.Object) (byte) 10);
        boolean boolean35 = keyedObjects2D31.equals((java.lang.Object) (-1L));
        keyedObjects2D31.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list39 = keyedObjects2D31.getColumnKeys();
        keyedObjects2D31.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0f));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) "hi!");
        java.util.List list46 = keyedObjects2D31.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable48 = keyedObjects2D31.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 10);
        int int7 = keyedObjects2D0.getColumnCount();
        java.util.List list8 = keyedObjects2D0.getRowKeys();
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj11 = keyedObjects2D10.clone();
        java.util.List list12 = keyedObjects2D10.getRowKeys();
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 10.0d);
        int int16 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 1.0d);
        keyedObjects2D10.setObject((java.lang.Object) 1.0f, (java.lang.Comparable) 1L, (java.lang.Comparable) 10L);
        java.util.List list21 = keyedObjects2D10.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) true);
        int int27 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 4, (java.lang.Comparable) (-1L));
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean9 = keyedObjects2D7.equals((java.lang.Object) (byte) 10);
        boolean boolean11 = keyedObjects2D7.equals((java.lang.Object) (-1L));
        int int13 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj14 = keyedObjects2D7.clone();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.lang.Object obj16 = keyedObjects2D7.clone();
        java.util.List list17 = keyedObjects2D7.getColumnKeys();
        int int19 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1.0f);
        int int21 = keyedObjects2D7.getRowIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getColumnKeys();
        int int17 = keyedObjects2D14.getRowCount();
        boolean boolean18 = keyedObjects2D12.equals((java.lang.Object) int17);
        java.util.List list19 = keyedObjects2D12.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj25 = keyedObjects2D0.getObject(0, 0);
        int int27 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list28 = keyedObjects2D0.getColumnKeys();
        java.lang.Comparable comparable29 = null;
        int int30 = keyedObjects2D0.getColumnIndex(comparable29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        boolean boolean33 = keyedObjects2D31.equals((java.lang.Object) (byte) 10);
        boolean boolean35 = keyedObjects2D31.equals((java.lang.Object) (-1L));
        keyedObjects2D31.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list39 = keyedObjects2D31.getColumnKeys();
        keyedObjects2D31.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0f));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) "hi!");
        java.util.List list46 = keyedObjects2D31.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj48 = keyedObjects2D47.clone();
        int int50 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj51 = keyedObjects2D47.clone();
        int int52 = keyedObjects2D47.getColumnCount();
        int int53 = keyedObjects2D47.getRowCount();
        keyedObjects2D31.addObject((java.lang.Object) int53, (java.lang.Comparable) 0L, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = keyedObjects2D0.clone();
        java.util.List list4 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj7 = keyedObjects2D6.clone();
        java.util.List list8 = keyedObjects2D6.getRowKeys();
        int int10 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj12 = keyedObjects2D11.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        java.util.List list15 = keyedObjects2D13.getColumnKeys();
        int int16 = keyedObjects2D13.getRowCount();
        boolean boolean17 = keyedObjects2D11.equals((java.lang.Object) int16);
        java.util.List list18 = keyedObjects2D11.getColumnKeys();
        boolean boolean19 = keyedObjects2D6.equals((java.lang.Object) list18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        java.util.List list21 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean9 = keyedObjects2D7.equals((java.lang.Object) (byte) 10);
        boolean boolean11 = keyedObjects2D7.equals((java.lang.Object) (-1L));
        int int13 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj14 = keyedObjects2D7.clone();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        boolean boolean18 = keyedObjects2D16.equals((java.lang.Object) (byte) 10);
        boolean boolean20 = keyedObjects2D16.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj22 = keyedObjects2D21.clone();
        int int24 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list25 = keyedObjects2D21.getRowKeys();
        keyedObjects2D16.setObject((java.lang.Object) list25, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D16.removeObject((java.lang.Comparable) '#', (java.lang.Comparable) true);
        int int33 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) (byte) 0);
        boolean boolean34 = keyedObjects2D7.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj35 = keyedObjects2D7.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        boolean boolean38 = keyedObjects2D36.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = keyedObjects2D36.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj42 = keyedObjects2D41.clone();
        int int44 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list45 = keyedObjects2D41.getRowKeys();
        keyedObjects2D36.setObject((java.lang.Object) list45, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D36.removeColumn(0);
        keyedObjects2D36.removeObject((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 1);
        keyedObjects2D36.removeObject((java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0d);
        java.util.List list57 = keyedObjects2D36.getColumnKeys();
        keyedObjects2D7.setObject((java.lang.Object) list57, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0d);
        int int62 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = keyedObjects2D7.getObject(4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int13 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getRowKeys();
        keyedObjects2D14.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj22 = keyedObjects2D21.clone();
        java.util.List list23 = keyedObjects2D21.getColumnKeys();
        java.lang.Class<?> wildcardClass24 = keyedObjects2D21.getClass();
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        int int31 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D28.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int36 = keyedObjects2D28.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj37 = keyedObjects2D28.clone();
        java.lang.Comparable comparable38 = null;
        int int39 = keyedObjects2D28.getColumnIndex(comparable38);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj41 = keyedObjects2D40.clone();
        int int43 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D40.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int48 = keyedObjects2D40.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj49 = keyedObjects2D40.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj51 = keyedObjects2D50.clone();
        int int53 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj54 = keyedObjects2D50.clone();
        int int55 = keyedObjects2D50.getColumnCount();
        keyedObjects2D40.addObject((java.lang.Object) int55, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D28.setObject((java.lang.Object) int55, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D28.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D65 = new org.jfree.data.KeyedObjects2D();
        boolean boolean67 = keyedObjects2D65.equals((java.lang.Object) (byte) 10);
        boolean boolean69 = keyedObjects2D65.equals((java.lang.Object) (-1L));
        int int71 = keyedObjects2D65.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj72 = keyedObjects2D65.clone();
        keyedObjects2D28.addObject(obj72, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        boolean boolean79 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        java.util.List list80 = keyedObjects2D0.getColumnKeys();
        int int82 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int83 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D0.removeColumn(0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0d);
        java.lang.Object obj21 = keyedObjects2D0.clone();
        int int22 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        int int12 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        java.util.List list15 = keyedObjects2D13.getColumnKeys();
        int int16 = keyedObjects2D13.getRowCount();
        int int17 = keyedObjects2D13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj19 = keyedObjects2D18.clone();
        java.util.List list20 = keyedObjects2D18.getColumnKeys();
        int int21 = keyedObjects2D18.getRowCount();
        int int22 = keyedObjects2D18.getColumnCount();
        boolean boolean23 = keyedObjects2D13.equals((java.lang.Object) int22);
        int int25 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1.0d);
        keyedObjects2D0.setObject((java.lang.Object) int25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = keyedObjects2D0.getObject((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        java.util.List list3 = keyedObjects2D0.getColumnKeys();
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        int int7 = keyedObjects2D0.getRowCount();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        keyedObjects2D0.removeObject((java.lang.Comparable) 0L, (java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        java.util.List list12 = keyedObjects2D0.getRowKeys();
        java.util.List list13 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = keyedObjects2D14.equals((java.lang.Object) (-1L));
        java.util.List list19 = keyedObjects2D14.getRowKeys();
        java.util.List list20 = keyedObjects2D14.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        boolean boolean23 = keyedObjects2D21.equals((java.lang.Object) (byte) 10);
        boolean boolean25 = keyedObjects2D21.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list30 = keyedObjects2D26.getRowKeys();
        keyedObjects2D21.setObject((java.lang.Object) list30, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int35 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int36 = keyedObjects2D21.getRowCount();
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 100);
        int int40 = keyedObjects2D21.getRowCount();
        java.util.List list41 = keyedObjects2D21.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.util.List list45 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj10 = keyedObjects2D9.clone();
        int int12 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        int int14 = keyedObjects2D9.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D9.removeColumn(0);
        int int22 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int23 = keyedObjects2D9.getRowCount();
        int int24 = keyedObjects2D9.getRowCount();
        java.util.List list25 = keyedObjects2D9.getColumnKeys();
        keyedObjects2D7.setObject((java.lang.Object) list25, (java.lang.Comparable) 3, (java.lang.Comparable) 100.0f);
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj31 = keyedObjects2D30.clone();
        java.util.List list32 = keyedObjects2D30.getColumnKeys();
        int int33 = keyedObjects2D30.getRowCount();
        int int34 = keyedObjects2D30.getColumnCount();
        java.util.List list35 = keyedObjects2D30.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        boolean boolean38 = keyedObjects2D36.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = keyedObjects2D36.equals((java.lang.Object) (-1L));
        java.lang.Object obj41 = keyedObjects2D36.clone();
        java.util.List list42 = keyedObjects2D36.getColumnKeys();
        boolean boolean43 = keyedObjects2D30.equals((java.lang.Object) keyedObjects2D36);
        java.lang.Object obj44 = keyedObjects2D30.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj46 = keyedObjects2D45.clone();
        java.util.List list47 = keyedObjects2D45.getRowKeys();
        keyedObjects2D45.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj53 = keyedObjects2D52.clone();
        java.util.List list54 = keyedObjects2D52.getRowKeys();
        keyedObjects2D45.addObject((java.lang.Object) list54, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        keyedObjects2D45.removeRow((int) (byte) 0);
        int int61 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 3);
        keyedObjects2D30.setObject((java.lang.Object) 3, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        int int66 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj68 = keyedObjects2D67.clone();
        int int70 = keyedObjects2D67.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list71 = keyedObjects2D67.getRowKeys();
        int int72 = keyedObjects2D67.getRowCount();
        java.util.List list73 = keyedObjects2D67.getColumnKeys();
        java.util.List list74 = keyedObjects2D67.getColumnKeys();
        keyedObjects2D30.addObject((java.lang.Object) list74, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (short) 100);
        java.util.List list78 = keyedObjects2D30.getColumnKeys();
        keyedObjects2D7.setObject((java.lang.Object) keyedObjects2D30, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj84 = keyedObjects2D7.getObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(list78);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj4 = keyedObjects2D3.clone();
        int int6 = keyedObjects2D3.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj7 = keyedObjects2D3.clone();
        int int8 = keyedObjects2D3.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D3, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        int int13 = keyedObjects2D0.getRowIndex((java.lang.Comparable) false);
        int int14 = keyedObjects2D0.getRowCount();
        java.util.List list15 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 10, (java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int16 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100L);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 100);
        int int21 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = keyedObjects2D0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) 0);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj10 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj12 = keyedObjects2D11.clone();
        int int14 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj15 = keyedObjects2D11.clone();
        int int16 = keyedObjects2D11.getColumnCount();
        keyedObjects2D11.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D11.removeColumn(0);
        int int24 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list25 = keyedObjects2D11.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D11, (java.lang.Comparable) true, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        int int10 = keyedObjects2D0.getColumnCount();
        int int11 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
        java.util.List list15 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        int int5 = keyedObjects2D0.getRowCount();
        java.lang.Object obj6 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int9 = keyedObjects2D0.getRowCount();
        int int11 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10);
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        java.util.List list15 = keyedObjects2D13.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D13, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 1);
        java.lang.Object obj19 = keyedObjects2D13.clone();
        int int21 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj11 = keyedObjects2D10.clone();
        int int13 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D10.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int18 = keyedObjects2D10.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj19 = keyedObjects2D10.clone();
        java.lang.Comparable comparable20 = null;
        int int21 = keyedObjects2D10.getColumnIndex(comparable20);
        keyedObjects2D0.addObject((java.lang.Object) comparable20, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1.0d));
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj26 = keyedObjects2D25.clone();
        int int28 = keyedObjects2D25.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D25.removeObject((java.lang.Comparable) '4', (java.lang.Comparable) (short) 100);
        java.lang.Object obj32 = keyedObjects2D25.clone();
        int int34 = keyedObjects2D25.getRowIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj35 = null;
        keyedObjects2D25.addObject(obj35, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 1);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj43 = keyedObjects2D42.clone();
        java.util.List list44 = keyedObjects2D42.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj46 = keyedObjects2D45.clone();
        int int48 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj49 = keyedObjects2D45.clone();
        int int50 = keyedObjects2D45.getColumnCount();
        keyedObjects2D42.addObject((java.lang.Object) keyedObjects2D45, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj55 = keyedObjects2D54.clone();
        java.util.List list56 = keyedObjects2D54.getColumnKeys();
        int int57 = keyedObjects2D54.getRowCount();
        int int59 = keyedObjects2D54.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list60 = keyedObjects2D54.getColumnKeys();
        keyedObjects2D42.addObject((java.lang.Object) list60, (java.lang.Comparable) 0, (java.lang.Comparable) 1L);
        java.lang.Comparable comparable65 = keyedObjects2D42.getColumnKey(1);
        keyedObjects2D25.setObject((java.lang.Object) 1, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) 0);
        int int69 = keyedObjects2D25.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertEquals("'" + comparable65 + "' != '" + 1L + "'", comparable65, 1L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D2 = new org.jfree.data.KeyedObjects2D();
        boolean boolean4 = keyedObjects2D2.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = keyedObjects2D2.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        keyedObjects2D2.setObject((java.lang.Object) list11, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D0.setObject((java.lang.Object) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
        java.lang.Object obj18 = null;
        keyedObjects2D0.setObject(obj18, (java.lang.Comparable) 0, (java.lang.Comparable) false);
        int int23 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj25 = keyedObjects2D24.clone();
        int int27 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj28 = keyedObjects2D24.clone();
        int int29 = keyedObjects2D24.getColumnCount();
        keyedObjects2D24.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int34 = keyedObjects2D24.getRowCount();
        int int36 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) ' ');
        int int38 = keyedObjects2D24.getRowIndex((java.lang.Comparable) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) 0);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj10 = keyedObjects2D0.clone();
        java.util.List list11 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj7 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj9 = keyedObjects2D8.clone();
        java.util.List list10 = keyedObjects2D8.getColumnKeys();
        int int11 = keyedObjects2D8.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        boolean boolean21 = keyedObjects2D19.equals((java.lang.Object) (byte) 10);
        boolean boolean23 = keyedObjects2D19.equals((java.lang.Object) (-1L));
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj26 = keyedObjects2D19.clone();
        boolean boolean27 = keyedObjects2D12.equals((java.lang.Object) keyedObjects2D19);
        java.lang.Object obj28 = keyedObjects2D19.clone();
        keyedObjects2D19.removeObject((java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        boolean boolean35 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        int int37 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }
}

