package org.jfree.data.statistics;

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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double6 = defaultBoxAndWhiskerCategoryDataset4.getRangeLowerBound(false);
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D9;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset9.clone();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 100);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D9;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 100);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset12.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass14 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 100);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener16);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 1L);
        double double23 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener8);
        int int10 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset4.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset4.addChangeListener(datasetChangeListener8);
        double double11 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset4.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 100);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener3);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D9;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj3 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj3", defaultBoxAndWhiskerCategoryDataset0.equals(obj3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 'a');
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 100);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable8 = null;
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        double double16 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener12);
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int17 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 'a');
        double double19 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset9.clone();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        double double16 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 100);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 100);
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) keyedObjects2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        double double23 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset17.data;
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset11.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener9);
        int int11 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        int int20 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener21);
        int int24 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D26;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset4.getRangeLowerBound(true);
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) double7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        int int19 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset4.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset4.addChangeListener(datasetChangeListener8);
        defaultBoxAndWhiskerCategoryDataset4.validateObject();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset4.getRangeBounds(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset4.getColumnKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset4.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 100);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset5.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener15);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 100);
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj3 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj3", defaultBoxAndWhiskerCategoryDataset0.equals(obj3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset14.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset14.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener12);
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 1L);
        double double17 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        int int21 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) 100);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset5.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset14.data;
        int int17 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.lang.Class<?> wildcardClass8 = defaultBoxAndWhiskerCategoryDataset7.getClass();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset10.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int16 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double18 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset11.data;
        int int13 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset4.removeChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset4.getRowIndex((java.lang.Comparable) 100);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener10);
        double double13 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 100);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double17 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener18);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener17);
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset11.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener13);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(true);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals(obj11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        double double16 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int15 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 'a');
        double double17 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) double17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener17);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset12.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double14 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        int int16 = defaultBoxAndWhiskerCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        java.lang.Class<?> wildcardClass19 = defaultBoxAndWhiskerCategoryDataset12.getClass();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        double double13 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener14);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener18);
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener17);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        double double23 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        int int24 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset11.data;
        int int28 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) false);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D14;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        double double22 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        double double28 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset9.data;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) keyedObjects2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset10.data;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset11.data;
        int int14 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset4.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset9.data;
        int int12 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        double double20 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(true);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener23);
        int int26 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset17.data;
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(false);
        int int19 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        double double16 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener17);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double16 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(false);
        int int18 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (short) 100);
        double double20 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 100);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        int int22 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) 0);
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        double double20 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        int int23 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        java.lang.Class<?> wildcardClass24 = defaultBoxAndWhiskerCategoryDataset14.getClass();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        double double15 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        int int14 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener17);
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener23);
        double double26 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset13.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        int int22 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = null;
        defaultBoxAndWhiskerCategoryDataset13.data = keyedObjects2D23;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset25 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset25.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultBoxAndWhiskerCategoryDataset25.removeChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultBoxAndWhiskerCategoryDataset25.addChangeListener(datasetChangeListener29);
        defaultBoxAndWhiskerCategoryDataset25.validateObject();
        int int33 = defaultBoxAndWhiskerCategoryDataset25.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultBoxAndWhiskerCategoryDataset25.getGroup();
        boolean boolean35 = defaultBoxAndWhiskerCategoryDataset13.equals((java.lang.Object) datasetGroup34);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset25", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset25) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) (-1L));
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 100L);
        double double20 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int17 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener18);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) eventListener18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        double double17 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(true);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener20);
        int int23 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset14.data;
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        double double19 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset13.data;
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        java.lang.Class<?> wildcardClass22 = defaultBoxAndWhiskerCategoryDataset13.getClass();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double17 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        int int18 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        int int19 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double14 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        int int16 = defaultBoxAndWhiskerCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        double double19 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double18 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(false);
        int int19 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int16 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        int int22 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener20);
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset16.getRangeBounds(false);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int26 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.Range range19 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(true);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 100);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) (-1.0d));
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        int int18 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        double double20 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset20.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset20.removeChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset20.addChangeListener(datasetChangeListener24);
        double double27 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset20.validateObject();
        int int30 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex((java.lang.Comparable) 1L);
        double double32 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) (-1L));
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 100L);
        double double16 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset6.data;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 100);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset13.equals((java.lang.Object) (-1.0d));
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        int int16 = defaultBoxAndWhiskerCategoryDataset12.getRowCount();
        double double18 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 100);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset5.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener18);
        int int20 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset17.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener22);
        double double25 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(false);
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 100);
        double double17 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(true);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset5.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 100);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        double double24 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener25);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1));
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        double double22 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset22 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset22.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset22.addChangeListener(datasetChangeListener26);
        int int28 = defaultBoxAndWhiskerCategoryDataset22.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener29);
        double double32 = defaultBoxAndWhiskerCategoryDataset22.getRangeLowerBound(true);
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = defaultBoxAndWhiskerCategoryDataset22.hasListener(eventListener33);
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultBoxAndWhiskerCategoryDataset22.hasListener(eventListener35);
        double double38 = defaultBoxAndWhiskerCategoryDataset22.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultBoxAndWhiskerCategoryDataset22.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset22", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset22) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(false);
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(false);
        int int24 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (-1));
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int6 = defaultBoxAndWhiskerCategoryDataset4.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset4.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset4.addChangeListener(datasetChangeListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener20);
        int int22 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener23);
        double double26 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(true);
        double double28 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(false);
        int int29 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        int int20 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener11);
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset16.data;
        int int18 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup15 and datasetGroup19", datasetGroup15.equals(datasetGroup19) ? datasetGroup15.hashCode() == datasetGroup19.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals(obj15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener23);
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset17.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset10.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener21);
        int int23 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener24);
        double double27 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(true);
        double double29 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(false);
        int int30 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = defaultBoxAndWhiskerCategoryDataset17.data;
        boolean boolean32 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset19.data;
        int int21 = defaultBoxAndWhiskerCategoryDataset19.getRowCount();
        org.jfree.data.Range range23 = defaultBoxAndWhiskerCategoryDataset19.getRangeBounds(false);
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset19.removeChangeListener(datasetChangeListener26);
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(false);
        double double26 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(false);
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        double double21 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        int int22 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset14.data;
        int int16 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        double double21 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener22);
        int int24 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        int int26 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        double double19 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        int int19 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener20);
        double double23 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener24);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener26);
        double double29 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj18 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int20 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj18", defaultBoxAndWhiskerCategoryDataset0.equals(obj18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) (short) 100);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj18 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj18", defaultBoxAndWhiskerCategoryDataset0.equals(obj18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener22);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener24);
        double double27 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset11.data;
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset12.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener24);
        double double27 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset5.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        int int13 = defaultBoxAndWhiskerCategoryDataset5.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double15 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        int int17 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener19);
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset15.equals((java.lang.Object) (-1L));
        int int21 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener22);
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        double double13 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(true);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        org.jfree.data.Range range19 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        int int25 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 1L);
        double double27 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset15.data;
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj18 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset19.removeChangeListener(datasetChangeListener21);
        int int24 = defaultBoxAndWhiskerCategoryDataset19.getRowIndex((java.lang.Comparable) 100);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        org.jfree.data.Range range28 = defaultBoxAndWhiskerCategoryDataset19.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj18", defaultBoxAndWhiskerCategoryDataset0.equals(obj18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        double double15 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        int int22 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 1L);
        double double24 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        java.lang.Comparable comparable15 = null;
        int int16 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex(comparable15);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset12.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double23 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(false);
        int int25 = defaultBoxAndWhiskerCategoryDataset21.getColumnIndex((java.lang.Comparable) (short) 100);
        double double27 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset21.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset14.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        double double22 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        int int22 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int17 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double19 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener17);
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) eventListener17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass13 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener7);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 100);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener17);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.Range range23 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(false);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset12.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener17);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 1);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(false);
        int int21 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 100);
        int int22 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int18 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener22);
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(false);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener25);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 100);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) (-1.0d));
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        double double19 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        int int20 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        double double16 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset13.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 1L);
        double double23 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener24);
        int int26 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener21);
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener23);
        double double26 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener19);
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        int int23 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        double double18 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass8 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 1.0d);
        int int22 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int24 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 10);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 100);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener8);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        double double15 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(true);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener18);
        int int21 = defaultBoxAndWhiskerCategoryDataset12.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset4.data;
        int int7 = defaultBoxAndWhiskerCategoryDataset4.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset4.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset4.removeChangeListener(datasetChangeListener6);
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset4.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset4.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset4.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double14 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset4.getColumnCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset4.clone();
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        double double20 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener21);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener24);
        int int26 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(true);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int10 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(false);
        int int21 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        double double17 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        int int19 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        double double20 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset14.data;
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener25);
        double double28 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 100);
        double double17 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset9.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset16.data;
        java.lang.Class<?> wildcardClass18 = keyedObjects2D17.getClass();
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener20);
        double double23 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(false);
        java.lang.Class<?> wildcardClass24 = defaultBoxAndWhiskerCategoryDataset16.getClass();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetChangeListener19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(false);
        int int20 = defaultBoxAndWhiskerCategoryDataset17.getRowCount();
        int int21 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset5.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 1L);
        double double17 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset10.data;
        int int12 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        int int12 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        double double8 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener9);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getColumnIndex((java.lang.Comparable) (short) 100);
        double double17 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(false);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener11);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset5.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset16.getRangeBounds(true);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        double double17 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(true);
        org.jfree.data.Range range19 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(false);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        double double22 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(true);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Comparable comparable2 = null;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(true);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(false);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        int int19 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) (-1L));
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset13.data;
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        double double13 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset21.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset21.removeChangeListener(datasetChangeListener23);
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset21.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        int int29 = defaultBoxAndWhiskerCategoryDataset21.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double31 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        int int33 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener35 = null;
        defaultBoxAndWhiskerCategoryDataset21.addChangeListener(datasetChangeListener35);
        double double38 = defaultBoxAndWhiskerCategoryDataset21.getRangeUpperBound(false);
        java.lang.Comparable comparable39 = null;
        int int40 = defaultBoxAndWhiskerCategoryDataset21.getRowIndex(comparable39);
        boolean boolean41 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset21.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset21.removeChangeListener(datasetChangeListener23);
        int int26 = defaultBoxAndWhiskerCategoryDataset21.getRowIndex((java.lang.Comparable) 100);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset21.getRowKeys();
        int int28 = defaultBoxAndWhiskerCategoryDataset21.getRowCount();
        org.jfree.data.Range range30 = defaultBoxAndWhiskerCategoryDataset21.getRangeBounds(true);
        int int31 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        double double33 = defaultBoxAndWhiskerCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double17 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.Range range19 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset13.data;
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getColumnIndex((java.lang.Comparable) (short) 100);
        int int21 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double17 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        int int18 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 0);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double17 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener20);
        double double23 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(true);
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        double double17 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        java.lang.Object obj19 = defaultBoxAndWhiskerCategoryDataset9.clone();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset7.data;
        int int9 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        double double15 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset13.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset13.data;
        double double25 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener26);
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener18);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetChangeListener18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset14.data;
        int int16 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D19;
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        double double24 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset25 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset25.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultBoxAndWhiskerCategoryDataset25.removeChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultBoxAndWhiskerCategoryDataset25.addChangeListener(datasetChangeListener29);
        double double32 = defaultBoxAndWhiskerCategoryDataset25.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = defaultBoxAndWhiskerCategoryDataset25.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = defaultBoxAndWhiskerCategoryDataset25.data;
        java.util.List list35 = defaultBoxAndWhiskerCategoryDataset25.getColumnKeys();
        boolean boolean36 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset25", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset25) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        java.lang.Object obj3 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj3", defaultBoxAndWhiskerCategoryDataset0.equals(obj3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals(obj11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener19);
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener17);
        int int19 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetChangeListener22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        int int22 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 1L);
        double double24 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        double double28 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        int int30 = defaultBoxAndWhiskerCategoryDataset12.getColumnIndex((java.lang.Comparable) (short) -1);
        int int32 = defaultBoxAndWhiskerCategoryDataset12.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener19);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 100);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) '#');
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(false);
        int int21 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (short) 100);
        int int22 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Comparable comparable9 = null;
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener12);
        int int14 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset11.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener16);
        int int19 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 10);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset11.equals((java.lang.Object) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset11.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener10);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        int int16 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int16 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double18 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        double double19 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        int int21 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range23 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset15.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int12 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double18 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(false);
        int int20 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset14.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        int int26 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) 100.0f);
        int int27 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener16);
        int int19 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset9.data;
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        int int22 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '#');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        java.lang.Object obj24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset13.equals(obj24);
        double double27 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1.0d));
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double17 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        int int19 = defaultBoxAndWhiskerCategoryDataset15.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener23);
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        int int29 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) '4');
        java.lang.Object obj30 = defaultBoxAndWhiskerCategoryDataset15.clone();
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset0.equals(obj30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener21);
        double double24 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset17.validateObject();
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range29 = defaultBoxAndWhiskerCategoryDataset17.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int17 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener20);
        int int22 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        int int24 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        double double22 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset16.data;
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int26 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener28);
        double double31 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        java.lang.Comparable comparable33 = null;
        int int34 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex(comparable33);
        double double36 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(false);
        boolean boolean37 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) double36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) -1);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener13);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(false);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        int int19 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        int int23 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset21.getRowKeys();
        double double24 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(true);
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset21.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset21.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        org.jfree.data.Range range23 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        int int25 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) (-1));
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset11.data;
        int int28 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset15.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        double double23 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        double double18 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset19.removeChangeListener(datasetChangeListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset19.addChangeListener(datasetChangeListener23);
        double double26 = defaultBoxAndWhiskerCategoryDataset19.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset19.validateObject();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset19.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 0);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj14", defaultBoxAndWhiskerCategoryDataset0.equals(obj14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(false);
        org.jfree.data.Range range27 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(false);
        int int29 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (-1));
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset14.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        int int22 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double24 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        int int25 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        org.jfree.data.Range range27 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener20);
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        int int24 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener18);
        defaultBoxAndWhiskerCategoryDataset14.validateObject();
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset14.getRangeBounds(false);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener25);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double13 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset16.data;
        int int18 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.addChangeListener(datasetChangeListener19);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset16.data;
        java.lang.Class<?> wildcardClass22 = defaultBoxAndWhiskerCategoryDataset16.getClass();
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D19;
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double25 = defaultBoxAndWhiskerCategoryDataset23.getRangeLowerBound(false);
        double double27 = defaultBoxAndWhiskerCategoryDataset23.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset23.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset23", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset23) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        int int25 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset11.data;
        int int13 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset11.getRangeBounds(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset11.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener21);
        double double24 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener25);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(false);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener25);
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetChangeListener25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset5.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        double double21 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset15.data;
        java.lang.Object obj23 = defaultBoxAndWhiskerCategoryDataset15.clone();
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset0.equals(obj23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) (short) 100);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        double double16 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener22);
        double double25 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        double double21 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener22);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        double double18 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(true);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener11);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int17 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) (byte) 0);
        int int19 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100L);
        int int21 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 'a');
        java.lang.Comparable comparable22 = null;
        int int23 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex(comparable22);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass6 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list2 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int19 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset20.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset20.removeChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        double double26 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset20.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset20.validateObject();
        java.util.List list29 = defaultBoxAndWhiskerCategoryDataset20.getRowKeys();
        double double31 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset20.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = defaultBoxAndWhiskerCategoryDataset20.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D33;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset3.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset3.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset3.addChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset3.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset3.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset3.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset3.data;
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset3.getColumnKeys();
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset3.clone();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset3", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener21);
        defaultBoxAndWhiskerCategoryDataset17.validateObject();
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset17.getRangeBounds(false);
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = null;
        defaultBoxAndWhiskerCategoryDataset17.data = keyedObjects2D29;
        defaultBoxAndWhiskerCategoryDataset17.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        boolean boolean33 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup9 and datasetGroup32", datasetGroup9.equals(datasetGroup32) ? datasetGroup9.hashCode() == datasetGroup32.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener12);
        double double15 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener15);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double20 = defaultBoxAndWhiskerCategoryDataset18.getRangeLowerBound(false);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset18.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset18.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset18.addChangeListener(datasetChangeListener23);
        double double26 = defaultBoxAndWhiskerCategoryDataset18.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset18.data;
        org.jfree.data.Range range29 = defaultBoxAndWhiskerCategoryDataset18.getRangeBounds(true);
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset18", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) (short) 100);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        double double13 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener14);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener21);
        double double24 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset17.validateObject();
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) 1L);
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        double double30 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener18);
        int int20 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset16.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        int int24 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double26 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(true);
        org.jfree.data.Range range28 = defaultBoxAndWhiskerCategoryDataset16.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) false);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset8.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1L);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener17);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset15.equals((java.lang.Object) (-1L));
        int int21 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset12.equals((java.lang.Object) (-1L));
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 100L);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener2);
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        org.jfree.data.Range range23 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        int int27 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) (-1));
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset13.data;
        int int30 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(false);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 1L);
        double double22 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj14 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1L));
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int18 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) 'a');
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(true);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset12.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset12.data;
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) keyedObjects2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener21);
        double double24 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(false);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        int int26 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double18 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(false);
        double double20 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(true);
        java.lang.Comparable comparable21 = null;
        int int22 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex(comparable21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener7);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset7.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener18);
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(true);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(true);
        double double24 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(false);
        int int25 = defaultBoxAndWhiskerCategoryDataset12.getColumnCount();
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list1 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener2 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener2);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset12.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        java.lang.Object obj21 = defaultBoxAndWhiskerCategoryDataset12.clone();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }
}

