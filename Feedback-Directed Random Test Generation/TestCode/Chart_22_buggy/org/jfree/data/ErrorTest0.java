package org.jfree.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.util.List list8 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        java.lang.Object obj10 = keyedObjects2D0.clone();
        java.util.List list11 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj10", keyedObjects2D0.equals(obj10) ? keyedObjects2D0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) true);
        java.util.List list6 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj11 = keyedObjects2D7.clone();
        int int12 = keyedObjects2D7.getColumnCount();
        keyedObjects2D7.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int17 = keyedObjects2D7.getRowCount();
        int int19 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj20 = keyedObjects2D7.clone();
        boolean boolean21 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj20", keyedObjects2D7.equals(obj20) ? keyedObjects2D7.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        java.util.List list9 = keyedObjects2D7.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D7.getClass();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int22 = keyedObjects2D14.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj23 = keyedObjects2D14.clone();
        java.lang.Comparable comparable24 = null;
        int int25 = keyedObjects2D14.getColumnIndex(comparable24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int34 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj35 = keyedObjects2D26.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D26.addObject((java.lang.Object) int41, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D14.setObject((java.lang.Object) int41, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D14.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        boolean boolean53 = keyedObjects2D51.equals((java.lang.Object) (byte) 10);
        boolean boolean55 = keyedObjects2D51.equals((java.lang.Object) (-1L));
        int int57 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj58 = keyedObjects2D51.clone();
        keyedObjects2D14.addObject(obj58, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        java.lang.Object obj65 = keyedObjects2D0.clone();
        int int67 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj65", keyedObjects2D0.equals(obj65) ? keyedObjects2D0.hashCode() == obj65.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        java.util.List list9 = keyedObjects2D7.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D7.getClass();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int22 = keyedObjects2D14.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj23 = keyedObjects2D14.clone();
        java.lang.Comparable comparable24 = null;
        int int25 = keyedObjects2D14.getColumnIndex(comparable24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int34 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj35 = keyedObjects2D26.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D26.addObject((java.lang.Object) int41, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D14.setObject((java.lang.Object) int41, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D14.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        boolean boolean53 = keyedObjects2D51.equals((java.lang.Object) (byte) 10);
        boolean boolean55 = keyedObjects2D51.equals((java.lang.Object) (-1L));
        int int57 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj58 = keyedObjects2D51.clone();
        keyedObjects2D14.addObject(obj58, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        java.lang.Object obj65 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D66 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj67 = keyedObjects2D66.clone();
        int int69 = keyedObjects2D66.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj70 = keyedObjects2D66.clone();
        int int71 = keyedObjects2D66.getColumnCount();
        keyedObjects2D66.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D66.removeColumn(0);
        int int79 = keyedObjects2D66.getColumnIndex((java.lang.Comparable) (-1.0f));
        boolean boolean80 = keyedObjects2D0.equals((java.lang.Object) int79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj65", keyedObjects2D0.equals(obj65) ? keyedObjects2D0.hashCode() == obj65.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        int int16 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj17 = keyedObjects2D13.clone();
        int int18 = keyedObjects2D13.getColumnCount();
        keyedObjects2D13.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        java.util.List list23 = keyedObjects2D13.getColumnKeys();
        boolean boolean24 = keyedObjects2D0.equals((java.lang.Object) list23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj12", keyedObjects2D0.equals(obj12) ? keyedObjects2D0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj10 = keyedObjects2D9.clone();
        int int12 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list13 = keyedObjects2D9.getRowKeys();
        keyedObjects2D4.setObject((java.lang.Object) list13, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int18 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int19 = keyedObjects2D4.getRowCount();
        java.lang.Object obj20 = keyedObjects2D4.clone();
        keyedObjects2D0.addObject(obj20, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D4 and obj20", keyedObjects2D4.equals(obj20) ? keyedObjects2D4.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        java.util.List list9 = keyedObjects2D7.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) list9, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Comparable comparable15 = keyedObjects2D0.getRowKey((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int5 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        boolean boolean10 = keyedObjects2D6.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj12 = keyedObjects2D11.clone();
        int int14 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list15 = keyedObjects2D11.getRowKeys();
        keyedObjects2D6.setObject((java.lang.Object) list15, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int20 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int21 = keyedObjects2D6.getRowCount();
        java.lang.Object obj22 = keyedObjects2D6.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and obj22", keyedObjects2D6.equals(obj22) ? keyedObjects2D6.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        java.util.List list9 = keyedObjects2D7.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D7.getClass();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int22 = keyedObjects2D14.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj23 = keyedObjects2D14.clone();
        java.lang.Comparable comparable24 = null;
        int int25 = keyedObjects2D14.getColumnIndex(comparable24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int34 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj35 = keyedObjects2D26.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D26.addObject((java.lang.Object) int41, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D14.setObject((java.lang.Object) int41, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D14.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        boolean boolean53 = keyedObjects2D51.equals((java.lang.Object) (byte) 10);
        boolean boolean55 = keyedObjects2D51.equals((java.lang.Object) (-1L));
        int int57 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj58 = keyedObjects2D51.clone();
        keyedObjects2D14.addObject(obj58, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        java.lang.Object obj65 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass66 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj65", keyedObjects2D0.equals(obj65) ? keyedObjects2D0.hashCode() == obj65.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        int int14 = keyedObjects2D0.getRowIndex((java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj19 = keyedObjects2D18.clone();
        java.util.List list20 = keyedObjects2D18.getRowKeys();
        keyedObjects2D18.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj25 = keyedObjects2D18.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D18, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D18 and obj25", keyedObjects2D18.equals(obj25) ? keyedObjects2D18.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        java.util.List list9 = keyedObjects2D7.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) list9, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass14 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj14 = keyedObjects2D0.clone();
        java.lang.Comparable comparable16 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        boolean boolean10 = keyedObjects2D8.equals((java.lang.Object) (byte) 10);
        boolean boolean12 = keyedObjects2D8.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        int int16 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list17 = keyedObjects2D13.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) list17, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int22 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj24 = keyedObjects2D23.clone();
        java.util.List list25 = keyedObjects2D23.getColumnKeys();
        java.lang.Class<?> wildcardClass26 = keyedObjects2D23.getClass();
        keyedObjects2D8.setObject((java.lang.Object) wildcardClass26, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        int int31 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 2);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj36 = keyedObjects2D35.clone();
        int int38 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D35.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int45 = keyedObjects2D35.getRowCount();
        int int47 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 100.0d);
        int int48 = keyedObjects2D35.getColumnCount();
        java.util.List list49 = keyedObjects2D35.getRowKeys();
        boolean boolean50 = keyedObjects2D8.equals((java.lang.Object) list49);
        java.lang.Object obj51 = keyedObjects2D8.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj51", keyedObjects2D8.equals(obj51) ? keyedObjects2D8.hashCode() == obj51.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        java.util.List list17 = keyedObjects2D15.getColumnKeys();
        java.lang.Class<?> wildcardClass18 = keyedObjects2D15.getClass();
        keyedObjects2D0.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        int int23 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 2);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj28 = keyedObjects2D27.clone();
        int int30 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj31 = keyedObjects2D27.clone();
        int int32 = keyedObjects2D27.getColumnCount();
        keyedObjects2D27.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int37 = keyedObjects2D27.getRowCount();
        int int39 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 100.0d);
        int int40 = keyedObjects2D27.getColumnCount();
        java.util.List list41 = keyedObjects2D27.getRowKeys();
        boolean boolean42 = keyedObjects2D0.equals((java.lang.Object) list41);
        java.lang.Object obj43 = keyedObjects2D0.clone();
        int int45 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj43", keyedObjects2D0.equals(obj43) ? keyedObjects2D0.hashCode() == obj43.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int12 = keyedObjects2D0.getRowCount();
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.util.List list14 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int11 = keyedObjects2D0.getColumnCount();
        int int13 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int22 = keyedObjects2D14.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj23 = keyedObjects2D14.clone();
        java.lang.Comparable comparable24 = null;
        int int25 = keyedObjects2D14.getColumnIndex(comparable24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int34 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj35 = keyedObjects2D26.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D26.addObject((java.lang.Object) int41, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D14.setObject((java.lang.Object) int41, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D14.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable52 = keyedObjects2D14.getColumnKey((int) (byte) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj56 = keyedObjects2D14.clone();
        boolean boolean57 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and obj56", keyedObjects2D14.equals(obj56) ? keyedObjects2D14.hashCode() == obj56.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        boolean boolean14 = keyedObjects2D10.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        int int18 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list19 = keyedObjects2D15.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) list19, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int24 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj26 = keyedObjects2D25.clone();
        java.util.List list27 = keyedObjects2D25.getColumnKeys();
        java.lang.Class<?> wildcardClass28 = keyedObjects2D25.getClass();
        keyedObjects2D10.setObject((java.lang.Object) wildcardClass28, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        int int33 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 2);
        keyedObjects2D10.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj38 = keyedObjects2D37.clone();
        int int40 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj41 = keyedObjects2D37.clone();
        int int42 = keyedObjects2D37.getColumnCount();
        keyedObjects2D37.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int47 = keyedObjects2D37.getRowCount();
        int int49 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) 100.0d);
        int int50 = keyedObjects2D37.getColumnCount();
        java.util.List list51 = keyedObjects2D37.getRowKeys();
        boolean boolean52 = keyedObjects2D10.equals((java.lang.Object) list51);
        boolean boolean53 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D37", keyedObjects2D0.equals(keyedObjects2D37) ? keyedObjects2D0.hashCode() == keyedObjects2D37.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj14 = keyedObjects2D13.clone();
        int int16 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj17 = keyedObjects2D13.clone();
        int int18 = keyedObjects2D13.getColumnCount();
        keyedObjects2D13.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D13.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj26 = keyedObjects2D25.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj28 = keyedObjects2D27.clone();
        java.util.List list29 = keyedObjects2D27.getColumnKeys();
        int int30 = keyedObjects2D27.getRowCount();
        boolean boolean31 = keyedObjects2D25.equals((java.lang.Object) int30);
        java.util.List list32 = keyedObjects2D25.getColumnKeys();
        keyedObjects2D13.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        keyedObjects2D13.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj43 = keyedObjects2D42.clone();
        int int45 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D42.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int50 = keyedObjects2D42.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj51 = keyedObjects2D42.clone();
        java.lang.Comparable comparable52 = null;
        int int53 = keyedObjects2D42.getColumnIndex(comparable52);
        java.util.List list54 = keyedObjects2D42.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj56 = keyedObjects2D55.clone();
        int int58 = keyedObjects2D55.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj59 = keyedObjects2D55.clone();
        int int60 = keyedObjects2D55.getColumnCount();
        keyedObjects2D55.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D55.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj68 = keyedObjects2D67.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D69 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj70 = keyedObjects2D69.clone();
        java.util.List list71 = keyedObjects2D69.getColumnKeys();
        int int72 = keyedObjects2D69.getRowCount();
        boolean boolean73 = keyedObjects2D67.equals((java.lang.Object) int72);
        java.util.List list74 = keyedObjects2D67.getColumnKeys();
        keyedObjects2D55.addObject((java.lang.Object) keyedObjects2D67, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        keyedObjects2D55.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        keyedObjects2D42.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        int int85 = keyedObjects2D42.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Class<?> wildcardClass86 = keyedObjects2D42.getClass();
        keyedObjects2D0.setObject((java.lang.Object) wildcardClass86, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D13 and keyedObjects2D55", keyedObjects2D13.equals(keyedObjects2D55) ? keyedObjects2D13.hashCode() == keyedObjects2D55.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int20 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj21 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        int int25 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj26 = keyedObjects2D22.clone();
        int int27 = keyedObjects2D22.getColumnCount();
        keyedObjects2D12.addObject((java.lang.Object) int27, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D0.setObject((java.lang.Object) int27, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable38 = keyedObjects2D0.getColumnKey((int) (byte) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj42 = keyedObjects2D0.clone();
        java.util.List list43 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj42", keyedObjects2D0.equals(obj42) ? keyedObjects2D0.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        java.lang.Object obj12 = keyedObjects2D0.clone();
        int int14 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj12", keyedObjects2D0.equals(obj12) ? keyedObjects2D0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        boolean boolean17 = keyedObjects2D15.equals((java.lang.Object) (byte) 10);
        boolean boolean19 = keyedObjects2D15.equals((java.lang.Object) (-1L));
        java.lang.Object obj20 = keyedObjects2D15.clone();
        int int21 = keyedObjects2D15.getColumnCount();
        java.util.List list22 = keyedObjects2D15.getColumnKeys();
        java.lang.Object obj23 = keyedObjects2D15.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        boolean boolean26 = keyedObjects2D24.equals((java.lang.Object) (byte) 10);
        boolean boolean28 = keyedObjects2D24.equals((java.lang.Object) (-1L));
        keyedObjects2D24.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable32 = null;
        int int33 = keyedObjects2D24.getRowIndex(comparable32);
        keyedObjects2D15.addObject((java.lang.Object) int33, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        int int37 = keyedObjects2D15.getColumnCount();
        java.lang.Object obj38 = keyedObjects2D15.clone();
        boolean boolean39 = keyedObjects2D0.equals(obj38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D15 and obj38", keyedObjects2D15.equals(obj38) ? keyedObjects2D15.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        int int24 = keyedObjects2D0.getColumnCount();
        int int26 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        boolean boolean29 = keyedObjects2D27.equals((java.lang.Object) (byte) 10);
        boolean boolean31 = keyedObjects2D27.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj33 = keyedObjects2D32.clone();
        int int35 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list36 = keyedObjects2D32.getRowKeys();
        keyedObjects2D27.setObject((java.lang.Object) list36, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int41 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int42 = keyedObjects2D27.getRowCount();
        java.lang.Object obj43 = keyedObjects2D27.clone();
        keyedObjects2D0.setObject(obj43, (java.lang.Comparable) ' ', (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D2 and keyedObjects2D27", keyedObjects2D2.equals(keyedObjects2D27) ? keyedObjects2D2.hashCode() == keyedObjects2D27.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        java.lang.Object obj10 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj12 = keyedObjects2D11.clone();
        int int14 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj15 = keyedObjects2D11.clone();
        int int16 = keyedObjects2D11.getColumnCount();
        keyedObjects2D11.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int21 = keyedObjects2D11.getRowCount();
        keyedObjects2D11.removeRow(0);
        boolean boolean24 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj10", keyedObjects2D0.equals(obj10) ? keyedObjects2D0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        int int24 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj25 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj25", keyedObjects2D0.equals(obj25) ? keyedObjects2D0.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        boolean boolean11 = keyedObjects2D9.equals((java.lang.Object) (byte) 10);
        boolean boolean13 = keyedObjects2D9.equals((java.lang.Object) (-1L));
        keyedObjects2D9.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D9.getRowIndex(comparable17);
        keyedObjects2D0.addObject((java.lang.Object) int18, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        int int22 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj23 = keyedObjects2D0.clone();
        java.util.List list24 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj23", keyedObjects2D0.equals(obj23) ? keyedObjects2D0.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int12 = keyedObjects2D0.getRowCount();
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Comparable comparable15 = keyedObjects2D0.getRowKey((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Comparable comparable14 = null;
        int int15 = keyedObjects2D0.getColumnIndex(comparable14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        java.lang.Object obj26 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        boolean boolean29 = keyedObjects2D27.equals((java.lang.Object) (byte) 10);
        int int30 = keyedObjects2D27.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        boolean boolean33 = keyedObjects2D31.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = keyedObjects2D31.clone();
        java.util.List list35 = keyedObjects2D31.getColumnKeys();
        java.lang.Object obj36 = keyedObjects2D31.clone();
        keyedObjects2D27.setObject(obj36, (java.lang.Comparable) 0, (java.lang.Comparable) 0L);
        boolean boolean40 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj26", keyedObjects2D0.equals(obj26) ? keyedObjects2D0.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        boolean boolean11 = keyedObjects2D9.equals((java.lang.Object) (byte) 10);
        boolean boolean13 = keyedObjects2D9.equals((java.lang.Object) (-1L));
        keyedObjects2D9.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D9.getRowIndex(comparable17);
        keyedObjects2D0.addObject((java.lang.Object) int18, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        int int22 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj23 = keyedObjects2D0.clone();
        int int24 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj23", keyedObjects2D0.equals(obj23) ? keyedObjects2D0.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        java.util.List list17 = keyedObjects2D15.getColumnKeys();
        java.lang.Class<?> wildcardClass18 = keyedObjects2D15.getClass();
        keyedObjects2D0.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        java.util.List list22 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        boolean boolean25 = keyedObjects2D23.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = keyedObjects2D23.equals((java.lang.Object) (-1L));
        int int29 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean31 = keyedObjects2D23.equals((java.lang.Object) 0);
        java.util.List list32 = keyedObjects2D23.getRowKeys();
        int int34 = keyedObjects2D23.getRowIndex((java.lang.Comparable) 1.0d);
        boolean boolean35 = keyedObjects2D0.equals((java.lang.Object) int34);
        java.lang.Object obj36 = keyedObjects2D0.clone();
        int int37 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj36", keyedObjects2D0.equals(obj36) ? keyedObjects2D0.hashCode() == obj36.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int15 = keyedObjects2D0.getRowCount();
        java.lang.Object obj16 = keyedObjects2D0.clone();
        int int17 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj16", keyedObjects2D0.equals(obj16) ? keyedObjects2D0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        int int24 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeRow(0);
        java.lang.Object obj27 = keyedObjects2D0.clone();
        java.lang.Comparable comparable28 = null;
        int int29 = keyedObjects2D0.getRowIndex(comparable28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj27", keyedObjects2D0.equals(obj27) ? keyedObjects2D0.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj12 = keyedObjects2D11.clone();
        int int14 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D11.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int19 = keyedObjects2D11.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj20 = keyedObjects2D11.clone();
        java.lang.Comparable comparable21 = null;
        int int22 = keyedObjects2D11.getColumnIndex(comparable21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj24 = keyedObjects2D23.clone();
        int int26 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D23.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int31 = keyedObjects2D23.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj32 = keyedObjects2D23.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj34 = keyedObjects2D33.clone();
        int int36 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        int int38 = keyedObjects2D33.getColumnCount();
        keyedObjects2D23.addObject((java.lang.Object) int38, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D11.setObject((java.lang.Object) int38, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D11.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable49 = keyedObjects2D11.getColumnKey((int) (byte) 1);
        java.util.List list50 = keyedObjects2D11.getColumnKeys();
        java.lang.Object obj51 = keyedObjects2D11.clone();
        keyedObjects2D0.setObject(obj51, (java.lang.Comparable) 1, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D11 and obj51", keyedObjects2D11.equals(obj51) ? keyedObjects2D11.hashCode() == obj51.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        java.util.List list9 = keyedObjects2D7.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D7.getClass();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int22 = keyedObjects2D14.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj23 = keyedObjects2D14.clone();
        java.lang.Comparable comparable24 = null;
        int int25 = keyedObjects2D14.getColumnIndex(comparable24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int34 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj35 = keyedObjects2D26.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D26.addObject((java.lang.Object) int41, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D14.setObject((java.lang.Object) int41, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D14.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        boolean boolean53 = keyedObjects2D51.equals((java.lang.Object) (byte) 10);
        boolean boolean55 = keyedObjects2D51.equals((java.lang.Object) (-1L));
        int int57 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj58 = keyedObjects2D51.clone();
        keyedObjects2D14.addObject(obj58, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        java.lang.Object obj65 = keyedObjects2D0.clone();
        java.util.List list66 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj65", keyedObjects2D0.equals(obj65) ? keyedObjects2D0.hashCode() == obj65.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        java.lang.Object obj36 = keyedObjects2D0.clone();
        java.util.List list37 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj36", keyedObjects2D0.equals(obj36) ? keyedObjects2D0.hashCode() == obj36.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        java.lang.Object obj15 = keyedObjects2D0.clone();
        java.util.List list16 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj15", keyedObjects2D0.equals(obj15) ? keyedObjects2D0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        java.lang.Object obj15 = keyedObjects2D0.clone();
        int int16 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj15", keyedObjects2D0.equals(obj15) ? keyedObjects2D0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        java.util.List list23 = keyedObjects2D0.getRowKeys();
        java.util.List list24 = keyedObjects2D0.getRowKeys();
        int int26 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list27 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj28 = keyedObjects2D0.clone();
        java.lang.Comparable comparable30 = keyedObjects2D0.getRowKey(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj28", keyedObjects2D0.equals(obj28) ? keyedObjects2D0.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        int int24 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj25 = keyedObjects2D0.clone();
        java.util.List list26 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj25", keyedObjects2D0.equals(obj25) ? keyedObjects2D0.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        int int32 = keyedObjects2D14.getRowCount();
        int int34 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj35 = keyedObjects2D14.clone();
        java.lang.Object obj36 = keyedObjects2D14.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and obj35", keyedObjects2D14.equals(obj35) ? keyedObjects2D14.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 10.0f);
        int int19 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Object obj20 = keyedObjects2D0.clone();
        java.util.List list21 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj20", keyedObjects2D0.equals(obj20) ? keyedObjects2D0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj4 = keyedObjects2D3.clone();
        int int6 = keyedObjects2D3.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj7 = keyedObjects2D3.clone();
        int int8 = keyedObjects2D3.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D3, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int20 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj21 = keyedObjects2D12.clone();
        java.lang.Comparable comparable22 = null;
        int int23 = keyedObjects2D12.getColumnIndex(comparable22);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj25 = keyedObjects2D24.clone();
        int int27 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D24.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int32 = keyedObjects2D24.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj33 = keyedObjects2D24.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj35 = keyedObjects2D34.clone();
        int int37 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj38 = keyedObjects2D34.clone();
        int int39 = keyedObjects2D34.getColumnCount();
        keyedObjects2D24.addObject((java.lang.Object) int39, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D12.setObject((java.lang.Object) int39, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D12.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        keyedObjects2D12.removeRow((java.lang.Comparable) (byte) 100);
        keyedObjects2D0.setObject((java.lang.Object) (byte) 100, (java.lang.Comparable) '#', (java.lang.Comparable) '#');
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj55 = keyedObjects2D54.clone();
        int int57 = keyedObjects2D54.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D54.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int62 = keyedObjects2D54.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj63 = keyedObjects2D54.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D64 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj65 = keyedObjects2D64.clone();
        int int67 = keyedObjects2D64.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj68 = keyedObjects2D64.clone();
        int int69 = keyedObjects2D64.getColumnCount();
        keyedObjects2D54.addObject((java.lang.Object) int69, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        int int73 = keyedObjects2D54.getColumnCount();
        java.lang.Comparable comparable75 = keyedObjects2D54.getRowKey(0);
        java.util.List list76 = keyedObjects2D54.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) list76, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D24 and keyedObjects2D54", keyedObjects2D24.equals(keyedObjects2D54) ? keyedObjects2D24.hashCode() == keyedObjects2D54.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        java.lang.Object obj12 = keyedObjects2D0.clone();
        java.util.List list13 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj12", keyedObjects2D0.equals(obj12) ? keyedObjects2D0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj14 = keyedObjects2D0.clone();
        int int15 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D7.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int15 = keyedObjects2D7.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj16 = keyedObjects2D7.clone();
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D7.getColumnIndex(comparable17);
        int int20 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj22 = keyedObjects2D21.clone();
        java.util.List list23 = keyedObjects2D21.getRowKeys();
        keyedObjects2D21.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        java.util.List list30 = keyedObjects2D28.getRowKeys();
        keyedObjects2D21.addObject((java.lang.Object) list30, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        keyedObjects2D7.addObject((java.lang.Object) list30, (java.lang.Comparable) (short) 10, (java.lang.Comparable) ' ');
        keyedObjects2D0.addObject((java.lang.Object) (short) 10, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D0.clone();
        int int41 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj40", keyedObjects2D0.equals(obj40) ? keyedObjects2D0.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.lang.Object obj19 = keyedObjects2D0.clone();
        java.util.List list20 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj19", keyedObjects2D0.equals(obj19) ? keyedObjects2D0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = keyedObjects2D14.equals((java.lang.Object) (-1L));
        java.lang.Object obj19 = keyedObjects2D14.clone();
        int int20 = keyedObjects2D14.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj22 = keyedObjects2D21.clone();
        int int24 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D21.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int29 = keyedObjects2D21.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj30 = keyedObjects2D21.clone();
        java.lang.Comparable comparable31 = null;
        int int32 = keyedObjects2D21.getColumnIndex(comparable31);
        int int34 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj36 = keyedObjects2D35.clone();
        java.util.List list37 = keyedObjects2D35.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj43 = keyedObjects2D42.clone();
        java.util.List list44 = keyedObjects2D42.getRowKeys();
        keyedObjects2D35.addObject((java.lang.Object) list44, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        keyedObjects2D21.addObject((java.lang.Object) list44, (java.lang.Comparable) (short) 10, (java.lang.Comparable) ' ');
        keyedObjects2D14.addObject((java.lang.Object) (short) 10, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Object obj54 = keyedObjects2D14.clone();
        boolean boolean55 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and obj54", keyedObjects2D14.equals(obj54) ? keyedObjects2D14.hashCode() == obj54.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        int int18 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D15.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int23 = keyedObjects2D15.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj24 = keyedObjects2D15.clone();
        java.lang.Comparable comparable25 = null;
        int int26 = keyedObjects2D15.getColumnIndex(comparable25);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj28 = keyedObjects2D27.clone();
        int int30 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D27.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int35 = keyedObjects2D27.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj36 = keyedObjects2D27.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj38 = keyedObjects2D37.clone();
        int int40 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj41 = keyedObjects2D37.clone();
        int int42 = keyedObjects2D37.getColumnCount();
        keyedObjects2D27.addObject((java.lang.Object) int42, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D15.setObject((java.lang.Object) int42, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D15.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable53 = keyedObjects2D15.getColumnKey((int) (byte) 1);
        keyedObjects2D15.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj57 = keyedObjects2D15.clone();
        keyedObjects2D0.addObject(obj57, (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D15 and obj57", keyedObjects2D15.equals(obj57) ? keyedObjects2D15.hashCode() == obj57.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        java.lang.Object obj12 = keyedObjects2D0.clone();
        int int13 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj12", keyedObjects2D0.equals(obj12) ? keyedObjects2D0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        java.util.List list13 = keyedObjects2D10.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = keyedObjects2D14.equals((java.lang.Object) (-1L));
        java.lang.Object obj19 = keyedObjects2D14.clone();
        int int20 = keyedObjects2D14.getColumnCount();
        keyedObjects2D10.setObject((java.lang.Object) int20, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        boolean boolean26 = keyedObjects2D24.equals((java.lang.Object) (byte) 10);
        boolean boolean28 = keyedObjects2D24.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        int int32 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list33 = keyedObjects2D29.getRowKeys();
        keyedObjects2D24.setObject((java.lang.Object) list33, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int38 = keyedObjects2D24.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D24, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        int int42 = keyedObjects2D24.getRowCount();
        int int44 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) 100.0f, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj48 = keyedObjects2D0.clone();
        int int49 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj48", keyedObjects2D0.equals(obj48) ? keyedObjects2D0.hashCode() == obj48.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.lang.Object obj36 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass37 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj36", keyedObjects2D0.equals(obj36) ? keyedObjects2D0.hashCode() == obj36.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) 0);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        int int11 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1.0d);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 10);
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
        java.lang.Object obj79 = keyedObjects2D14.clone();
        keyedObjects2D0.addObject(obj79, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and obj79", keyedObjects2D14.equals(obj79) ? keyedObjects2D14.hashCode() == obj79.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        boolean boolean13 = keyedObjects2D11.equals((java.lang.Object) (byte) 10);
        boolean boolean15 = keyedObjects2D11.equals((java.lang.Object) (-1L));
        keyedObjects2D11.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list19 = keyedObjects2D11.getColumnKeys();
        int int20 = keyedObjects2D11.getRowCount();
        java.util.List list21 = keyedObjects2D11.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        boolean boolean24 = keyedObjects2D22.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = keyedObjects2D22.clone();
        keyedObjects2D11.setObject(obj25, (java.lang.Comparable) '#', (java.lang.Comparable) (byte) 0);
        java.lang.Object obj29 = keyedObjects2D11.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D11, (java.lang.Comparable) 0L, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D11 and obj29", keyedObjects2D11.equals(obj29) ? keyedObjects2D11.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        int int24 = keyedObjects2D0.getColumnCount();
        int int26 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        boolean boolean31 = keyedObjects2D29.equals((java.lang.Object) (byte) 10);
        boolean boolean33 = keyedObjects2D29.equals((java.lang.Object) (-1L));
        java.util.List list34 = keyedObjects2D29.getRowKeys();
        java.util.List list35 = keyedObjects2D29.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        boolean boolean38 = keyedObjects2D36.equals((java.lang.Object) (byte) 10);
        boolean boolean40 = keyedObjects2D36.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj42 = keyedObjects2D41.clone();
        int int44 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list45 = keyedObjects2D41.getRowKeys();
        keyedObjects2D36.setObject((java.lang.Object) list45, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int50 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int51 = keyedObjects2D36.getRowCount();
        keyedObjects2D29.setObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        boolean boolean57 = keyedObjects2D55.equals((java.lang.Object) (byte) 10);
        boolean boolean59 = keyedObjects2D55.equals((java.lang.Object) (-1L));
        java.lang.Object obj60 = keyedObjects2D55.clone();
        java.util.List list61 = keyedObjects2D55.getColumnKeys();
        keyedObjects2D29.addObject((java.lang.Object) list61, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable66 = keyedObjects2D29.getRowKey((int) (byte) 0);
        boolean boolean67 = keyedObjects2D0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D2 and keyedObjects2D36", keyedObjects2D2.equals(keyedObjects2D36) ? keyedObjects2D2.hashCode() == keyedObjects2D36.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        java.util.List list13 = keyedObjects2D10.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = keyedObjects2D14.equals((java.lang.Object) (-1L));
        java.lang.Object obj19 = keyedObjects2D14.clone();
        int int20 = keyedObjects2D14.getColumnCount();
        keyedObjects2D10.setObject((java.lang.Object) int20, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        boolean boolean26 = keyedObjects2D24.equals((java.lang.Object) (byte) 10);
        boolean boolean28 = keyedObjects2D24.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        int int32 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list33 = keyedObjects2D29.getRowKeys();
        keyedObjects2D24.setObject((java.lang.Object) list33, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int38 = keyedObjects2D24.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D24, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        int int42 = keyedObjects2D24.getRowCount();
        int int44 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) 100.0f, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj48 = keyedObjects2D0.clone();
        java.util.List list49 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj48", keyedObjects2D0.equals(obj48) ? keyedObjects2D0.hashCode() == obj48.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        java.lang.Object obj19 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj19", keyedObjects2D0.equals(obj19) ? keyedObjects2D0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        keyedObjects2D0.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable8 = null;
        int int9 = keyedObjects2D0.getRowIndex(comparable8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        int int13 = keyedObjects2D10.getRowCount();
        boolean boolean15 = keyedObjects2D10.equals((java.lang.Object) (short) -1);
        keyedObjects2D0.addObject((java.lang.Object) boolean15, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 0);
        int int19 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj20 = keyedObjects2D0.clone();
        int int21 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj20", keyedObjects2D0.equals(obj20) ? keyedObjects2D0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getRowKeys();
        int int18 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        boolean boolean24 = keyedObjects2D22.equals((java.lang.Object) (byte) 10);
        java.util.List list25 = keyedObjects2D22.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) list25, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 3);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        int int30 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int22 = keyedObjects2D14.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj23 = keyedObjects2D14.clone();
        java.lang.Comparable comparable24 = null;
        int int25 = keyedObjects2D14.getColumnIndex(comparable24);
        keyedObjects2D0.setObject((java.lang.Object) int25, (java.lang.Comparable) 0, (java.lang.Comparable) 0);
        int int29 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj31 = keyedObjects2D30.clone();
        int int33 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D30.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int38 = keyedObjects2D30.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj39 = keyedObjects2D30.clone();
        java.lang.Comparable comparable40 = null;
        int int41 = keyedObjects2D30.getColumnIndex(comparable40);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj43 = keyedObjects2D42.clone();
        int int45 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D42.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int50 = keyedObjects2D42.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj51 = keyedObjects2D42.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj53 = keyedObjects2D52.clone();
        int int55 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj56 = keyedObjects2D52.clone();
        int int57 = keyedObjects2D52.getColumnCount();
        keyedObjects2D42.addObject((java.lang.Object) int57, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D30.setObject((java.lang.Object) int57, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D30.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable68 = keyedObjects2D30.getColumnKey((int) (byte) 1);
        keyedObjects2D30.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj72 = keyedObjects2D30.clone();
        keyedObjects2D0.setObject(obj72, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D30 and obj72", keyedObjects2D30.equals(obj72) ? keyedObjects2D30.hashCode() == obj72.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = new org.jfree.data.KeyedObjects2D();
        boolean boolean5 = keyedObjects2D3.equals((java.lang.Object) (byte) 10);
        boolean boolean7 = keyedObjects2D3.equals((java.lang.Object) (-1L));
        int int9 = keyedObjects2D3.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj10 = keyedObjects2D3.clone();
        java.util.List list11 = keyedObjects2D3.getColumnKeys();
        int int13 = keyedObjects2D3.getRowIndex((java.lang.Comparable) (-1.0f));
        int int14 = keyedObjects2D3.getColumnCount();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D3);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj17 = keyedObjects2D16.clone();
        int int19 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj20 = keyedObjects2D16.clone();
        int int21 = keyedObjects2D16.getColumnCount();
        keyedObjects2D16.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int26 = keyedObjects2D16.getRowCount();
        keyedObjects2D16.removeRow(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        int int32 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list33 = keyedObjects2D29.getRowKeys();
        int int34 = keyedObjects2D29.getRowCount();
        java.util.List list35 = keyedObjects2D29.getColumnKeys();
        keyedObjects2D29.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0);
        keyedObjects2D16.setObject((java.lang.Object) 1.0f, (java.lang.Comparable) 2, (java.lang.Comparable) (byte) 10);
        java.lang.Object obj42 = keyedObjects2D16.clone();
        keyedObjects2D3.setObject((java.lang.Object) keyedObjects2D16, (java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D16 and obj42", keyedObjects2D16.equals(obj42) ? keyedObjects2D16.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) '4');
        java.util.List list29 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj30 = keyedObjects2D0.clone();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj30", keyedObjects2D0.equals(obj30) ? keyedObjects2D0.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        int int5 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        java.util.List list9 = keyedObjects2D6.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        boolean boolean14 = keyedObjects2D10.equals((java.lang.Object) (-1L));
        java.lang.Object obj15 = keyedObjects2D10.clone();
        int int16 = keyedObjects2D10.getColumnCount();
        keyedObjects2D6.setObject((java.lang.Object) int16, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        boolean boolean22 = keyedObjects2D20.equals((java.lang.Object) (byte) 10);
        boolean boolean24 = keyedObjects2D20.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj26 = keyedObjects2D25.clone();
        int int28 = keyedObjects2D25.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list29 = keyedObjects2D25.getRowKeys();
        keyedObjects2D20.setObject((java.lang.Object) list29, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int34 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        int int38 = keyedObjects2D20.getRowCount();
        int int40 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj41 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj41, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D20 and obj41", keyedObjects2D20.equals(obj41) ? keyedObjects2D20.hashCode() == obj41.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj4 = keyedObjects2D3.clone();
        int int6 = keyedObjects2D3.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj7 = keyedObjects2D3.clone();
        int int8 = keyedObjects2D3.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D3, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        java.util.List list14 = keyedObjects2D12.getColumnKeys();
        int int15 = keyedObjects2D12.getRowCount();
        int int17 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list18 = keyedObjects2D12.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list18, (java.lang.Comparable) 0, (java.lang.Comparable) 1L);
        int int23 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Object obj24 = keyedObjects2D0.clone();
        int int25 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj24", keyedObjects2D0.equals(obj24) ? keyedObjects2D0.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int20 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj21 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        int int25 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj26 = keyedObjects2D22.clone();
        int int27 = keyedObjects2D22.getColumnCount();
        keyedObjects2D12.addObject((java.lang.Object) int27, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D0.setObject((java.lang.Object) int27, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable38 = keyedObjects2D0.getColumnKey((int) (byte) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj42 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass43 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj42", keyedObjects2D0.equals(obj42) ? keyedObjects2D0.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        int int14 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        int int13 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = keyedObjects2D14.equals((java.lang.Object) (-1L));
        java.lang.Object obj19 = keyedObjects2D14.clone();
        int int20 = keyedObjects2D14.getColumnCount();
        java.util.List list21 = keyedObjects2D14.getColumnKeys();
        int int22 = keyedObjects2D14.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj24 = keyedObjects2D23.clone();
        int int26 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D23.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int31 = keyedObjects2D23.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj32 = keyedObjects2D23.clone();
        java.lang.Comparable comparable33 = null;
        int int34 = keyedObjects2D23.getColumnIndex(comparable33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj36 = keyedObjects2D35.clone();
        int int38 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D35.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int43 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj44 = keyedObjects2D35.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj46 = keyedObjects2D45.clone();
        int int48 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj49 = keyedObjects2D45.clone();
        int int50 = keyedObjects2D45.getColumnCount();
        keyedObjects2D35.addObject((java.lang.Object) int50, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D23.setObject((java.lang.Object) int50, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D23.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable61 = keyedObjects2D23.getColumnKey((int) (byte) 1);
        boolean boolean62 = keyedObjects2D14.equals((java.lang.Object) (byte) 1);
        keyedObjects2D0.setObject((java.lang.Object) boolean62, (java.lang.Comparable) 2, (java.lang.Comparable) "hi!");
        java.lang.Object obj66 = keyedObjects2D0.clone();
        int int67 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj66", keyedObjects2D0.equals(obj66) ? keyedObjects2D0.hashCode() == obj66.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj46 = keyedObjects2D45.clone();
        int int48 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj49 = keyedObjects2D45.clone();
        int int50 = keyedObjects2D45.getColumnCount();
        keyedObjects2D45.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        boolean boolean57 = keyedObjects2D45.equals(obj55);
        keyedObjects2D6.addObject((java.lang.Object) keyedObjects2D45, (java.lang.Comparable) 0, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D19 and keyedObjects2D45", keyedObjects2D19.equals(keyedObjects2D45) ? keyedObjects2D19.hashCode() == keyedObjects2D45.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D7.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int15 = keyedObjects2D7.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj16 = keyedObjects2D7.clone();
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D7.getColumnIndex(comparable17);
        int int20 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj22 = keyedObjects2D21.clone();
        java.util.List list23 = keyedObjects2D21.getRowKeys();
        keyedObjects2D21.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        java.util.List list30 = keyedObjects2D28.getRowKeys();
        keyedObjects2D21.addObject((java.lang.Object) list30, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        keyedObjects2D7.addObject((java.lang.Object) list30, (java.lang.Comparable) (short) 10, (java.lang.Comparable) ' ');
        keyedObjects2D0.addObject((java.lang.Object) (short) 10, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj40", keyedObjects2D0.equals(obj40) ? keyedObjects2D0.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        java.util.List list12 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        boolean boolean15 = keyedObjects2D13.equals((java.lang.Object) (byte) 10);
        boolean boolean17 = keyedObjects2D13.equals((java.lang.Object) (-1L));
        java.lang.Object obj18 = keyedObjects2D13.clone();
        int int19 = keyedObjects2D13.getColumnCount();
        java.util.List list20 = keyedObjects2D13.getColumnKeys();
        java.lang.Object obj21 = keyedObjects2D13.clone();
        keyedObjects2D13.removeObject((java.lang.Comparable) 100.0d, (java.lang.Comparable) '4');
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 1L, (java.lang.Comparable) "");
        java.lang.Object obj28 = keyedObjects2D0.clone();
        int int29 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj28", keyedObjects2D0.equals(obj28) ? keyedObjects2D0.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj34 = keyedObjects2D33.clone();
        int int36 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        int int38 = keyedObjects2D33.getColumnCount();
        keyedObjects2D33.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int43 = keyedObjects2D33.getRowCount();
        int int45 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list46 = keyedObjects2D33.getColumnKeys();
        java.util.List list47 = keyedObjects2D33.getColumnKeys();
        java.lang.Comparable comparable48 = null;
        int int49 = keyedObjects2D33.getRowIndex(comparable48);
        java.lang.Object obj50 = keyedObjects2D33.clone();
        boolean boolean51 = keyedObjects2D0.equals(obj50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D33 and obj50", keyedObjects2D33.equals(obj50) ? keyedObjects2D33.hashCode() == obj50.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        java.lang.Object obj17 = keyedObjects2D16.clone();
        int int19 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D16.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int24 = keyedObjects2D16.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj25 = keyedObjects2D16.clone();
        java.lang.Comparable comparable26 = null;
        int int27 = keyedObjects2D16.getColumnIndex(comparable26);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        int int31 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D28.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int36 = keyedObjects2D28.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj37 = keyedObjects2D28.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj39 = keyedObjects2D38.clone();
        int int41 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj42 = keyedObjects2D38.clone();
        int int43 = keyedObjects2D38.getColumnCount();
        keyedObjects2D28.addObject((java.lang.Object) int43, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D16.setObject((java.lang.Object) int43, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D16.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        boolean boolean54 = keyedObjects2D16.equals((java.lang.Object) keyedObjects2D53);
        java.util.List list55 = keyedObjects2D53.getRowKeys();
        keyedObjects2D7.setObject((java.lang.Object) list55, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
        java.lang.Object obj59 = keyedObjects2D7.clone();
        int int61 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj59", keyedObjects2D7.equals(obj59) ? keyedObjects2D7.hashCode() == obj59.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int20 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj21 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        int int25 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj26 = keyedObjects2D22.clone();
        int int27 = keyedObjects2D22.getColumnCount();
        keyedObjects2D12.addObject((java.lang.Object) int27, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D0.setObject((java.lang.Object) int27, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = new org.jfree.data.KeyedObjects2D();
        boolean boolean39 = keyedObjects2D37.equals((java.lang.Object) (byte) 10);
        boolean boolean41 = keyedObjects2D37.equals((java.lang.Object) (-1L));
        int int43 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj44 = keyedObjects2D37.clone();
        keyedObjects2D0.addObject(obj44, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj49 = keyedObjects2D48.clone();
        int int51 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj52 = keyedObjects2D48.clone();
        int int53 = keyedObjects2D48.getColumnCount();
        keyedObjects2D48.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int58 = keyedObjects2D48.getRowCount();
        int int60 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list61 = keyedObjects2D48.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj63 = keyedObjects2D62.clone();
        java.util.List list64 = keyedObjects2D62.getRowKeys();
        int int66 = keyedObjects2D62.getRowIndex((java.lang.Comparable) 10.0d);
        keyedObjects2D48.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D70 = new org.jfree.data.KeyedObjects2D();
        boolean boolean72 = keyedObjects2D70.equals((java.lang.Object) (byte) 10);
        java.util.List list73 = keyedObjects2D70.getRowKeys();
        keyedObjects2D48.addObject((java.lang.Object) list73, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 3);
        int int77 = keyedObjects2D48.getRowCount();
        java.lang.Object obj78 = keyedObjects2D48.clone();
        keyedObjects2D0.addObject(obj78, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D48 and obj78", keyedObjects2D48.equals(obj78) ? keyedObjects2D48.hashCode() == obj78.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        int int3 = keyedObjects2D0.getRowCount();
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        java.util.List list9 = keyedObjects2D6.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        boolean boolean14 = keyedObjects2D10.equals((java.lang.Object) (-1L));
        java.lang.Object obj15 = keyedObjects2D10.clone();
        int int16 = keyedObjects2D10.getColumnCount();
        keyedObjects2D6.setObject((java.lang.Object) int16, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        boolean boolean22 = keyedObjects2D20.equals((java.lang.Object) (byte) 10);
        boolean boolean24 = keyedObjects2D20.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj26 = keyedObjects2D25.clone();
        int int28 = keyedObjects2D25.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list29 = keyedObjects2D25.getRowKeys();
        keyedObjects2D20.setObject((java.lang.Object) list29, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int34 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        int int38 = keyedObjects2D20.getRowCount();
        int int40 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 100.0f);
        boolean boolean41 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        boolean boolean44 = keyedObjects2D42.equals((java.lang.Object) (byte) 10);
        boolean boolean46 = keyedObjects2D42.equals((java.lang.Object) (-1L));
        keyedObjects2D42.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        int int50 = keyedObjects2D42.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int50, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1L);
        java.lang.Object obj54 = keyedObjects2D0.clone();
        java.lang.Object obj55 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj54", keyedObjects2D0.equals(obj54) ? keyedObjects2D0.hashCode() == obj54.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        boolean boolean11 = keyedObjects2D9.equals((java.lang.Object) (byte) 10);
        boolean boolean13 = keyedObjects2D9.equals((java.lang.Object) (-1L));
        keyedObjects2D9.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D9.getRowIndex(comparable17);
        keyedObjects2D0.addObject((java.lang.Object) int18, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj22 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass23 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj22", keyedObjects2D0.equals(obj22) ? keyedObjects2D0.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        int int32 = keyedObjects2D14.getRowCount();
        int int34 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj35 = keyedObjects2D14.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        keyedObjects2D36.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int46 = keyedObjects2D36.getRowCount();
        int int48 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj49 = keyedObjects2D36.clone();
        keyedObjects2D14.setObject(obj49, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D36 and obj49", keyedObjects2D36.equals(obj49) ? keyedObjects2D36.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        java.lang.Object obj29 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass30 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj14 = keyedObjects2D0.clone();
        java.lang.Comparable comparable16 = keyedObjects2D0.getRowKey(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        int int24 = keyedObjects2D0.getColumnCount();
        int int26 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        int int32 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj33 = keyedObjects2D29.clone();
        int int34 = keyedObjects2D29.getColumnCount();
        keyedObjects2D29.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D29.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj42 = keyedObjects2D41.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj44 = keyedObjects2D43.clone();
        java.util.List list45 = keyedObjects2D43.getColumnKeys();
        int int46 = keyedObjects2D43.getRowCount();
        boolean boolean47 = keyedObjects2D41.equals((java.lang.Object) int46);
        java.util.List list48 = keyedObjects2D41.getColumnKeys();
        keyedObjects2D29.addObject((java.lang.Object) keyedObjects2D41, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj54 = keyedObjects2D29.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        int int56 = keyedObjects2D55.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        boolean boolean59 = keyedObjects2D57.equals((java.lang.Object) (byte) 10);
        boolean boolean61 = keyedObjects2D57.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj63 = keyedObjects2D62.clone();
        int int65 = keyedObjects2D62.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list66 = keyedObjects2D62.getRowKeys();
        keyedObjects2D57.setObject((java.lang.Object) list66, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D55.setObject((java.lang.Object) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
        java.lang.Object obj73 = null;
        keyedObjects2D55.setObject(obj73, (java.lang.Comparable) 0, (java.lang.Comparable) false);
        int int78 = keyedObjects2D55.getColumnIndex((java.lang.Comparable) 'a');
        int int79 = keyedObjects2D55.getColumnCount();
        keyedObjects2D55.removeRow(0);
        int int82 = keyedObjects2D55.getColumnCount();
        keyedObjects2D29.setObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) "", (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D2 and keyedObjects2D57", keyedObjects2D2.equals(keyedObjects2D57) ? keyedObjects2D2.hashCode() == keyedObjects2D57.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        java.lang.Object obj26 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj26", keyedObjects2D0.equals(obj26) ? keyedObjects2D0.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        int int3 = keyedObjects2D0.getRowCount();
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        java.util.List list9 = keyedObjects2D6.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        boolean boolean12 = keyedObjects2D10.equals((java.lang.Object) (byte) 10);
        boolean boolean14 = keyedObjects2D10.equals((java.lang.Object) (-1L));
        java.lang.Object obj15 = keyedObjects2D10.clone();
        int int16 = keyedObjects2D10.getColumnCount();
        keyedObjects2D6.setObject((java.lang.Object) int16, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        boolean boolean22 = keyedObjects2D20.equals((java.lang.Object) (byte) 10);
        boolean boolean24 = keyedObjects2D20.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj26 = keyedObjects2D25.clone();
        int int28 = keyedObjects2D25.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list29 = keyedObjects2D25.getRowKeys();
        keyedObjects2D20.setObject((java.lang.Object) list29, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int34 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        int int38 = keyedObjects2D20.getRowCount();
        int int40 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 100.0f);
        boolean boolean41 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        boolean boolean44 = keyedObjects2D42.equals((java.lang.Object) (byte) 10);
        boolean boolean46 = keyedObjects2D42.equals((java.lang.Object) (-1L));
        keyedObjects2D42.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        int int50 = keyedObjects2D42.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int50, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1L);
        java.lang.Object obj54 = keyedObjects2D0.clone();
        int int56 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj54", keyedObjects2D0.equals(obj54) ? keyedObjects2D0.hashCode() == obj54.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int12 = keyedObjects2D0.getRowCount();
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Object obj14 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.util.List list23 = keyedObjects2D0.getRowKeys();
        java.util.List list24 = keyedObjects2D0.getRowKeys();
        int int26 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable28 = keyedObjects2D0.getColumnKey((int) (short) 0);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        int int31 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        int int4 = keyedObjects2D0.getColumnCount();
        java.util.List list5 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D6.equals((java.lang.Object) (byte) 10);
        boolean boolean10 = keyedObjects2D6.equals((java.lang.Object) (-1L));
        java.lang.Object obj11 = keyedObjects2D6.clone();
        java.util.List list12 = keyedObjects2D6.getColumnKeys();
        boolean boolean13 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D6);
        java.lang.Object obj14 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        java.util.List list17 = keyedObjects2D15.getRowKeys();
        keyedObjects2D15.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        java.util.List list24 = keyedObjects2D22.getRowKeys();
        keyedObjects2D15.addObject((java.lang.Object) list24, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) false);
        keyedObjects2D15.removeRow((int) (byte) 0);
        int int31 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 3);
        keyedObjects2D0.setObject((java.lang.Object) 3, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj36 = keyedObjects2D35.clone();
        int int38 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D35.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        boolean boolean44 = keyedObjects2D42.equals((java.lang.Object) (byte) 10);
        boolean boolean46 = keyedObjects2D42.equals((java.lang.Object) (-1L));
        int int48 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj49 = keyedObjects2D42.clone();
        boolean boolean50 = keyedObjects2D35.equals((java.lang.Object) keyedObjects2D42);
        java.lang.Object obj51 = keyedObjects2D42.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj53 = keyedObjects2D52.clone();
        java.util.List list54 = keyedObjects2D52.getColumnKeys();
        java.lang.Class<?> wildcardClass55 = keyedObjects2D52.getClass();
        keyedObjects2D42.setObject((java.lang.Object) wildcardClass55, (java.lang.Comparable) 1L, (java.lang.Comparable) false);
        int int60 = keyedObjects2D42.getRowIndex((java.lang.Comparable) 2);
        java.lang.Object obj61 = keyedObjects2D42.clone();
        boolean boolean62 = keyedObjects2D0.equals(obj61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D42 and obj61", keyedObjects2D42.equals(obj61) ? keyedObjects2D42.hashCode() == obj61.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        boolean boolean13 = keyedObjects2D11.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = keyedObjects2D11.clone();
        keyedObjects2D0.setObject(obj14, (java.lang.Comparable) '#', (java.lang.Comparable) (byte) 0);
        java.lang.Object obj18 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj20 = keyedObjects2D19.clone();
        int int22 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D19.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int27 = keyedObjects2D19.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj28 = keyedObjects2D19.clone();
        java.lang.Comparable comparable29 = null;
        int int30 = keyedObjects2D19.getColumnIndex(comparable29);
        java.util.List list31 = keyedObjects2D19.getColumnKeys();
        int int32 = keyedObjects2D19.getRowCount();
        boolean boolean33 = keyedObjects2D0.equals((java.lang.Object) int32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj18", keyedObjects2D0.equals(obj18) ? keyedObjects2D0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        boolean boolean11 = keyedObjects2D9.equals((java.lang.Object) (byte) 10);
        boolean boolean13 = keyedObjects2D9.equals((java.lang.Object) (-1L));
        int int15 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj16 = keyedObjects2D9.clone();
        java.util.List list17 = keyedObjects2D9.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj22 = keyedObjects2D21.clone();
        int int24 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D21.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        boolean boolean30 = keyedObjects2D28.equals((java.lang.Object) (byte) 10);
        boolean boolean32 = keyedObjects2D28.equals((java.lang.Object) (-1L));
        int int34 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj35 = keyedObjects2D28.clone();
        boolean boolean36 = keyedObjects2D21.equals((java.lang.Object) keyedObjects2D28);
        int int38 = keyedObjects2D28.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj40 = keyedObjects2D39.clone();
        java.util.List list41 = keyedObjects2D39.getRowKeys();
        keyedObjects2D39.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj47 = keyedObjects2D46.clone();
        java.util.List list48 = keyedObjects2D46.getColumnKeys();
        java.lang.Class<?> wildcardClass49 = keyedObjects2D46.getClass();
        keyedObjects2D39.setObject((java.lang.Object) keyedObjects2D46, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        keyedObjects2D28.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 10.0d);
        keyedObjects2D9.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 2);
        java.util.List list59 = keyedObjects2D9.getColumnKeys();
        keyedObjects2D9.removeObject((java.lang.Comparable) 10.0f, (java.lang.Comparable) 100L);
        java.lang.Object obj63 = keyedObjects2D9.clone();
        java.lang.Object obj64 = keyedObjects2D9.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D9 and obj63", keyedObjects2D9.equals(obj63) ? keyedObjects2D9.hashCode() == obj63.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        int int24 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeRow(0);
        java.lang.Object obj27 = keyedObjects2D0.clone();
        int int29 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj27", keyedObjects2D0.equals(obj27) ? keyedObjects2D0.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.lang.Object obj17 = keyedObjects2D16.clone();
        int int19 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D16.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int24 = keyedObjects2D16.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj25 = keyedObjects2D16.clone();
        java.lang.Comparable comparable26 = null;
        int int27 = keyedObjects2D16.getColumnIndex(comparable26);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        int int31 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D28.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int36 = keyedObjects2D28.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj37 = keyedObjects2D28.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj39 = keyedObjects2D38.clone();
        int int41 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj42 = keyedObjects2D38.clone();
        int int43 = keyedObjects2D38.getColumnCount();
        keyedObjects2D28.addObject((java.lang.Object) int43, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D16.setObject((java.lang.Object) int43, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D16.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        boolean boolean54 = keyedObjects2D16.equals((java.lang.Object) keyedObjects2D53);
        java.util.List list55 = keyedObjects2D53.getRowKeys();
        keyedObjects2D7.setObject((java.lang.Object) list55, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
        java.lang.Object obj59 = keyedObjects2D7.clone();
        int int61 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj59", keyedObjects2D7.equals(obj59) ? keyedObjects2D7.hashCode() == obj59.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj19 = keyedObjects2D18.clone();
        int int21 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D18.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int26 = keyedObjects2D18.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj27 = keyedObjects2D18.clone();
        java.lang.Comparable comparable28 = null;
        int int29 = keyedObjects2D18.getColumnIndex(comparable28);
        int int31 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean32 = keyedObjects2D0.equals((java.lang.Object) int31);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        boolean boolean35 = keyedObjects2D33.equals((java.lang.Object) (byte) 10);
        boolean boolean37 = keyedObjects2D33.equals((java.lang.Object) (-1L));
        keyedObjects2D33.addObject((java.lang.Object) (short) -1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (-1.0f));
        boolean boolean42 = keyedObjects2D0.equals((java.lang.Object) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj44 = keyedObjects2D43.clone();
        int int46 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D43.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        boolean boolean52 = keyedObjects2D50.equals((java.lang.Object) (byte) 10);
        boolean boolean54 = keyedObjects2D50.equals((java.lang.Object) (-1L));
        int int56 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj57 = keyedObjects2D50.clone();
        boolean boolean58 = keyedObjects2D43.equals((java.lang.Object) keyedObjects2D50);
        int int60 = keyedObjects2D50.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj62 = keyedObjects2D61.clone();
        java.util.List list63 = keyedObjects2D61.getRowKeys();
        keyedObjects2D61.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D68 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj69 = keyedObjects2D68.clone();
        java.util.List list70 = keyedObjects2D68.getColumnKeys();
        java.lang.Class<?> wildcardClass71 = keyedObjects2D68.getClass();
        keyedObjects2D61.setObject((java.lang.Object) keyedObjects2D68, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        keyedObjects2D50.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 10.0d);
        java.util.List list78 = keyedObjects2D50.getRowKeys();
        java.util.List list79 = keyedObjects2D50.getColumnKeys();
        java.util.List list80 = keyedObjects2D50.getRowKeys();
        boolean boolean81 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D50);
        java.lang.Object obj82 = keyedObjects2D50.clone();
        int int84 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D50 and obj82", keyedObjects2D50.equals(obj82) ? keyedObjects2D50.hashCode() == obj82.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        java.util.List list18 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int20 = keyedObjects2D19.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        boolean boolean23 = keyedObjects2D21.equals((java.lang.Object) (byte) 10);
        boolean boolean25 = keyedObjects2D21.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj27 = keyedObjects2D26.clone();
        int int29 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list30 = keyedObjects2D26.getRowKeys();
        keyedObjects2D21.setObject((java.lang.Object) list30, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D19.setObject((java.lang.Object) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
        java.lang.Object obj37 = null;
        keyedObjects2D19.setObject(obj37, (java.lang.Comparable) 0, (java.lang.Comparable) false);
        int int42 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 'a');
        java.util.List list43 = keyedObjects2D19.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list43, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D2 and keyedObjects2D21", keyedObjects2D2.equals(keyedObjects2D21) ? keyedObjects2D2.hashCode() == keyedObjects2D21.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        int int11 = keyedObjects2D0.getColumnIndex(comparable10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int20 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj21 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        int int25 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj26 = keyedObjects2D22.clone();
        int int27 = keyedObjects2D22.getColumnCount();
        keyedObjects2D12.addObject((java.lang.Object) int27, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D0.setObject((java.lang.Object) int27, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable38 = keyedObjects2D0.getColumnKey((int) (byte) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj42 = keyedObjects2D0.clone();
        java.util.List list43 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj42", keyedObjects2D0.equals(obj42) ? keyedObjects2D0.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1.0d);
        keyedObjects2D0.setObject((java.lang.Object) 1.0f, (java.lang.Comparable) 1L, (java.lang.Comparable) 10L);
        int int11 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj12 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass13 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj12", keyedObjects2D0.equals(obj12) ? keyedObjects2D0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        boolean boolean11 = keyedObjects2D9.equals((java.lang.Object) (byte) 10);
        boolean boolean13 = keyedObjects2D9.equals((java.lang.Object) (-1L));
        keyedObjects2D9.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D9.getRowIndex(comparable17);
        keyedObjects2D0.addObject((java.lang.Object) int18, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        int int25 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D22.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        boolean boolean31 = keyedObjects2D29.equals((java.lang.Object) (byte) 10);
        boolean boolean33 = keyedObjects2D29.equals((java.lang.Object) (-1L));
        int int35 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj36 = keyedObjects2D29.clone();
        boolean boolean37 = keyedObjects2D22.equals((java.lang.Object) keyedObjects2D29);
        java.lang.Object obj38 = keyedObjects2D29.clone();
        java.util.List list39 = keyedObjects2D29.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0.0f);
        java.util.List list43 = keyedObjects2D29.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj45 = keyedObjects2D44.clone();
        int int47 = keyedObjects2D44.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj48 = keyedObjects2D44.clone();
        int int49 = keyedObjects2D44.getColumnCount();
        keyedObjects2D44.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D44.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj57 = keyedObjects2D56.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj59 = keyedObjects2D58.clone();
        java.util.List list60 = keyedObjects2D58.getColumnKeys();
        int int61 = keyedObjects2D58.getRowCount();
        boolean boolean62 = keyedObjects2D56.equals((java.lang.Object) int61);
        java.util.List list63 = keyedObjects2D56.getColumnKeys();
        keyedObjects2D44.addObject((java.lang.Object) keyedObjects2D56, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        java.lang.Object obj69 = keyedObjects2D44.getObject(0, 0);
        int int71 = keyedObjects2D44.getRowIndex((java.lang.Comparable) 100);
        java.util.List list72 = keyedObjects2D44.getColumnKeys();
        java.lang.Object obj73 = keyedObjects2D44.clone();
        keyedObjects2D29.addObject(obj73, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D44 and obj73", keyedObjects2D44.equals(obj73) ? keyedObjects2D44.hashCode() == obj73.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass8 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        int int13 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        boolean boolean19 = keyedObjects2D17.equals((java.lang.Object) (byte) 10);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj23 = keyedObjects2D22.clone();
        java.util.List list24 = keyedObjects2D22.getRowKeys();
        keyedObjects2D22.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        java.util.List list31 = keyedObjects2D29.getColumnKeys();
        java.lang.Class<?> wildcardClass32 = keyedObjects2D29.getClass();
        keyedObjects2D22.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        java.lang.Object obj36 = keyedObjects2D29.clone();
        boolean boolean37 = keyedObjects2D0.equals(obj36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj21", keyedObjects2D0.equals(obj21) ? keyedObjects2D0.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D2 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj3 = keyedObjects2D2.clone();
        java.util.List list4 = keyedObjects2D2.getColumnKeys();
        int int5 = keyedObjects2D2.getRowCount();
        boolean boolean6 = keyedObjects2D0.equals((java.lang.Object) int5);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        boolean boolean10 = keyedObjects2D8.equals((java.lang.Object) (byte) 10);
        int int11 = keyedObjects2D8.getRowCount();
        int int13 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        boolean boolean16 = keyedObjects2D14.equals((java.lang.Object) (byte) 10);
        java.util.List list17 = keyedObjects2D14.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        boolean boolean20 = keyedObjects2D18.equals((java.lang.Object) (byte) 10);
        boolean boolean22 = keyedObjects2D18.equals((java.lang.Object) (-1L));
        java.lang.Object obj23 = keyedObjects2D18.clone();
        int int24 = keyedObjects2D18.getColumnCount();
        keyedObjects2D14.setObject((java.lang.Object) int24, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        boolean boolean30 = keyedObjects2D28.equals((java.lang.Object) (byte) 10);
        boolean boolean32 = keyedObjects2D28.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj34 = keyedObjects2D33.clone();
        int int36 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list37 = keyedObjects2D33.getRowKeys();
        keyedObjects2D28.setObject((java.lang.Object) list37, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int42 = keyedObjects2D28.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        int int46 = keyedObjects2D28.getRowCount();
        int int48 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 100.0f);
        boolean boolean49 = keyedObjects2D8.equals((java.lang.Object) keyedObjects2D28);
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        boolean boolean52 = keyedObjects2D50.equals((java.lang.Object) (byte) 10);
        boolean boolean54 = keyedObjects2D50.equals((java.lang.Object) (-1L));
        keyedObjects2D50.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        int int58 = keyedObjects2D50.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int58, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1L);
        java.lang.Object obj62 = keyedObjects2D8.clone();
        boolean boolean63 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj62", keyedObjects2D8.equals(obj62) ? keyedObjects2D8.hashCode() == obj62.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D5.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        boolean boolean14 = keyedObjects2D12.equals((java.lang.Object) (byte) 10);
        boolean boolean16 = keyedObjects2D12.equals((java.lang.Object) (-1L));
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj19 = keyedObjects2D12.clone();
        boolean boolean20 = keyedObjects2D5.equals((java.lang.Object) keyedObjects2D12);
        int int21 = keyedObjects2D5.getRowCount();
        boolean boolean22 = keyedObjects2D0.equals((java.lang.Object) int21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        boolean boolean25 = keyedObjects2D23.equals((java.lang.Object) (byte) 10);
        int int26 = keyedObjects2D23.getRowCount();
        int int28 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        boolean boolean31 = keyedObjects2D29.equals((java.lang.Object) (byte) 10);
        boolean boolean33 = keyedObjects2D29.equals((java.lang.Object) 10.0d);
        int int35 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D36.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int44 = keyedObjects2D36.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj45 = keyedObjects2D36.clone();
        java.lang.Comparable comparable46 = null;
        int int47 = keyedObjects2D36.getColumnIndex(comparable46);
        java.util.List list48 = keyedObjects2D36.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj50 = keyedObjects2D49.clone();
        int int52 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj53 = keyedObjects2D49.clone();
        int int54 = keyedObjects2D49.getColumnCount();
        keyedObjects2D49.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D49.removeColumn(0);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj62 = keyedObjects2D61.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj64 = keyedObjects2D63.clone();
        java.util.List list65 = keyedObjects2D63.getColumnKeys();
        int int66 = keyedObjects2D63.getRowCount();
        boolean boolean67 = keyedObjects2D61.equals((java.lang.Object) int66);
        java.util.List list68 = keyedObjects2D61.getColumnKeys();
        keyedObjects2D49.addObject((java.lang.Object) keyedObjects2D61, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        keyedObjects2D49.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        keyedObjects2D36.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 0, (java.lang.Comparable) (short) -1);
        boolean boolean78 = keyedObjects2D29.equals((java.lang.Object) 0);
        java.lang.Object obj79 = keyedObjects2D29.clone();
        keyedObjects2D23.addObject(obj79, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D83 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj84 = keyedObjects2D83.clone();
        java.util.List list85 = keyedObjects2D83.getColumnKeys();
        java.lang.Class<?> wildcardClass86 = keyedObjects2D83.getClass();
        boolean boolean87 = keyedObjects2D23.equals((java.lang.Object) keyedObjects2D83);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D83, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 1);
        java.lang.Object obj91 = keyedObjects2D0.clone();
        int int93 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj91", keyedObjects2D0.equals(obj91) ? keyedObjects2D0.hashCode() == obj91.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj19 = keyedObjects2D18.clone();
        int int21 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D18.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int26 = keyedObjects2D18.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj27 = keyedObjects2D18.clone();
        java.lang.Comparable comparable28 = null;
        int int29 = keyedObjects2D18.getColumnIndex(comparable28);
        int int31 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean32 = keyedObjects2D0.equals((java.lang.Object) int31);
        java.util.List list33 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj35 = keyedObjects2D34.clone();
        int int37 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list38 = keyedObjects2D34.getRowKeys();
        int int39 = keyedObjects2D34.getRowCount();
        java.util.List list40 = keyedObjects2D34.getColumnKeys();
        java.util.List list41 = keyedObjects2D34.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D42.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        boolean boolean46 = keyedObjects2D44.equals((java.lang.Object) (byte) 10);
        boolean boolean48 = keyedObjects2D44.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj50 = keyedObjects2D49.clone();
        int int52 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list53 = keyedObjects2D49.getRowKeys();
        keyedObjects2D44.setObject((java.lang.Object) list53, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D42.setObject((java.lang.Object) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
        java.util.List list60 = keyedObjects2D42.getColumnKeys();
        boolean boolean61 = keyedObjects2D34.equals((java.lang.Object) keyedObjects2D42);
        int int62 = keyedObjects2D34.getRowCount();
        boolean boolean63 = keyedObjects2D0.equals((java.lang.Object) int62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D42", keyedObjects2D0.equals(keyedObjects2D42) ? keyedObjects2D0.hashCode() == keyedObjects2D42.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj5 = keyedObjects2D4.clone();
        int int7 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 1);
        int int9 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj11 = keyedObjects2D10.clone();
        java.util.List list12 = keyedObjects2D10.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj18 = keyedObjects2D17.clone();
        java.util.List list19 = keyedObjects2D17.getColumnKeys();
        java.lang.Class<?> wildcardClass20 = keyedObjects2D17.getClass();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj25 = keyedObjects2D24.clone();
        int int27 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D24.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int32 = keyedObjects2D24.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj33 = keyedObjects2D24.clone();
        java.lang.Comparable comparable34 = null;
        int int35 = keyedObjects2D24.getColumnIndex(comparable34);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D36.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int44 = keyedObjects2D36.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj45 = keyedObjects2D36.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj47 = keyedObjects2D46.clone();
        int int49 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj50 = keyedObjects2D46.clone();
        int int51 = keyedObjects2D46.getColumnCount();
        keyedObjects2D36.addObject((java.lang.Object) int51, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D24.setObject((java.lang.Object) int51, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D24.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        boolean boolean63 = keyedObjects2D61.equals((java.lang.Object) (byte) 10);
        boolean boolean65 = keyedObjects2D61.equals((java.lang.Object) (-1L));
        int int67 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj68 = keyedObjects2D61.clone();
        keyedObjects2D24.addObject(obj68, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D24, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        boolean boolean75 = keyedObjects2D4.equals((java.lang.Object) keyedObjects2D10);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        java.lang.Object obj79 = keyedObjects2D10.clone();
        int int81 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D10 and obj79", keyedObjects2D10.equals(obj79) ? keyedObjects2D10.hashCode() == obj79.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        int int14 = keyedObjects2D0.getRowCount();
        java.lang.Object obj15 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        boolean boolean18 = keyedObjects2D16.equals((java.lang.Object) (byte) 10);
        boolean boolean20 = keyedObjects2D16.equals((java.lang.Object) (-1L));
        java.util.List list21 = keyedObjects2D16.getRowKeys();
        java.util.List list22 = keyedObjects2D16.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        boolean boolean25 = keyedObjects2D23.equals((java.lang.Object) (byte) 10);
        boolean boolean27 = keyedObjects2D23.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        int int31 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list32 = keyedObjects2D28.getRowKeys();
        keyedObjects2D23.setObject((java.lang.Object) list32, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int37 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int38 = keyedObjects2D23.getRowCount();
        keyedObjects2D16.setObject((java.lang.Object) keyedObjects2D23, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 100);
        int int42 = keyedObjects2D23.getColumnCount();
        java.lang.Object obj43 = keyedObjects2D23.clone();
        keyedObjects2D0.setObject(obj43, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D23 and obj43", keyedObjects2D23.equals(obj43) ? keyedObjects2D23.hashCode() == obj43.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getColumnKeys();
        int int17 = keyedObjects2D14.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        boolean boolean20 = keyedObjects2D18.equals((java.lang.Object) (byte) 10);
        boolean boolean22 = keyedObjects2D18.equals((java.lang.Object) 10.0d);
        keyedObjects2D14.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int26 = keyedObjects2D14.getRowCount();
        boolean boolean27 = keyedObjects2D0.equals((java.lang.Object) int26);
        keyedObjects2D0.removeObject((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 10);
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj35 = keyedObjects2D34.clone();
        java.util.List list36 = keyedObjects2D34.getColumnKeys();
        int int37 = keyedObjects2D34.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        boolean boolean40 = keyedObjects2D38.equals((java.lang.Object) (byte) 10);
        boolean boolean42 = keyedObjects2D38.equals((java.lang.Object) 10.0d);
        keyedObjects2D34.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int47 = keyedObjects2D34.getRowIndex((java.lang.Comparable) 100L);
        keyedObjects2D34.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) 'a', (java.lang.Comparable) (short) 100, (java.lang.Comparable) 10.0f);
        java.lang.Object obj54 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj54", keyedObjects2D0.equals(obj54) ? keyedObjects2D0.hashCode() == obj54.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj7 = keyedObjects2D6.clone();
        int int9 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int14 = keyedObjects2D6.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj15 = keyedObjects2D6.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj17 = keyedObjects2D16.clone();
        int int19 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj20 = keyedObjects2D16.clone();
        int int21 = keyedObjects2D16.getColumnCount();
        keyedObjects2D6.addObject((java.lang.Object) int21, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        int int25 = keyedObjects2D6.getColumnCount();
        java.lang.Class<?> wildcardClass26 = keyedObjects2D6.getClass();
        boolean boolean27 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D6);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj29 = keyedObjects2D28.clone();
        int int31 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D28.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        boolean boolean37 = keyedObjects2D35.equals((java.lang.Object) (byte) 10);
        boolean boolean39 = keyedObjects2D35.equals((java.lang.Object) (-1L));
        int int41 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj42 = keyedObjects2D35.clone();
        boolean boolean43 = keyedObjects2D28.equals((java.lang.Object) keyedObjects2D35);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj45 = keyedObjects2D44.clone();
        int int47 = keyedObjects2D44.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D44.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int52 = keyedObjects2D44.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj53 = keyedObjects2D44.clone();
        java.lang.Comparable comparable54 = null;
        int int55 = keyedObjects2D44.getColumnIndex(comparable54);
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj57 = keyedObjects2D56.clone();
        int int59 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D56.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int64 = keyedObjects2D56.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj65 = keyedObjects2D56.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D66 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj67 = keyedObjects2D66.clone();
        int int69 = keyedObjects2D66.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj70 = keyedObjects2D66.clone();
        int int71 = keyedObjects2D66.getColumnCount();
        keyedObjects2D56.addObject((java.lang.Object) int71, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D44.setObject((java.lang.Object) int71, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D44.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D81 = new org.jfree.data.KeyedObjects2D();
        boolean boolean82 = keyedObjects2D44.equals((java.lang.Object) keyedObjects2D81);
        java.util.List list83 = keyedObjects2D81.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) list83, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
        java.lang.Object obj87 = keyedObjects2D35.clone();
        keyedObjects2D6.setObject(obj87, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D35 and obj87", keyedObjects2D35.equals(obj87) ? keyedObjects2D35.hashCode() == obj87.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        keyedObjects2D0.removeColumn(0);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        java.util.List list16 = keyedObjects2D14.getColumnKeys();
        int int17 = keyedObjects2D14.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        boolean boolean20 = keyedObjects2D18.equals((java.lang.Object) (byte) 10);
        boolean boolean22 = keyedObjects2D18.equals((java.lang.Object) 10.0d);
        keyedObjects2D14.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int26 = keyedObjects2D14.getRowCount();
        boolean boolean27 = keyedObjects2D0.equals((java.lang.Object) int26);
        keyedObjects2D0.removeObject((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 10);
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj35 = keyedObjects2D34.clone();
        java.util.List list36 = keyedObjects2D34.getColumnKeys();
        int int37 = keyedObjects2D34.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        boolean boolean40 = keyedObjects2D38.equals((java.lang.Object) (byte) 10);
        boolean boolean42 = keyedObjects2D38.equals((java.lang.Object) 10.0d);
        keyedObjects2D34.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int47 = keyedObjects2D34.getRowIndex((java.lang.Comparable) 100L);
        keyedObjects2D34.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) 'a', (java.lang.Comparable) (short) 100, (java.lang.Comparable) 10.0f);
        java.lang.Object obj54 = keyedObjects2D0.clone();
        java.util.List list55 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj54", keyedObjects2D0.equals(obj54) ? keyedObjects2D0.hashCode() == obj54.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int10 = keyedObjects2D0.getRowCount();
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        int int13 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) '4');
        java.lang.Object obj17 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj17", keyedObjects2D0.equals(obj17) ? keyedObjects2D0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        int int53 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D50.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int58 = keyedObjects2D50.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj59 = keyedObjects2D50.clone();
        java.lang.Comparable comparable60 = null;
        int int61 = keyedObjects2D50.getColumnIndex(comparable60);
        keyedObjects2D36.setObject((java.lang.Object) int61, (java.lang.Comparable) 0, (java.lang.Comparable) 0);
        int int66 = keyedObjects2D36.getRowIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj67 = keyedObjects2D36.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D36 and obj67", keyedObjects2D36.equals(obj67) ? keyedObjects2D36.hashCode() == obj67.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int9 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 1);
        java.util.List list14 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        java.util.List list17 = keyedObjects2D15.getColumnKeys();
        int int18 = keyedObjects2D15.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        boolean boolean21 = keyedObjects2D19.equals((java.lang.Object) (byte) 10);
        boolean boolean23 = keyedObjects2D19.equals((java.lang.Object) 10.0d);
        keyedObjects2D15.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        int int27 = keyedObjects2D15.getRowCount();
        java.lang.Object obj28 = keyedObjects2D15.clone();
        keyedObjects2D0.addObject(obj28, (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D15 and obj28", keyedObjects2D15.equals(obj28) ? keyedObjects2D15.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        java.util.List list23 = keyedObjects2D0.getRowKeys();
        java.util.List list24 = keyedObjects2D0.getRowKeys();
        int int26 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable28 = keyedObjects2D0.getColumnKey((int) (short) 0);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        java.lang.Comparable comparable30 = null;
        int int31 = keyedObjects2D0.getColumnIndex(comparable30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        int int22 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj23 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass24 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj23", keyedObjects2D0.equals(obj23) ? keyedObjects2D0.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj5 = keyedObjects2D4.clone();
        int int7 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D4.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        boolean boolean13 = keyedObjects2D11.equals((java.lang.Object) (byte) 10);
        boolean boolean15 = keyedObjects2D11.equals((java.lang.Object) (-1L));
        int int17 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj18 = keyedObjects2D11.clone();
        boolean boolean19 = keyedObjects2D4.equals((java.lang.Object) keyedObjects2D11);
        java.lang.Object obj20 = keyedObjects2D11.clone();
        keyedObjects2D11.removeObject((java.lang.Comparable) '#', (java.lang.Comparable) "hi!");
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D11, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        int int28 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        java.util.List list31 = keyedObjects2D29.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj33 = keyedObjects2D32.clone();
        int int35 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj36 = keyedObjects2D32.clone();
        int int37 = keyedObjects2D32.getColumnCount();
        keyedObjects2D29.addObject((java.lang.Object) keyedObjects2D32, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj42 = keyedObjects2D41.clone();
        java.util.List list43 = keyedObjects2D41.getColumnKeys();
        int int44 = keyedObjects2D41.getRowCount();
        int int46 = keyedObjects2D41.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list47 = keyedObjects2D41.getColumnKeys();
        keyedObjects2D29.addObject((java.lang.Object) list47, (java.lang.Comparable) 0, (java.lang.Comparable) 1L);
        int int52 = keyedObjects2D29.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Comparable comparable54 = keyedObjects2D29.getRowKey(0);
        java.lang.Object obj55 = keyedObjects2D29.clone();
        boolean boolean56 = keyedObjects2D11.equals(obj55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D29 and obj55", keyedObjects2D29.equals(obj55) ? keyedObjects2D29.hashCode() == obj55.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj11 = keyedObjects2D10.clone();
        java.util.List list12 = keyedObjects2D10.getColumnKeys();
        int int13 = keyedObjects2D10.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj15 = keyedObjects2D14.clone();
        int int17 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 1);
        int int19 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj21 = keyedObjects2D20.clone();
        java.util.List list22 = keyedObjects2D20.getRowKeys();
        keyedObjects2D20.setObject((java.lang.Object) 10L, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj28 = keyedObjects2D27.clone();
        java.util.List list29 = keyedObjects2D27.getColumnKeys();
        java.lang.Class<?> wildcardClass30 = keyedObjects2D27.getClass();
        keyedObjects2D20.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj35 = keyedObjects2D34.clone();
        int int37 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D34.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int42 = keyedObjects2D34.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj43 = keyedObjects2D34.clone();
        java.lang.Comparable comparable44 = null;
        int int45 = keyedObjects2D34.getColumnIndex(comparable44);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj47 = keyedObjects2D46.clone();
        int int49 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D46.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int54 = keyedObjects2D46.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj55 = keyedObjects2D46.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj57 = keyedObjects2D56.clone();
        int int59 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj60 = keyedObjects2D56.clone();
        int int61 = keyedObjects2D56.getColumnCount();
        keyedObjects2D46.addObject((java.lang.Object) int61, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D34.setObject((java.lang.Object) int61, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D34.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D71 = new org.jfree.data.KeyedObjects2D();
        boolean boolean73 = keyedObjects2D71.equals((java.lang.Object) (byte) 10);
        boolean boolean75 = keyedObjects2D71.equals((java.lang.Object) (-1L));
        int int77 = keyedObjects2D71.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj78 = keyedObjects2D71.clone();
        keyedObjects2D34.addObject(obj78, (java.lang.Comparable) (-1), (java.lang.Comparable) 1L);
        keyedObjects2D20.setObject((java.lang.Object) keyedObjects2D34, (java.lang.Comparable) "hi!", (java.lang.Comparable) (short) 100);
        boolean boolean85 = keyedObjects2D14.equals((java.lang.Object) keyedObjects2D20);
        keyedObjects2D10.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1));
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0.0d);
        int int93 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100);
        int int94 = keyedObjects2D0.getRowCount();
        java.util.List list95 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj96 = keyedObjects2D0.clone();
        int int97 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj96", keyedObjects2D0.equals(obj96) ? keyedObjects2D0.hashCode() == obj96.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        int int3 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        boolean boolean6 = keyedObjects2D4.equals((java.lang.Object) (byte) 10);
        boolean boolean8 = keyedObjects2D4.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.addObject((java.lang.Object) 10.0d, (java.lang.Comparable) 'a', (java.lang.Comparable) 1.0d);
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D13.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        boolean boolean17 = keyedObjects2D15.equals((java.lang.Object) (byte) 10);
        boolean boolean19 = keyedObjects2D15.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj21 = keyedObjects2D20.clone();
        int int23 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list24 = keyedObjects2D20.getRowKeys();
        keyedObjects2D15.setObject((java.lang.Object) list24, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        keyedObjects2D13.setObject((java.lang.Object) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 1);
        java.util.List list31 = keyedObjects2D13.getColumnKeys();
        java.lang.Object obj32 = keyedObjects2D13.clone();
        boolean boolean33 = keyedObjects2D0.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj12", keyedObjects2D0.equals(obj12) ? keyedObjects2D0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.lang.Object obj15 = keyedObjects2D0.clone();
        java.lang.Object obj16 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj15", keyedObjects2D0.equals(obj15) ? keyedObjects2D0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) 0.0f);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        boolean boolean13 = keyedObjects2D11.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = keyedObjects2D11.clone();
        keyedObjects2D0.setObject(obj14, (java.lang.Comparable) '#', (java.lang.Comparable) (byte) 0);
        java.lang.Object obj18 = keyedObjects2D0.clone();
        java.util.List list19 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj18", keyedObjects2D0.equals(obj18) ? keyedObjects2D0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        boolean boolean4 = keyedObjects2D0.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj6 = keyedObjects2D5.clone();
        int int8 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list9 = keyedObjects2D5.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list9, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int14 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj16 = keyedObjects2D15.clone();
        java.util.List list17 = keyedObjects2D15.getColumnKeys();
        java.lang.Class<?> wildcardClass18 = keyedObjects2D15.getClass();
        keyedObjects2D0.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        int int23 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 2);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        boolean boolean29 = keyedObjects2D27.equals((java.lang.Object) (byte) 10);
        boolean boolean31 = keyedObjects2D27.equals((java.lang.Object) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj33 = keyedObjects2D32.clone();
        int int35 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 1);
        java.util.List list36 = keyedObjects2D32.getRowKeys();
        keyedObjects2D27.setObject((java.lang.Object) list36, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1L));
        int int41 = keyedObjects2D27.getRowIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj43 = keyedObjects2D42.clone();
        java.util.List list44 = keyedObjects2D42.getColumnKeys();
        java.lang.Class<?> wildcardClass45 = keyedObjects2D42.getClass();
        keyedObjects2D27.setObject((java.lang.Object) wildcardClass45, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        int int50 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 2);
        keyedObjects2D27.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 100.0d);
        keyedObjects2D0.addObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) (short) -1);
        java.util.List list57 = keyedObjects2D0.getRowKeys();
        java.util.List list58 = keyedObjects2D0.getColumnKeys();
        int int59 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj60 = keyedObjects2D0.clone();
        int int62 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj60", keyedObjects2D0.equals(obj60) ? keyedObjects2D0.hashCode() == obj60.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        boolean boolean2 = keyedObjects2D0.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj5 = keyedObjects2D4.clone();
        int int7 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj8 = keyedObjects2D4.clone();
        int int9 = keyedObjects2D4.getColumnCount();
        keyedObjects2D4.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (short) -1);
        int int14 = keyedObjects2D4.getRowCount();
        int int16 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 100.0d);
        int int17 = keyedObjects2D4.getRowCount();
        int int18 = keyedObjects2D4.getColumnCount();
        int int19 = keyedObjects2D4.getColumnCount();
        int int20 = keyedObjects2D4.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D4, (java.lang.Comparable) true, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj25 = keyedObjects2D24.clone();
        java.util.List list26 = keyedObjects2D24.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj28 = keyedObjects2D27.clone();
        int int30 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj31 = keyedObjects2D27.clone();
        int int32 = keyedObjects2D27.getColumnCount();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj37 = keyedObjects2D36.clone();
        int int39 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D36.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int44 = keyedObjects2D36.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj45 = keyedObjects2D36.clone();
        java.lang.Comparable comparable46 = null;
        int int47 = keyedObjects2D36.getColumnIndex(comparable46);
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj49 = keyedObjects2D48.clone();
        int int51 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D48.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int56 = keyedObjects2D48.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj57 = keyedObjects2D48.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj59 = keyedObjects2D58.clone();
        int int61 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj62 = keyedObjects2D58.clone();
        int int63 = keyedObjects2D58.getColumnCount();
        keyedObjects2D48.addObject((java.lang.Object) int63, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D36.setObject((java.lang.Object) int63, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D36.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        keyedObjects2D36.removeRow((java.lang.Comparable) (byte) 100);
        keyedObjects2D24.setObject((java.lang.Object) (byte) 100, (java.lang.Comparable) '#', (java.lang.Comparable) '#');
        java.lang.Comparable comparable79 = keyedObjects2D24.getColumnKey((int) (byte) 0);
        java.util.List list80 = keyedObjects2D24.getColumnKeys();
        java.lang.Object obj81 = keyedObjects2D24.clone();
        keyedObjects2D4.addObject(obj81, (java.lang.Comparable) 0.0f, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D24 and obj81", keyedObjects2D24.equals(obj81) ? keyedObjects2D24.hashCode() == obj81.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        int int94 = keyedObjects2D32.getRowIndex((java.lang.Comparable) 100);
        java.lang.Object obj95 = keyedObjects2D32.clone();
        java.lang.Class<?> wildcardClass96 = obj95.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D32 and obj95", keyedObjects2D32.equals(obj95) ? keyedObjects2D32.hashCode() == obj95.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D2 = new org.jfree.data.KeyedObjects2D();
        boolean boolean4 = keyedObjects2D2.equals((java.lang.Object) (byte) 10);
        boolean boolean6 = keyedObjects2D2.equals((java.lang.Object) 10.0d);
        int int8 = keyedObjects2D2.getColumnIndex((java.lang.Comparable) (short) 0);
        int int9 = keyedObjects2D2.getRowCount();
        int int10 = keyedObjects2D2.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int10, (java.lang.Comparable) "", (java.lang.Comparable) '4');
        java.util.List list14 = keyedObjects2D0.getRowKeys();
        int int15 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj17 = keyedObjects2D16.clone();
        int int19 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D16.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int24 = keyedObjects2D16.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj25 = keyedObjects2D16.clone();
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
        int int58 = keyedObjects2D40.getRowCount();
        int int60 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D16.addObject((java.lang.Object) 100.0f, (java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        java.util.List list64 = keyedObjects2D16.getColumnKeys();
        java.lang.Object obj65 = keyedObjects2D16.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D16, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D16 and obj65", keyedObjects2D16.equals(obj65) ? keyedObjects2D16.hashCode() == obj65.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        int int3 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj8 = keyedObjects2D7.clone();
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D7.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int15 = keyedObjects2D7.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj16 = keyedObjects2D7.clone();
        java.lang.Comparable comparable17 = null;
        int int18 = keyedObjects2D7.getColumnIndex(comparable17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj20 = keyedObjects2D19.clone();
        int int22 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D19.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int27 = keyedObjects2D19.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj28 = keyedObjects2D19.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj30 = keyedObjects2D29.clone();
        int int32 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj33 = keyedObjects2D29.clone();
        int int34 = keyedObjects2D29.getColumnCount();
        keyedObjects2D19.addObject((java.lang.Object) int34, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D7.setObject((java.lang.Object) int34, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D7.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        keyedObjects2D7.removeRow((java.lang.Comparable) (byte) 100);
        boolean boolean46 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        int int48 = keyedObjects2D47.getRowCount();
        keyedObjects2D47.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 10L);
        int int52 = keyedObjects2D47.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        boolean boolean55 = keyedObjects2D53.equals((java.lang.Object) (byte) 10);
        java.util.List list56 = keyedObjects2D53.getColumnKeys();
        boolean boolean57 = keyedObjects2D47.equals((java.lang.Object) list56);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj59 = keyedObjects2D58.clone();
        java.util.List list60 = keyedObjects2D58.getColumnKeys();
        keyedObjects2D47.addObject((java.lang.Object) keyedObjects2D58, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 100);
        keyedObjects2D47.removeObject((java.lang.Comparable) (byte) -1, (java.lang.Comparable) '4');
        java.lang.Object obj67 = keyedObjects2D47.clone();
        keyedObjects2D0.setObject(obj67, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D47 and obj67", keyedObjects2D47.equals(obj67) ? keyedObjects2D47.hashCode() == obj67.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj1 = keyedObjects2D0.clone();
        java.util.List list2 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj4 = keyedObjects2D3.clone();
        int int6 = keyedObjects2D3.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj7 = keyedObjects2D3.clone();
        int int8 = keyedObjects2D3.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D3, (java.lang.Comparable) '#', (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj13 = keyedObjects2D12.clone();
        int int15 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D12.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int20 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj21 = keyedObjects2D12.clone();
        java.lang.Comparable comparable22 = null;
        int int23 = keyedObjects2D12.getColumnIndex(comparable22);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj25 = keyedObjects2D24.clone();
        int int27 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 1);
        keyedObjects2D24.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        int int32 = keyedObjects2D24.getRowIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj33 = keyedObjects2D24.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.lang.Object obj35 = keyedObjects2D34.clone();
        int int37 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 1);
        java.lang.Object obj38 = keyedObjects2D34.clone();
        int int39 = keyedObjects2D34.getColumnCount();
        keyedObjects2D24.addObject((java.lang.Object) int39, (java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
        keyedObjects2D12.setObject((java.lang.Object) int39, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) ' ');
        keyedObjects2D12.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 100L);
        keyedObjects2D12.removeRow((java.lang.Comparable) (byte) 100);
        keyedObjects2D0.setObject((java.lang.Object) (byte) 100, (java.lang.Comparable) '#', (java.lang.Comparable) '#');
        java.lang.Comparable comparable55 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        java.util.List list56 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj57 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass58 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj57", keyedObjects2D0.equals(obj57) ? keyedObjects2D0.hashCode() == obj57.hashCode() : true);
    }
}

