package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        boolean boolean5 = xYSeries3.isEmpty();
        java.lang.Object obj6 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        xYSeries1.setMaximumItemCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10L, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true, true);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        xYSeries51.setMaximumItemCount((int) (byte) 10);
        xYSeries51.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list59 = xYSeries51.getItems();
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries61.clear();
        java.lang.String str63 = xYSeries61.getDescription();
        java.util.List list64 = xYSeries61.getItems();
        xYSeries51.data = list64;
        xYSeries49.data = list64;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries49.add((java.lang.Number) 2, (java.lang.Number) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries3.getNotify();
        boolean boolean13 = xYSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener43);
        java.lang.Number number46 = xYSeries1.getX((int) (byte) 1);
        xYSeries1.clear();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertEquals("'" + number46 + "' != '" + 100.0d + "'", number46, 100.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        double[][] doubleArray19 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.addOrUpdate((double) (short) -1, (double) (short) 0);
        double[][] doubleArray23 = xYSeries1.toArray();
        java.util.List list24 = xYSeries1.getItems();
        java.lang.String str25 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (byte) 100, true);
        boolean boolean17 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((-1.0d), (double) (-3), true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1), false);
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) '#', (double) (short) -1);
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 0.0f);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        xYSeries3.add((java.lang.Number) 1L, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((double) 0.0f, (double) 0L);
        java.lang.Object obj18 = xYSeries1.clone();
        java.lang.String str19 = xYSeries1.getDescription();
        java.util.List list20 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries1.removeChangeListener(seriesChangeListener39);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        java.util.List list19 = xYSeries1.getItems();
        xYSeries1.add((double) 4, (java.lang.Number) 10L, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        xYSeries1.add((double) ' ', (double) 0.0f, false);
        boolean boolean19 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d, true);
        int int16 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((double) '#', (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        boolean boolean32 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries23);
        xYSeries1.setKey((java.lang.Comparable) 1L);
        xYSeries1.clear();
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = xYSeries1.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        boolean boolean8 = xYSeries3.isEmpty();
        boolean boolean9 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        java.util.List list43 = xYSeries1.data;
        xYSeries1.add((double) 100, (double) 2);
        double[][] doubleArray47 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries1.addOrUpdate((double) 100.0f, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean25 = xYSeries18.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        java.lang.String str29 = xYSeries27.getDescription();
        xYSeries27.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean34 = xYSeries27.equals((java.lang.Object) 2147483647);
        boolean boolean35 = xYSeries18.equals((java.lang.Object) xYSeries27);
        xYSeries18.fireSeriesChanged();
        xYSeries18.setDescription("");
        boolean boolean39 = xYSeries1.equals((java.lang.Object) xYSeries18);
        java.lang.Number number40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries1.remove(number40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.lang.Object obj13 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 1);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        boolean boolean18 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list19 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        xYSeries23.add((double) (-2), (-1.0d));
        xYSeries23.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean37 = xYSeries23.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        int int41 = xYSeries39.getMaximumItemCount();
        xYSeries39.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries47 = xYSeries39.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable52 = xYSeries51.getKey();
        xYSeries51.add((double) (short) 0, (double) ' ');
        int int57 = xYSeries51.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries59.clear();
        xYSeries59.setMaximumItemCount((int) (byte) 10);
        xYSeries59.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list67 = xYSeries59.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        xYSeries59.removeChangeListener(seriesChangeListener68);
        xYSeries59.add((double) 100.0f, 100.0d);
        boolean boolean73 = xYSeries59.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries59.remove((int) (byte) 1);
        xYSeries51.add(xYDataItem75);
        xYSeries47.add(xYDataItem75, false);
        xYSeries23.add(xYDataItem75);
        xYSeries1.add(xYDataItem75, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0d + "'", comparable17, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries47);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (short) 10 + "'", comparable52, (short) 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-2) + "'", int57 == (-2));
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.add((double) 3, (java.lang.Number) (short) 0, false);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        xYSeries1.fireSeriesChanged();
        xYSeries1.setMaximumItemCount(3);
        java.lang.Object obj18 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        java.lang.String str14 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy(2, 1);
        java.lang.String str18 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        double[][] doubleArray16 = xYSeries15.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries15.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        java.lang.String str9 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        xYSeries1.add((double) 10.0f, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.remove((java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.removeChangeListener(seriesChangeListener25);
        java.lang.Object obj27 = xYSeries1.clone();
        java.lang.Object obj28 = xYSeries1.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean7 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 10L, (java.lang.Number) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) (-5908509288197150436L), (java.lang.Number) 1.0d, false);
        xYSeries1.add((double) 0, (double) 10, false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        xYSeries13.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries13.addChangeListener(seriesChangeListener19);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) seriesChangeListener19);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        boolean boolean20 = xYSeries10.getNotify();
        xYSeries10.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        boolean boolean24 = xYSeries10.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries10.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) ' ', (double) ' ');
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.isEmpty();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        java.lang.Class<?> wildcardClass46 = xYSeries12.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        int int13 = xYSeries11.getMaximumItemCount();
        xYSeries11.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int18 = xYSeries11.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.setNotify(true);
        java.lang.Number number24 = null;
        xYSeries20.add((double) (-1), number24);
        java.util.List list26 = xYSeries20.getItems();
        boolean boolean27 = xYSeries20.getAllowDuplicateXValues();
        boolean boolean28 = xYSeries20.getNotify();
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries20.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable38 = xYSeries37.getKey();
        xYSeries37.add((double) (short) 0, (double) ' ');
        int int43 = xYSeries37.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries45.clear();
        xYSeries45.setMaximumItemCount((int) (byte) 10);
        xYSeries45.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list53 = xYSeries45.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        xYSeries45.removeChangeListener(seriesChangeListener54);
        xYSeries45.add((double) 100.0f, 100.0d);
        boolean boolean59 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries45.remove((int) (byte) 1);
        xYSeries37.add(xYDataItem61);
        xYSeries31.add(xYDataItem61, true);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true, true);
        xYSeries11.add(xYDataItem61, true);
        xYSeries9.setKey((java.lang.Comparable) xYDataItem61);
        xYSeries3.add(xYDataItem61);
        boolean boolean72 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.getAutoSort();
        boolean boolean27 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries29.clear();
        xYSeries29.setMaximumItemCount((int) (byte) 10);
        xYSeries29.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries29.clear();
        xYSeries29.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries41.clear();
        java.lang.String str43 = xYSeries41.getDescription();
        xYSeries41.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean48 = xYSeries41.equals((java.lang.Object) 2147483647);
        boolean boolean49 = xYSeries29.equals((java.lang.Object) 2147483647);
        java.lang.String str50 = xYSeries29.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries29.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean54 = xYSeries29.getAutoSort();
        xYSeries29.setDescription("hi!");
        xYSeries29.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        xYSeries63.addChangeListener(seriesChangeListener64);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries67.clear();
        xYSeries67.setMaximumItemCount((int) (byte) 10);
        xYSeries67.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list75 = xYSeries67.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener76 = null;
        xYSeries67.removeChangeListener(seriesChangeListener76);
        xYSeries67.add((double) 100.0f, 100.0d);
        boolean boolean81 = xYSeries67.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries67.remove((int) (byte) 1);
        xYSeries63.add(xYDataItem83);
        xYSeries29.add(xYDataItem83, false);
        xYSeries1.add(xYDataItem83, true);
        org.jfree.data.xy.XYDataItem xYDataItem91 = xYSeries1.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number93 = xYSeries1.getX(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(xYDataItem83);
        org.junit.Assert.assertNull(xYDataItem91);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        xYSeries1.setNotify(false);
        java.lang.String str17 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        int int18 = xYSeries16.getMaximumItemCount();
        xYSeries16.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int23 = xYSeries16.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.setNotify(true);
        java.lang.Number number29 = null;
        xYSeries25.add((double) (-1), number29);
        java.util.List list31 = xYSeries25.getItems();
        boolean boolean32 = xYSeries25.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries25.getNotify();
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries25.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable43 = xYSeries42.getKey();
        xYSeries42.add((double) (short) 0, (double) ' ');
        int int48 = xYSeries42.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries50.clear();
        xYSeries50.setMaximumItemCount((int) (byte) 10);
        xYSeries50.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list58 = xYSeries50.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        xYSeries50.removeChangeListener(seriesChangeListener59);
        xYSeries50.add((double) 100.0f, 100.0d);
        boolean boolean64 = xYSeries50.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries50.remove((int) (byte) 1);
        xYSeries42.add(xYDataItem66);
        xYSeries36.add(xYDataItem66, true);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true, true);
        xYSeries16.add(xYDataItem66, true);
        xYSeries14.add(xYDataItem66, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.update((java.lang.Number) 10, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2) + "'", int23 == (-2));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + (short) 10 + "'", comparable43, (short) 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2) + "'", int48 == (-2));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener43);
        java.lang.Number number46 = xYSeries1.getX((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = xYSeries1.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertEquals("'" + number46 + "' != '" + 100.0d + "'", number46, 100.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        xYSeries1.setMaximumItemCount(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) 0.0f);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj12 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        xYSeries14.setMaximumItemCount((int) (byte) 10);
        xYSeries14.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list22 = xYSeries14.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries14.removeChangeListener(seriesChangeListener23);
        xYSeries14.add((double) 100.0f, 100.0d);
        boolean boolean28 = xYSeries14.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries14.remove((int) (byte) 1);
        xYSeries14.clear();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable36 = xYSeries35.getKey();
        xYSeries35.add((double) (short) 0, (double) ' ');
        int int41 = xYSeries35.indexOf((java.lang.Number) 1.0d);
        xYSeries35.add((double) (-2), (-1.0d));
        xYSeries35.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean49 = xYSeries35.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        int int53 = xYSeries51.getMaximumItemCount();
        xYSeries51.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries59 = xYSeries51.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable64 = xYSeries63.getKey();
        xYSeries63.add((double) (short) 0, (double) ' ');
        int int69 = xYSeries63.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries71.clear();
        xYSeries71.setMaximumItemCount((int) (byte) 10);
        xYSeries71.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list79 = xYSeries71.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener80 = null;
        xYSeries71.removeChangeListener(seriesChangeListener80);
        xYSeries71.add((double) 100.0f, 100.0d);
        boolean boolean85 = xYSeries71.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries71.remove((int) (byte) 1);
        xYSeries63.add(xYDataItem87);
        xYSeries59.add(xYDataItem87, false);
        xYSeries35.add(xYDataItem87);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87);
        xYSeries14.setKey((java.lang.Comparable) xYDataItem87);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, true, false);
        org.jfree.data.xy.XYSeries xYSeries97 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87);
        xYSeries1.add(xYDataItem87);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (short) 10 + "'", comparable36, (short) 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries59);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + (short) 10 + "'", comparable64, (short) 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-2) + "'", int69 == (-2));
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) 1L, (java.lang.Number) 10.0f);
        java.util.List list16 = xYSeries1.data;
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean16 = xYSeries9.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries20.addChangeListener(seriesChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        xYSeries24.setMaximumItemCount((int) (byte) 10);
        xYSeries24.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list32 = xYSeries24.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries24.removeChangeListener(seriesChangeListener33);
        xYSeries24.add((double) 100.0f, 100.0d);
        boolean boolean38 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries24.remove((int) (byte) 1);
        xYSeries20.add(xYDataItem40);
        xYSeries9.add(xYDataItem40, false);
        xYSeries1.add(xYDataItem40, false);
        java.lang.Class<?> wildcardClass46 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.util.List list12 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries14.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries25.add(xYDataItem55, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        xYSeries3.setMaximumItemCount(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number64 = xYSeries3.getY((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        java.lang.Number number14 = xYSeries1.getY(2);
        int int15 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (short) 100, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries1.getDataItem((int) (byte) 1);
        java.lang.Object obj29 = xYSeries1.clone();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        java.lang.String str26 = xYSeries24.getDescription();
        xYSeries24.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean31 = xYSeries24.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.String str35 = xYSeries33.getDescription();
        xYSeries33.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean40 = xYSeries33.equals((java.lang.Object) 2147483647);
        boolean boolean41 = xYSeries24.equals((java.lang.Object) xYSeries33);
        xYSeries24.fireSeriesChanged();
        xYSeries24.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        xYSeries47.setMaximumItemCount((int) (byte) 10);
        xYSeries47.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list55 = xYSeries47.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries47.removeChangeListener(seriesChangeListener56);
        xYSeries47.add((double) 100.0f, 100.0d);
        boolean boolean61 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries47.remove((int) (byte) 1);
        xYSeries24.add(xYDataItem63, false);
        xYSeries10.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, true);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries68.removePropertyChangeListener(propertyChangeListener69);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean4 = xYSeries3.getNotify();
        java.lang.String str5 = xYSeries3.getDescription();
        int int6 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        int int7 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries1.getDataItem((int) (byte) 1);
        java.lang.Object obj29 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries1.remove((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        double[][] doubleArray16 = xYSeries15.toArray();
        double[][] doubleArray17 = xYSeries15.toArray();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.util.List list11 = xYSeries1.data;
        boolean boolean12 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        xYSeries3.clear();
        xYSeries3.add((double) (byte) -1, (java.lang.Number) 0L);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        xYSeries13.add((double) (short) 0, (double) ' ');
        xYSeries13.setDescription("");
        double[][] doubleArray20 = xYSeries13.toArray();
        boolean boolean21 = xYSeries1.equals((java.lang.Object) doubleArray20);
        java.lang.Comparable comparable22 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0d + "'", comparable22, 10.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = xYSeries1.equals((java.lang.Object) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        int int18 = xYSeries16.getMaximumItemCount();
        xYSeries16.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries16.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable29 = xYSeries28.getKey();
        xYSeries28.add((double) (short) 0, (double) ' ');
        int int34 = xYSeries28.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.clear();
        xYSeries36.setMaximumItemCount((int) (byte) 10);
        xYSeries36.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list44 = xYSeries36.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries36.removeChangeListener(seriesChangeListener45);
        xYSeries36.add((double) 100.0f, 100.0d);
        boolean boolean50 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries36.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem52);
        xYSeries24.add(xYDataItem52, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, false);
        xYSeries1.add(xYDataItem52);
        double[][] doubleArray59 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries62 = xYSeries1.createCopy((-2), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (short) 10 + "'", comparable29, (short) 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertNotNull(doubleArray59);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.util.List list12 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries14.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries25.add(xYDataItem55, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 100);
        xYSeries3.setMaximumItemCount((int) (byte) 10);
        java.lang.String str66 = xYSeries3.getDescription();
        boolean boolean67 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries3.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries18.clear();
        xYSeries18.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        java.lang.String str32 = xYSeries30.getDescription();
        xYSeries30.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean37 = xYSeries30.equals((java.lang.Object) 2147483647);
        boolean boolean38 = xYSeries18.equals((java.lang.Object) 2147483647);
        java.lang.String str39 = xYSeries18.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries18.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean43 = xYSeries18.getAutoSort();
        xYSeries18.setDescription("hi!");
        xYSeries18.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries52.addChangeListener(seriesChangeListener53);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries56.clear();
        xYSeries56.setMaximumItemCount((int) (byte) 10);
        xYSeries56.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list64 = xYSeries56.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener65 = null;
        xYSeries56.removeChangeListener(seriesChangeListener65);
        xYSeries56.add((double) 100.0f, 100.0d);
        boolean boolean70 = xYSeries56.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries56.remove((int) (byte) 1);
        xYSeries52.add(xYDataItem72);
        xYSeries18.add(xYDataItem72, false);
        boolean boolean76 = xYSeries16.equals((java.lang.Object) xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, false);
        xYSeries78.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        int int6 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) '#', (int) ' ');
        xYSeries13.add((java.lang.Number) (short) 0, (java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener24);
        xYSeries18.setNotify(false);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) xYSeries18);
        int int29 = xYSeries18.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener30);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.add((java.lang.Number) (byte) 100, (java.lang.Number) 1, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (short) 10, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries15.setNotify(true);
        java.lang.Number number19 = null;
        xYSeries15.add((double) (-1), number19);
        java.util.List list21 = xYSeries15.getItems();
        boolean boolean22 = xYSeries15.getAllowDuplicateXValues();
        boolean boolean23 = xYSeries15.getNotify();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries15.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable33 = xYSeries32.getKey();
        xYSeries32.add((double) (short) 0, (double) ' ');
        int int38 = xYSeries32.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries40.clear();
        xYSeries40.setMaximumItemCount((int) (byte) 10);
        xYSeries40.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list48 = xYSeries40.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries40.removeChangeListener(seriesChangeListener49);
        xYSeries40.add((double) 100.0f, 100.0d);
        boolean boolean54 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries40.remove((int) (byte) 1);
        xYSeries32.add(xYDataItem56);
        xYSeries26.add(xYDataItem56, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, true);
        int int63 = xYSeries62.getItemCount();
        boolean boolean64 = xYSeries62.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (short) 10 + "'", comparable33, (short) 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries11.clear();
        java.util.List list20 = xYSeries11.data;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries11.removeChangeListener(seriesChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        xYSeries32.setMaximumItemCount((int) (byte) 10);
        xYSeries32.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list40 = xYSeries32.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries32.removeChangeListener(seriesChangeListener41);
        xYSeries32.add((double) 100.0f, 100.0d);
        boolean boolean46 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries32.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem48);
        xYSeries11.add(xYDataItem48);
        xYSeries1.add(xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48);
        int int53 = xYSeries52.getItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = xYSeries12.clone();
        java.lang.Class<?> wildcardClass16 = xYSeries12.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.util.List list27 = xYSeries1.data;
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = xYSeries1.getY((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.util.List list27 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (-5908509288197150436L));
        java.util.List list31 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries1.createCopy((int) 'a', (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(xYSeries34);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean15 = xYSeries1.equals((java.lang.Object) 100);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable21 = xYSeries20.getKey();
        int int23 = xYSeries20.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries20.removeChangeListener(seriesChangeListener24);
        boolean boolean26 = xYSeries1.equals((java.lang.Object) seriesChangeListener24);
        xYSeries1.add((double) 1.0f, (double) (byte) 0);
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 4, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 4");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        boolean boolean11 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100.0f, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        xYSeries12.clear();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries48.clear();
        int int50 = xYSeries48.getMaximumItemCount();
        xYSeries48.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries56 = xYSeries48.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable61 = xYSeries60.getKey();
        xYSeries60.add((double) (short) 0, (double) ' ');
        int int66 = xYSeries60.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries68.clear();
        xYSeries68.setMaximumItemCount((int) (byte) 10);
        xYSeries68.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list76 = xYSeries68.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        xYSeries68.removeChangeListener(seriesChangeListener77);
        xYSeries68.add((double) 100.0f, 100.0d);
        boolean boolean82 = xYSeries68.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries68.remove((int) (byte) 1);
        xYSeries60.add(xYDataItem84);
        xYSeries56.add(xYDataItem84, false);
        xYSeries12.add(xYDataItem84, false);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem84, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries56);
        org.junit.Assert.assertEquals("'" + comparable61 + "' != '" + (short) 10 + "'", comparable61, (short) 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xYDataItem84);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.add((double) ' ', (double) '#', false);
        java.lang.Object obj15 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        xYSeries60.addChangeListener(seriesChangeListener61);
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries60.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (short) 10);
        java.lang.Object obj66 = xYSeries60.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(xYDataItem65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        double[][] doubleArray3 = xYSeries2.toArray();
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        double[][] doubleArray43 = xYSeries1.toArray();
        java.lang.Class<?> wildcardClass44 = doubleArray43.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries60.addPropertyChangeListener(propertyChangeListener61);
        java.lang.Class<?> wildcardClass63 = xYSeries60.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) (byte) 100);
        xYSeries1.add((double) (-5908509288197150436L), 100.0d);
        java.util.List list33 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 2, (double) '#');
        int int15 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((double) 100.0f, (double) (byte) 100);
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray16 = xYSeries1.toArray();
        java.lang.Class<?> wildcardClass17 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.util.List list22 = xYSeries19.data;
        xYSeries15.data = list22;
        boolean boolean24 = xYSeries15.getNotify();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        int int15 = xYSeries12.getMaximumItemCount();
        java.lang.Comparable comparable16 = xYSeries12.getKey();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10.0d + "'", comparable16, 10.0d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.add(0.0d, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1.0d), (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        xYSeries13.setMaximumItemCount((int) (byte) 10);
        xYSeries13.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries13.clear();
        java.util.List list22 = xYSeries13.data;
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries13.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries30.addChangeListener(seriesChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries34.clear();
        xYSeries34.setMaximumItemCount((int) (byte) 10);
        xYSeries34.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list42 = xYSeries34.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries34.removeChangeListener(seriesChangeListener43);
        xYSeries34.add((double) 100.0f, 100.0d);
        boolean boolean48 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries34.remove((int) (byte) 1);
        xYSeries30.add(xYDataItem50);
        xYSeries13.add(xYDataItem50);
        xYSeries1.add(xYDataItem50);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = xYSeries1.getX((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        xYSeries10.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries10.clear();
        java.util.List list19 = xYSeries10.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries10.removeChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries27.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = xYSeries1.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (short) 100, (int) (byte) 10);
        xYSeries1.add((double) (-3), (double) 'a', true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        java.lang.String str19 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries23.add(xYDataItem47);
        xYSeries14.add(xYDataItem47);
        xYSeries1.add(xYDataItem47);
        xYSeries1.add((double) 3, 100.0d);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries1.remove((java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        xYSeries9.setMaximumItemCount((int) (byte) 10);
        xYSeries9.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list17 = xYSeries9.getItems();
        xYSeries1.data = list17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries22.addChangeListener(seriesChangeListener28);
        xYSeries22.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries22.addOrUpdate((double) 100, 100.0d);
        java.util.List list34 = xYSeries22.data;
        xYSeries1.data = list34;
        java.lang.Class<?> wildcardClass36 = list34.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        boolean boolean9 = xYSeries1.getAutoSort();
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getY((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        java.lang.String str16 = xYSeries12.getDescription();
        xYSeries12.setDescription("");
        xYSeries12.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        double[][] doubleArray10 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.add((double) 0, (double) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) (byte) 10, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries9.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        java.lang.Object obj11 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) ' ', (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.clear();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries21.addChangeListener(seriesChangeListener27);
        boolean boolean29 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.setNotify(true);
        java.lang.Number number35 = null;
        xYSeries31.add((double) (-1), number35);
        java.util.List list37 = xYSeries31.getItems();
        xYSeries21.data = list37;
        xYSeries10.data = list37;
        xYSeries10.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries10.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries3.getX(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        xYSeries3.setDescription("hi!");
        java.lang.Comparable comparable63 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + (short) 10 + "'", comparable63, (short) 10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.remove((java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, true);
        xYSeries1.add((double) 3, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 3, false);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        boolean boolean18 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0d + "'", comparable17, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        java.util.List list43 = xYSeries1.data;
        java.lang.Class<?> wildcardClass44 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.delete((int) (byte) 10, 1);
        xYSeries1.add((double) 10.0f, (double) 4, false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.String str16 = xYSeries1.getDescription();
        java.lang.String str17 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries1.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((java.lang.Number) 4, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((double) 1.0f, (double) 1L);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        xYSeries10.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries10.clear();
        java.util.List list19 = xYSeries10.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries10.removeChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries27.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries1.addOrUpdate((java.lang.Number) 10L, (java.lang.Number) (-1L));
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries1.addOrUpdate((double) (short) 0, (double) 0L);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNull(xYDataItem55);
        org.junit.Assert.assertNull(xYDataItem58);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        java.lang.String str16 = xYSeries12.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries12.add(xYDataItem17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        boolean boolean81 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) (byte) 1, true);
        xYSeries1.add((double) 0, (java.lang.Number) (-1.0f), false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.Comparable comparable10 = xYSeries8.getKey();
        xYSeries8.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean18 = xYSeries8.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries8.remove(0);
        xYSeries1.add(xYDataItem20, false);
        xYSeries1.add((double) 10.0f, (java.lang.Number) (-1L), false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = xYSeries1.getY(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        java.lang.String str13 = xYSeries11.getDescription();
        xYSeries11.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean18 = xYSeries11.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        java.lang.String str22 = xYSeries20.getDescription();
        xYSeries20.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean27 = xYSeries20.equals((java.lang.Object) 2147483647);
        boolean boolean28 = xYSeries11.equals((java.lang.Object) xYSeries20);
        xYSeries11.fireSeriesChanged();
        xYSeries11.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries11.add(0.0d, (double) (-1));
        boolean boolean36 = xYSeries1.equals((java.lang.Object) 0.0d);
        int int38 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        double[][] doubleArray10 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        boolean boolean8 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries10.removeChangeListener(seriesChangeListener13);
        java.lang.String str15 = xYSeries10.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable20 = xYSeries19.getKey();
        xYSeries19.add((double) (short) 0, (double) ' ');
        int int25 = xYSeries19.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        xYSeries27.setMaximumItemCount((int) (byte) 10);
        xYSeries27.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list35 = xYSeries27.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries27.removeChangeListener(seriesChangeListener36);
        xYSeries27.add((double) 100.0f, 100.0d);
        boolean boolean41 = xYSeries27.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries27.remove((int) (byte) 1);
        xYSeries19.add(xYDataItem43);
        xYSeries10.add(xYDataItem43);
        xYSeries3.add(xYDataItem43, false);
        xYSeries3.add((java.lang.Number) 10.0d, (java.lang.Number) 1.0d, true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.String str16 = xYSeries1.getDescription();
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        double[][] doubleArray4 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.setNotify(true);
        java.lang.Number number15 = null;
        xYSeries11.add((double) (-1), number15);
        java.util.List list17 = xYSeries11.getItems();
        xYSeries1.data = list17;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.lang.Object obj4 = xYSeries1.clone();
        java.lang.Comparable comparable5 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        xYSeries7.setMaximumItemCount((int) (byte) 10);
        xYSeries7.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list15 = xYSeries7.getItems();
        int int16 = xYSeries7.getItemCount();
        xYSeries7.delete((int) (byte) 10, 1);
        xYSeries7.setKey((java.lang.Comparable) (-2));
        boolean boolean22 = xYSeries1.equals((java.lang.Object) xYSeries7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0d + "'", comparable5, 10.0d);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) (short) 1, true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.setNotify(true);
        java.lang.Number number14 = null;
        xYSeries10.add((double) (-1), number14);
        java.util.List list16 = xYSeries10.getItems();
        boolean boolean17 = xYSeries10.getAllowDuplicateXValues();
        boolean boolean18 = xYSeries10.getNotify();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries10.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable28 = xYSeries27.getKey();
        xYSeries27.add((double) (short) 0, (double) ' ');
        int int33 = xYSeries27.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries35.clear();
        xYSeries35.setMaximumItemCount((int) (byte) 10);
        xYSeries35.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list43 = xYSeries35.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        xYSeries35.removeChangeListener(seriesChangeListener44);
        xYSeries35.add((double) 100.0f, 100.0d);
        boolean boolean49 = xYSeries35.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries35.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem51);
        xYSeries21.add(xYDataItem51, true);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem51, true, true);
        xYSeries1.add(xYDataItem51, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries1.addOrUpdate((double) (short) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 10 + "'", comparable28, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false, true);
        int int4 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate(10.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = xYSeries1.equals((java.lang.Object) (-1.0d));
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (short) -1, (int) (short) 1);
        java.lang.Object obj11 = xYSeries10.clone();
        java.util.List list12 = xYSeries10.getItems();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        java.lang.String str19 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries23.add(xYDataItem47);
        xYSeries14.add(xYDataItem47);
        xYSeries1.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries1.addChangeListener(seriesChangeListener32);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries1.removeChangeListener(seriesChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries1.removeChangeListener(seriesChangeListener36);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries1.addOrUpdate((double) (byte) 0, (double) (short) 0);
        java.util.List list43 = xYSeries1.getItems();
        boolean boolean44 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries3.clear();
        int int5 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries3.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable16 = xYSeries15.getKey();
        xYSeries15.add((double) (short) 0, (double) ' ');
        int int21 = xYSeries15.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        xYSeries23.setMaximumItemCount((int) (byte) 10);
        xYSeries23.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list31 = xYSeries23.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.removeChangeListener(seriesChangeListener32);
        xYSeries23.add((double) 100.0f, 100.0d);
        boolean boolean37 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries23.remove((int) (byte) 1);
        xYSeries15.add(xYDataItem39);
        xYSeries11.add(xYDataItem39, false);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, true, false);
        xYSeries48.add((double) (short) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.setNotify(true);
        java.lang.Number number23 = null;
        xYSeries19.add((double) (-1), number23);
        java.util.List list25 = xYSeries19.getItems();
        boolean boolean26 = xYSeries19.getAllowDuplicateXValues();
        boolean boolean27 = xYSeries19.getNotify();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries19.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable37 = xYSeries36.getKey();
        xYSeries36.add((double) (short) 0, (double) ' ');
        int int42 = xYSeries36.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries44.clear();
        xYSeries44.setMaximumItemCount((int) (byte) 10);
        xYSeries44.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list52 = xYSeries44.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries44.removeChangeListener(seriesChangeListener53);
        xYSeries44.add((double) 100.0f, 100.0d);
        boolean boolean58 = xYSeries44.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries44.remove((int) (byte) 1);
        xYSeries36.add(xYDataItem60);
        xYSeries30.add(xYDataItem60, true);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, true, true);
        xYSeries12.add(xYDataItem60, false);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, false, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (short) 10 + "'", comparable37, (short) 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        java.lang.String str16 = xYSeries12.getDescription();
        java.lang.String str17 = xYSeries12.getDescription();
        java.lang.String str18 = xYSeries12.getDescription();
        xYSeries12.add((java.lang.Number) 2, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries12.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (byte) 0, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        xYSeries3.add((java.lang.Number) (-1.0d), (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        java.lang.Object obj11 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        java.lang.String str7 = xYSeries5.getDescription();
        xYSeries5.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean12 = xYSeries5.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        java.lang.String str16 = xYSeries14.getDescription();
        xYSeries14.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean21 = xYSeries14.equals((java.lang.Object) 2147483647);
        boolean boolean22 = xYSeries5.equals((java.lang.Object) xYSeries14);
        xYSeries14.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        java.lang.String str30 = xYSeries28.getDescription();
        xYSeries28.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean35 = xYSeries28.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.clear();
        java.lang.String str39 = xYSeries37.getDescription();
        xYSeries37.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean44 = xYSeries37.equals((java.lang.Object) 2147483647);
        boolean boolean45 = xYSeries28.equals((java.lang.Object) xYSeries37);
        xYSeries28.fireSeriesChanged();
        xYSeries28.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        xYSeries51.setMaximumItemCount((int) (byte) 10);
        xYSeries51.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list59 = xYSeries51.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        xYSeries51.removeChangeListener(seriesChangeListener60);
        xYSeries51.add((double) 100.0f, 100.0d);
        boolean boolean65 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries51.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem67, false);
        xYSeries14.add(xYDataItem67);
        xYSeries1.add(xYDataItem67);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener72);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries1.addChangeListener(seriesChangeListener32);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0f, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        java.lang.String str26 = xYSeries24.getDescription();
        xYSeries24.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean31 = xYSeries24.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.String str35 = xYSeries33.getDescription();
        xYSeries33.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean40 = xYSeries33.equals((java.lang.Object) 2147483647);
        boolean boolean41 = xYSeries24.equals((java.lang.Object) xYSeries33);
        xYSeries24.fireSeriesChanged();
        xYSeries24.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        xYSeries47.setMaximumItemCount((int) (byte) 10);
        xYSeries47.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list55 = xYSeries47.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries47.removeChangeListener(seriesChangeListener56);
        xYSeries47.add((double) 100.0f, 100.0d);
        boolean boolean61 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries47.remove((int) (byte) 1);
        xYSeries24.add(xYDataItem63, false);
        xYSeries10.add(xYDataItem63);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries10.removeChangeListener(seriesChangeListener67);
        java.lang.Class<?> wildcardClass69 = xYSeries10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (short) 100, (int) (byte) 10);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.remove((java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0d + "'", comparable17, 10.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener2);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) 10.0d, true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.util.List list12 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries14.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries25.add(xYDataItem55, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        java.lang.String str61 = xYSeries3.getDescription();
        boolean boolean62 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(xYDataItem65);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        int int18 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries3.addChangeListener(seriesChangeListener10);
        xYSeries3.setMaximumItemCount(1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 100, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true, true);
        java.util.List list19 = xYSeries18.getItems();
        xYSeries14.data = list19;
        boolean boolean21 = xYSeries14.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        java.util.List list43 = xYSeries1.data;
        xYSeries1.add((double) 100, (double) 2);
        java.lang.Number number48 = xYSeries1.getX((int) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries1.removeChangeListener(seriesChangeListener49);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + number48 + "' != '" + 100.0d + "'", number48, 100.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy(4, 10);
        java.lang.Class<?> wildcardClass17 = xYSeries16.getClass();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries3.clear();
        int int5 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries3.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable16 = xYSeries15.getKey();
        xYSeries15.add((double) (short) 0, (double) ' ');
        int int21 = xYSeries15.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        xYSeries23.setMaximumItemCount((int) (byte) 10);
        xYSeries23.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list31 = xYSeries23.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.removeChangeListener(seriesChangeListener32);
        xYSeries23.add((double) 100.0f, 100.0d);
        boolean boolean37 = xYSeries23.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries23.remove((int) (byte) 1);
        xYSeries15.add(xYDataItem39);
        xYSeries11.add(xYDataItem39, false);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem39);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries1.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        int int24 = xYSeries1.getItemCount();
        boolean boolean25 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener24);
        xYSeries18.setNotify(false);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) xYSeries18);
        int int29 = xYSeries18.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener37);
        java.util.List list39 = xYSeries33.getItems();
        xYSeries18.data = list39;
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries18.createCopy(100, 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.add((double) 10L, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(xYSeries43);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries13 = xYSeries3.createCopy((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        java.lang.String str26 = xYSeries24.getDescription();
        xYSeries24.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean31 = xYSeries24.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.String str35 = xYSeries33.getDescription();
        xYSeries33.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean40 = xYSeries33.equals((java.lang.Object) 2147483647);
        boolean boolean41 = xYSeries24.equals((java.lang.Object) xYSeries33);
        xYSeries24.fireSeriesChanged();
        xYSeries24.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        xYSeries47.setMaximumItemCount((int) (byte) 10);
        xYSeries47.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list55 = xYSeries47.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries47.removeChangeListener(seriesChangeListener56);
        xYSeries47.add((double) 100.0f, 100.0d);
        boolean boolean61 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries47.remove((int) (byte) 1);
        xYSeries24.add(xYDataItem63, false);
        xYSeries10.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, true);
        boolean boolean69 = xYSeries68.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        int int6 = xYSeries1.getItemCount();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100.0f, number8);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries1.createCopy((int) ' ', (int) (short) 0);
        xYSeries1.fireSeriesChanged();
        boolean boolean44 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 10L);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries1.createCopy((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries25.updateByIndex((int) (short) 0, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(xYSeries25);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Object obj10 = xYSeries1.clone();
        xYSeries1.add((double) ' ', (double) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        boolean boolean32 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries23);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries40.clear();
        java.lang.Comparable comparable42 = xYSeries40.getKey();
        xYSeries40.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray46 = xYSeries40.toArray();
        java.util.List list47 = xYSeries40.getItems();
        xYSeries38.data = list47;
        xYSeries1.data = list47;
        java.lang.Class<?> wildcardClass50 = list47.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + 10.0d + "'", comparable42, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        java.lang.Comparable comparable26 = xYSeries1.getKey();
        boolean boolean27 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) 0 + "'", comparable26, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries1.addChangeListener(seriesChangeListener32);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) 1, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.setNotify(false);
        xYSeries1.setKey((java.lang.Comparable) "");
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(3, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.String str4 = xYSeries3.getDescription();
        xYSeries3.add(0.0d, (java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getX((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        double[][] doubleArray11 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        xYSeries13.setMaximumItemCount((int) (byte) 10);
        xYSeries13.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries13.clear();
        java.util.List list22 = xYSeries13.data;
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries13.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries30.addChangeListener(seriesChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries34.clear();
        xYSeries34.setMaximumItemCount((int) (byte) 10);
        xYSeries34.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list42 = xYSeries34.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries34.removeChangeListener(seriesChangeListener43);
        xYSeries34.add((double) 100.0f, 100.0d);
        boolean boolean48 = xYSeries34.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries34.remove((int) (byte) 1);
        xYSeries30.add(xYDataItem50);
        xYSeries13.add(xYDataItem50);
        xYSeries1.add(xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, true, true);
        boolean boolean57 = xYSeries56.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries56.updateByIndex(0, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = xYDataItem17.getClass();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) '#', (double) (short) -1);
        xYSeries1.add((double) 1.0f, (double) 1, true);
        boolean boolean19 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        xYSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        java.lang.String str16 = xYSeries12.getDescription();
        java.lang.String str17 = xYSeries12.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries12.remove((java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.setNotify(true);
        java.lang.Number number30 = null;
        xYSeries26.add((double) (-1), number30);
        java.util.List list32 = xYSeries26.getItems();
        boolean boolean33 = xYSeries26.getAllowDuplicateXValues();
        boolean boolean34 = xYSeries26.getNotify();
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries26.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable44 = xYSeries43.getKey();
        xYSeries43.add((double) (short) 0, (double) ' ');
        int int49 = xYSeries43.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        xYSeries51.setMaximumItemCount((int) (byte) 10);
        xYSeries51.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list59 = xYSeries51.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        xYSeries51.removeChangeListener(seriesChangeListener60);
        xYSeries51.add((double) 100.0f, 100.0d);
        boolean boolean65 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries51.remove((int) (byte) 1);
        xYSeries43.add(xYDataItem67);
        xYSeries37.add(xYDataItem67, true);
        xYSeries1.add(xYDataItem67);
        xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) (byte) 100);
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (-2));
        int int79 = xYSeries1.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener80 = null;
        xYSeries1.removeChangeListener(seriesChangeListener80);
        xYSeries1.add((double) 0, (double) (short) 1, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + (short) 10 + "'", comparable44, (short) 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2) + "'", int49 == (-2));
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        xYSeries2.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries6.setNotify(true);
        java.lang.Number number10 = null;
        xYSeries6.add((double) (-1), number10);
        java.util.List list12 = xYSeries6.getItems();
        boolean boolean13 = xYSeries6.getAllowDuplicateXValues();
        boolean boolean14 = xYSeries6.getNotify();
        int int16 = xYSeries6.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable17 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries19.removeChangeListener(seriesChangeListener22);
        java.lang.String str24 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable29 = xYSeries28.getKey();
        xYSeries28.add((double) (short) 0, (double) ' ');
        int int34 = xYSeries28.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.clear();
        xYSeries36.setMaximumItemCount((int) (byte) 10);
        xYSeries36.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list44 = xYSeries36.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries36.removeChangeListener(seriesChangeListener45);
        xYSeries36.add((double) 100.0f, 100.0d);
        boolean boolean50 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries36.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem52);
        xYSeries19.add(xYDataItem52);
        xYSeries6.add(xYDataItem52);
        xYSeries2.add(xYDataItem52);
        int int57 = xYSeries2.getItemCount();
        double[][] doubleArray58 = xYSeries2.toArray();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0d + "'", comparable17, 10.0d);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (short) 10 + "'", comparable29, (short) 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(doubleArray58);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 0, (double) (byte) -1, true);
        xYSeries2.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.update((java.lang.Number) (byte) 100, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        xYSeries9.setMaximumItemCount((int) (byte) 10);
        xYSeries9.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list17 = xYSeries9.getItems();
        xYSeries1.data = list17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) '#', (double) (short) -1);
        xYSeries1.add((double) 1.0f, (double) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate(10.0d, (double) 100.0f);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable17 = xYSeries16.getKey();
        java.util.List list18 = xYSeries16.data;
        int int19 = xYSeries16.getMaximumItemCount();
        boolean boolean20 = xYSeries1.equals((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.addOrUpdate((double) (-2), (double) '#');
        xYSeries1.setMaximumItemCount(2147483647);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        int int30 = xYSeries28.getMaximumItemCount();
        int int31 = xYSeries28.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.Comparable comparable35 = xYSeries33.getKey();
        xYSeries33.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean43 = xYSeries33.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries33.remove(0);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45);
        xYSeries28.add(xYDataItem45, true);
        xYSeries1.add(xYDataItem45, true);
        boolean boolean51 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0d + "'", comparable35, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.util.List list12 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries14.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries25.add(xYDataItem55, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 100);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener64);
        xYSeries3.add((double) 3, (java.lang.Number) (-1));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(xYDataItem63);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (byte) 100);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        boolean boolean6 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.String str10 = xYSeries8.getDescription();
        xYSeries8.add((double) 100.0f, (double) 1L, false);
        xYSeries8.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries8.addPropertyChangeListener(propertyChangeListener17);
        boolean boolean20 = xYSeries8.equals((java.lang.Object) 1);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) xYSeries8);
        xYSeries1.add((double) (byte) 0, (double) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 3, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.util.List list4 = xYSeries1.getItems();
        int int6 = xYSeries1.indexOf((java.lang.Number) 1.0d);
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((double) '#', (double) (-1.0f));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean15 = xYSeries1.equals((java.lang.Object) 100);
        double[][] doubleArray16 = xYSeries1.toArray();
        xYSeries1.add((double) 0.0f, (java.lang.Number) (byte) 0, false);
        java.lang.Class<?> wildcardClass21 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries13.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        int int14 = xYSeries1.getItemCount();
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.clear();
        xYSeries1.add((double) 0L, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        boolean boolean14 = xYSeries7.getAllowDuplicateXValues();
        boolean boolean15 = xYSeries7.getNotify();
        int int17 = xYSeries7.indexOf((java.lang.Number) (short) 1);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) (short) 1);
        java.lang.Comparable comparable19 = xYSeries1.getKey();
        xYSeries1.add((double) (short) 1, (double) 0.0f, true);
        java.lang.Object obj24 = xYSeries1.clone();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        boolean boolean32 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries23.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        java.lang.Comparable comparable18 = xYSeries16.getKey();
        xYSeries16.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean26 = xYSeries16.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries16.remove(0);
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries16.createCopy((int) (byte) 0, 0);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        xYSeries33.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries33.clear();
        xYSeries33.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries45.clear();
        java.lang.String str47 = xYSeries45.getDescription();
        xYSeries45.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean52 = xYSeries45.equals((java.lang.Object) 2147483647);
        boolean boolean53 = xYSeries33.equals((java.lang.Object) 2147483647);
        java.lang.String str54 = xYSeries33.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries33.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean58 = xYSeries33.getAutoSort();
        xYSeries33.setDescription("hi!");
        xYSeries33.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        xYSeries67.addChangeListener(seriesChangeListener68);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries71.clear();
        xYSeries71.setMaximumItemCount((int) (byte) 10);
        xYSeries71.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list79 = xYSeries71.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener80 = null;
        xYSeries71.removeChangeListener(seriesChangeListener80);
        xYSeries71.add((double) 100.0f, 100.0d);
        boolean boolean85 = xYSeries71.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries71.remove((int) (byte) 1);
        xYSeries67.add(xYDataItem87);
        xYSeries33.add(xYDataItem87, false);
        boolean boolean91 = xYSeries31.equals((java.lang.Object) xYDataItem87);
        xYSeries1.add(xYDataItem87);
        double[][] doubleArray93 = xYSeries1.toArray();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0d + "'", comparable18, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(doubleArray93);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        int int11 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries11.clear();
        java.util.List list20 = xYSeries11.data;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries11.removeChangeListener(seriesChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        xYSeries32.setMaximumItemCount((int) (byte) 10);
        xYSeries32.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list40 = xYSeries32.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries32.removeChangeListener(seriesChangeListener41);
        xYSeries32.add((double) 100.0f, 100.0d);
        boolean boolean46 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries32.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem48);
        xYSeries11.add(xYDataItem48);
        xYSeries1.add(xYDataItem48);
        java.lang.String str52 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount(100);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.clear();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list9 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        xYSeries7.setMaximumItemCount((int) (byte) 10);
        xYSeries7.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list15 = xYSeries7.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries7.removeChangeListener(seriesChangeListener16);
        xYSeries7.add((double) 100.0f, 100.0d);
        boolean boolean21 = xYSeries7.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries7.remove((int) (byte) 1);
        xYSeries3.add(xYDataItem23);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.isEmpty();
        java.util.List list8 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries1.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj9 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (byte) 100, (java.lang.Number) 4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), true, true);
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        boolean boolean7 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean16 = xYSeries9.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries20.addChangeListener(seriesChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        xYSeries24.setMaximumItemCount((int) (byte) 10);
        xYSeries24.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list32 = xYSeries24.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries24.removeChangeListener(seriesChangeListener33);
        xYSeries24.add((double) 100.0f, 100.0d);
        boolean boolean38 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries24.remove((int) (byte) 1);
        xYSeries20.add(xYDataItem40);
        xYSeries9.add(xYDataItem40, false);
        xYSeries1.add(xYDataItem40, false);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        xYSeries46.setKey((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries46.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        xYSeries5.setMaximumItemCount((int) (byte) 10);
        xYSeries5.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries5.clear();
        xYSeries5.setKey((java.lang.Comparable) (short) 0);
        xYSeries5.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries5.add((double) 0.0f, (double) 0L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries5.removeChangeListener(seriesChangeListener22);
        java.util.List list24 = xYSeries5.getItems();
        xYSeries1.data = list24;
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        boolean boolean15 = xYSeries1.getNotify();
        int int17 = xYSeries1.indexOf((java.lang.Number) 2147483647);
        double[][] doubleArray18 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean15 = xYSeries1.equals((java.lang.Object) 100);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        xYSeries17.setMaximumItemCount((int) (byte) 10);
        xYSeries17.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries17.clear();
        xYSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries29.clear();
        java.lang.String str31 = xYSeries29.getDescription();
        xYSeries29.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean36 = xYSeries29.equals((java.lang.Object) 2147483647);
        boolean boolean37 = xYSeries17.equals((java.lang.Object) 2147483647);
        java.lang.String str38 = xYSeries17.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries17.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean42 = xYSeries17.getAutoSort();
        java.util.List list43 = xYSeries17.data;
        xYSeries1.data = list43;
        xYSeries1.setDescription("hi!");
        java.lang.Number number47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries1.remove(number47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(xYDataItem41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1.0d), (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        int int4 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(2);
        java.lang.Object obj7 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        java.util.List list18 = xYSeries1.getItems();
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries1.removeChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        xYSeries30.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries30.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries30.addChangeListener(seriesChangeListener36);
        xYSeries30.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries30.addOrUpdate((double) 100, 100.0d);
        java.util.List list42 = xYSeries30.data;
        xYSeries1.data = list42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number45 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(xYDataItem41);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.util.List list22 = xYSeries19.data;
        xYSeries15.data = list22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries15.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 3, false);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.addChangeListener(seriesChangeListener20);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        boolean boolean32 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries23);
        xYSeries1.setKey((java.lang.Comparable) 1L);
        xYSeries1.clear();
        xYSeries1.delete((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 10);
        xYSeries1.setMaximumItemCount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries1.getX(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        xYSeries1.setMaximumItemCount(3);
        java.lang.Number number21 = null;
        xYSeries1.add((java.lang.Number) 100.0d, number21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries1.removeChangeListener(seriesChangeListener23);
        java.lang.Number number26 = xYSeries1.getX(2);
        boolean boolean27 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 100.0d + "'", number26, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable47 = xYSeries46.getKey();
        xYSeries46.add((double) (short) 0, (double) ' ');
        int int52 = xYSeries46.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries46.addOrUpdate((double) '#', (double) (-1.0f));
        boolean boolean56 = xYSeries1.equals((java.lang.Object) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + (short) 10 + "'", comparable47, (short) 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2) + "'", int52 == (-2));
        org.junit.Assert.assertNull(xYDataItem55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        xYSeries3.add((double) (-1.0f), (java.lang.Number) 4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 2, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        xYSeries21.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries21.clear();
        java.util.List list30 = xYSeries21.data;
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries21.removeChangeListener(seriesChangeListener33);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries38.addChangeListener(seriesChangeListener39);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries42.clear();
        xYSeries42.setMaximumItemCount((int) (byte) 10);
        xYSeries42.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list50 = xYSeries42.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries42.removeChangeListener(seriesChangeListener51);
        xYSeries42.add((double) 100.0f, 100.0d);
        boolean boolean56 = xYSeries42.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries42.remove((int) (byte) 1);
        xYSeries38.add(xYDataItem58);
        xYSeries21.add(xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58);
        xYSeries3.add(xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj10 = xYSeries1.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getX((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        boolean boolean11 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.add((double) 2147483647, (java.lang.Number) 100.0f, true);
        xYSeries1.setDescription("");
        boolean boolean17 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        boolean boolean14 = xYSeries7.getAllowDuplicateXValues();
        boolean boolean15 = xYSeries7.getNotify();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries7.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable25 = xYSeries24.getKey();
        xYSeries24.add((double) (short) 0, (double) ' ');
        int int30 = xYSeries24.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        xYSeries32.setMaximumItemCount((int) (byte) 10);
        xYSeries32.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list40 = xYSeries32.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries32.removeChangeListener(seriesChangeListener41);
        xYSeries32.add((double) 100.0f, 100.0d);
        boolean boolean46 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries32.remove((int) (byte) 1);
        xYSeries24.add(xYDataItem48);
        xYSeries18.add(xYDataItem48, true);
        xYSeries18.clear();
        xYSeries18.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list56 = xYSeries18.data;
        xYSeries1.data = list56;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        int int4 = xYSeries1.getMaximumItemCount();
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10.0d, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries10.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-2));
        int int22 = xYSeries10.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries24.createCopy((int) '4', (int) '4');
        boolean boolean31 = xYSeries24.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        xYSeries33.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries33.clear();
        java.util.List list42 = xYSeries33.data;
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener43);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries33.removeChangeListener(seriesChangeListener45);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries50.addChangeListener(seriesChangeListener51);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries54.clear();
        xYSeries54.setMaximumItemCount((int) (byte) 10);
        xYSeries54.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list62 = xYSeries54.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        xYSeries54.removeChangeListener(seriesChangeListener63);
        xYSeries54.add((double) 100.0f, 100.0d);
        boolean boolean68 = xYSeries54.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries54.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem70);
        xYSeries33.add(xYDataItem70);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70);
        xYSeries24.add(xYDataItem70, true);
        xYSeries10.setKey((java.lang.Comparable) true);
        java.lang.Class<?> wildcardClass77 = xYSeries10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xYDataItem70);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean7 = xYSeries6.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries6.addOrUpdate((double) 10.0f, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.update((java.lang.Number) 100, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = xYSeries12.clone();
        java.lang.String str16 = xYSeries12.getDescription();
        int int18 = xYSeries12.indexOf((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.removeChangeListener(seriesChangeListener3);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries12.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, true);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries4.clear();
        int int6 = xYSeries4.getMaximumItemCount();
        xYSeries4.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries4.createCopy((int) (byte) 100, 2);
        java.util.List list13 = xYSeries4.getItems();
        xYSeries4.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean17 = xYSeries4.getNotify();
        xYSeries4.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries23.add(xYDataItem47);
        xYSeries4.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem47);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.clear();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries21.addChangeListener(seriesChangeListener27);
        boolean boolean29 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.setNotify(true);
        java.lang.Number number35 = null;
        xYSeries31.add((double) (-1), number35);
        java.util.List list37 = xYSeries31.getItems();
        xYSeries21.data = list37;
        xYSeries10.data = list37;
        xYSeries10.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries10.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        double[][] doubleArray2 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(1, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean4 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener29);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 0, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((double) ' ', 0.0d);
        java.util.List list9 = xYSeries3.data;
        xYSeries3.delete((int) '#', 10);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        boolean boolean11 = xYSeries1.getNotify();
        xYSeries1.setDescription("hi!");
        double[][] doubleArray14 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        xYSeries9.setNotify(true);
        xYSeries9.setDescription("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        int int81 = xYSeries1.getMaximumItemCount();
        int int83 = xYSeries1.indexOf((java.lang.Number) (-1.0f));
        xYSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener85 = null;
        xYSeries1.addChangeListener(seriesChangeListener85);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries1.createCopy((int) ' ', (int) (short) 0);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add(0.0d, (java.lang.Number) (-5908509288197150436L));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        xYSeries1.add((double) (-1.0f), (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(100, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 10L);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries1.createCopy((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = xYSeries25.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(xYSeries25);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        xYSeries1.add((double) (-2), (double) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.add((double) (-1), (double) (byte) 10, false);
        java.util.List list43 = xYSeries1.data;
        xYSeries1.add((double) 100, (double) 2);
        double[][] doubleArray47 = xYSeries1.toArray();
        boolean boolean48 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        java.lang.String str15 = xYSeries1.getDescription();
        xYSeries1.add((double) 2, (double) (-2), true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) '#', (int) ' ');
        xYSeries1.setNotify(false);
        boolean boolean16 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        boolean boolean10 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        java.lang.String str26 = xYSeries24.getDescription();
        xYSeries24.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean31 = xYSeries24.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.String str35 = xYSeries33.getDescription();
        xYSeries33.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean40 = xYSeries33.equals((java.lang.Object) 2147483647);
        boolean boolean41 = xYSeries24.equals((java.lang.Object) xYSeries33);
        xYSeries24.fireSeriesChanged();
        xYSeries24.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        xYSeries47.setMaximumItemCount((int) (byte) 10);
        xYSeries47.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list55 = xYSeries47.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries47.removeChangeListener(seriesChangeListener56);
        xYSeries47.add((double) 100.0f, 100.0d);
        boolean boolean61 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries47.remove((int) (byte) 1);
        xYSeries24.add(xYDataItem63, false);
        xYSeries10.add(xYDataItem63);
        java.lang.Number number68 = xYSeries10.getY(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertEquals("'" + number68 + "' != '" + 0 + "'", number68, 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        boolean boolean5 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        java.lang.Comparable comparable25 = xYSeries23.getKey();
        xYSeries23.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean33 = xYSeries23.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries23.remove(0);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem35);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem35);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 10.0d + "'", comparable25, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(xYDataItem35);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) (-2), (double) (-3));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(10, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        xYSeries2.add((double) 1L, (double) 10, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries2.removeChangeListener(seriesChangeListener7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        xYSeries3.add(1.0d, (double) 0, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries11.clear();
        java.util.List list20 = xYSeries11.data;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries11.removeChangeListener(seriesChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        xYSeries32.setMaximumItemCount((int) (byte) 10);
        xYSeries32.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list40 = xYSeries32.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries32.removeChangeListener(seriesChangeListener41);
        xYSeries32.add((double) 100.0f, 100.0d);
        boolean boolean46 = xYSeries32.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries32.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem48);
        xYSeries11.add(xYDataItem48);
        boolean boolean51 = xYSeries3.equals((java.lang.Object) xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries1.fireSeriesChanged();
        java.util.List list12 = xYSeries1.data;
        boolean boolean13 = xYSeries1.getNotify();
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean7 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 10L, (java.lang.Number) (short) 0);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        double[][] doubleArray10 = xYSeries1.toArray();
        boolean boolean11 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        xYSeries3.add((double) 1, (double) (-1.0f), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries3.addChangeListener(seriesChangeListener8);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true, true);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        xYSeries51.setMaximumItemCount((int) (byte) 10);
        xYSeries51.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list59 = xYSeries51.getItems();
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries61.clear();
        java.lang.String str63 = xYSeries61.getDescription();
        java.util.List list64 = xYSeries61.getItems();
        xYSeries51.data = list64;
        xYSeries49.data = list64;
        xYSeries49.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries49.addOrUpdate((java.lang.Number) 4, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        xYSeries9.setMaximumItemCount((int) (byte) 10);
        xYSeries9.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries9.clear();
        java.util.List list18 = xYSeries9.data;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries9.removeChangeListener(seriesChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries26.addChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        xYSeries30.setMaximumItemCount((int) (byte) 10);
        xYSeries30.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list38 = xYSeries30.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries30.removeChangeListener(seriesChangeListener39);
        xYSeries30.add((double) 100.0f, 100.0d);
        boolean boolean44 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries30.remove((int) (byte) 1);
        xYSeries26.add(xYDataItem46);
        xYSeries9.add(xYDataItem46);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = xYSeries52.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        boolean boolean14 = xYSeries7.getAllowDuplicateXValues();
        boolean boolean15 = xYSeries7.getNotify();
        int int17 = xYSeries7.indexOf((java.lang.Number) (short) 1);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) (short) 1);
        xYSeries1.setKey((java.lang.Comparable) (-1));
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries12.addChangeListener(seriesChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        xYSeries16.setMaximumItemCount((int) (byte) 10);
        xYSeries16.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list24 = xYSeries16.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries16.removeChangeListener(seriesChangeListener25);
        xYSeries16.add((double) 100.0f, 100.0d);
        boolean boolean30 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries16.remove((int) (byte) 1);
        xYSeries12.add(xYDataItem32);
        xYSeries1.add(xYDataItem32, false);
        xYSeries1.add((double) 100.0f, (double) (byte) -1, false);
        boolean boolean40 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) (byte) 100, (java.lang.Number) 0.0f);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        java.lang.String str13 = xYSeries11.getDescription();
        xYSeries11.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean18 = xYSeries11.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        java.lang.String str22 = xYSeries20.getDescription();
        xYSeries20.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean27 = xYSeries20.equals((java.lang.Object) 2147483647);
        boolean boolean28 = xYSeries11.equals((java.lang.Object) xYSeries20);
        xYSeries11.fireSeriesChanged();
        xYSeries11.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries11.add(0.0d, (double) (-1));
        boolean boolean36 = xYSeries1.equals((java.lang.Object) 0.0d);
        int int38 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        java.lang.Class<?> wildcardClass39 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        java.lang.String str7 = xYSeries1.getDescription();
        int int8 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.setNotify(true);
        java.lang.Number number13 = null;
        xYSeries9.add((double) (-1), number13);
        java.util.List list15 = xYSeries9.getItems();
        xYSeries1.data = list15;
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.remove((java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        xYSeries1.setNotify(true);
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        int int4 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(2);
        java.lang.Object obj7 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        int int11 = xYSeries9.getMaximumItemCount();
        xYSeries9.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries9.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable22 = xYSeries21.getKey();
        xYSeries21.add((double) (short) 0, (double) ' ');
        int int27 = xYSeries21.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries29.clear();
        xYSeries29.setMaximumItemCount((int) (byte) 10);
        xYSeries29.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list37 = xYSeries29.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries29.removeChangeListener(seriesChangeListener38);
        xYSeries29.add((double) 100.0f, 100.0d);
        boolean boolean43 = xYSeries29.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries29.remove((int) (byte) 1);
        xYSeries21.add(xYDataItem45);
        xYSeries17.add(xYDataItem45, false);
        xYSeries1.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 10 + "'", comparable22, (short) 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.setNotify(true);
        java.lang.Number number15 = null;
        xYSeries11.add((double) (-1), number15);
        java.util.List list17 = xYSeries11.getItems();
        boolean boolean18 = xYSeries11.getAllowDuplicateXValues();
        boolean boolean19 = xYSeries11.getNotify();
        int int21 = xYSeries11.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable22 = xYSeries11.getKey();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries24.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable34 = xYSeries33.getKey();
        xYSeries33.add((double) (short) 0, (double) ' ');
        int int39 = xYSeries33.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries41.clear();
        xYSeries41.setMaximumItemCount((int) (byte) 10);
        xYSeries41.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list49 = xYSeries41.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        xYSeries41.removeChangeListener(seriesChangeListener50);
        xYSeries41.add((double) 100.0f, 100.0d);
        boolean boolean55 = xYSeries41.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries41.remove((int) (byte) 1);
        xYSeries33.add(xYDataItem57);
        xYSeries24.add(xYDataItem57);
        xYSeries11.add(xYDataItem57);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem57, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0d + "'", comparable22, 10.0d);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (short) 10 + "'", comparable34, (short) 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.getAutoSort();
        java.util.List list27 = xYSeries1.data;
        xYSeries1.setMaximumItemCount((int) (short) 1);
        boolean boolean30 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex((-3), (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        xYSeries3.setKey((java.lang.Comparable) false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries23.removeChangeListener(seriesChangeListener26);
        java.lang.String str28 = xYSeries23.getDescription();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable33 = xYSeries32.getKey();
        xYSeries32.add((double) (short) 0, (double) ' ');
        int int38 = xYSeries32.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries40.clear();
        xYSeries40.setMaximumItemCount((int) (byte) 10);
        xYSeries40.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list48 = xYSeries40.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries40.removeChangeListener(seriesChangeListener49);
        xYSeries40.add((double) 100.0f, 100.0d);
        boolean boolean54 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries40.remove((int) (byte) 1);
        xYSeries32.add(xYDataItem56);
        xYSeries23.add(xYDataItem56);
        xYSeries23.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener61);
        boolean boolean63 = xYSeries23.getNotify();
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries65.setNotify(true);
        java.lang.Number number69 = null;
        xYSeries65.add((double) (-1), number69);
        java.util.List list71 = xYSeries65.getItems();
        boolean boolean72 = xYSeries65.getAllowDuplicateXValues();
        boolean boolean73 = xYSeries65.getNotify();
        boolean boolean74 = xYSeries65.getAllowDuplicateXValues();
        xYSeries65.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries77.clear();
        java.lang.Comparable comparable79 = xYSeries77.getKey();
        xYSeries77.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean87 = xYSeries77.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries77.remove(0);
        xYSeries65.add(xYDataItem89);
        xYSeries23.add(xYDataItem89, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, false, true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (short) 10 + "'", comparable33, (short) 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + comparable79 + "' != '" + 10.0d + "'", comparable79, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        int int24 = xYSeries1.getItemCount();
        xYSeries1.delete(1, (-3));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 'a', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) -1, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.add((double) 4, (double) 10.0f, true);
        int int15 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int8 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) -1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        xYSeries14.fireSeriesChanged();
        xYSeries14.setNotify(true);
        java.util.List list18 = xYSeries14.getItems();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.String str16 = xYSeries1.getDescription();
        xYSeries1.updateByIndex(0, (java.lang.Number) 100);
        xYSeries1.add((double) (byte) 100, (double) (-2), false);
        double[][] doubleArray24 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = xYSeries1.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        xYSeries1.add((double) (-2), (double) 0, false);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        boolean boolean61 = xYSeries3.getAutoSort();
        int int62 = xYSeries3.getItemCount();
        xYSeries3.setMaximumItemCount(4);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Object obj10 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true);
        boolean boolean3 = xYSeries2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 3, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        boolean boolean9 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.Comparable comparable15 = xYSeries13.getKey();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries13.createCopy((int) '4', (int) (short) 10);
        boolean boolean19 = xYSeries18.isEmpty();
        xYSeries18.add((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 0);
        java.util.List list23 = xYSeries18.data;
        xYSeries1.data = list23;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        int int4 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries6.clear();
        java.lang.Comparable comparable8 = xYSeries6.getKey();
        xYSeries6.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean16 = xYSeries6.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries6.remove(0);
        xYSeries1.add(xYDataItem18, false);
        xYSeries1.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0d + "'", comparable8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (short) -1, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        xYSeries3.clear();
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.data;
        java.lang.String str16 = xYSeries12.getDescription();
        java.lang.String str17 = xYSeries12.getDescription();
        java.lang.String str18 = xYSeries12.getDescription();
        xYSeries12.add((java.lang.Number) 2, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries12.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        xYSeries1.setNotify(true);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean25 = xYSeries18.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        java.lang.String str29 = xYSeries27.getDescription();
        xYSeries27.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean34 = xYSeries27.equals((java.lang.Object) 2147483647);
        boolean boolean35 = xYSeries18.equals((java.lang.Object) xYSeries27);
        xYSeries18.fireSeriesChanged();
        xYSeries18.setDescription("");
        boolean boolean39 = xYSeries1.equals((java.lang.Object) xYSeries18);
        int int40 = xYSeries18.getMaximumItemCount();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        int int11 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = xYSeries1.equals((java.lang.Object) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        int int18 = xYSeries16.getMaximumItemCount();
        xYSeries16.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries16.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable29 = xYSeries28.getKey();
        xYSeries28.add((double) (short) 0, (double) ' ');
        int int34 = xYSeries28.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.clear();
        xYSeries36.setMaximumItemCount((int) (byte) 10);
        xYSeries36.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list44 = xYSeries36.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries36.removeChangeListener(seriesChangeListener45);
        xYSeries36.add((double) 100.0f, 100.0d);
        boolean boolean50 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries36.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem52);
        xYSeries24.add(xYDataItem52, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, false);
        xYSeries1.add(xYDataItem52);
        double[][] doubleArray59 = xYSeries1.toArray();
        int int60 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (short) 10 + "'", comparable29, (short) 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        xYSeries1.add((double) 'a', (java.lang.Number) (-2));
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) '#', (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Class<?> wildcardClass16 = xYSeries13.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        java.lang.String str19 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries23.add(xYDataItem47);
        xYSeries14.add(xYDataItem47);
        xYSeries1.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.lang.String str54 = xYSeries53.getDescription();
        int int55 = xYSeries53.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries53.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove(0);
        xYSeries3.clear();
        java.lang.Object obj16 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.setNotify(true);
        java.lang.Number number13 = null;
        xYSeries9.add((double) (-1), number13);
        java.util.List list15 = xYSeries9.getItems();
        xYSeries1.data = list15;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((double) 0.0f, (double) 0L);
        java.lang.Object obj18 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) 'a', (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        xYSeries1.add((double) 10L, (java.lang.Number) 0.0f, false);
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.isEmpty();
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 1L);
        java.lang.String str19 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        int int13 = xYSeries1.indexOf((java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable17 = xYSeries16.getKey();
        double[][] doubleArray18 = xYSeries16.toArray();
        xYSeries16.add(1.0d, (double) 0, true);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        xYSeries24.setMaximumItemCount((int) (byte) 10);
        xYSeries24.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries24.clear();
        java.util.List list33 = xYSeries24.data;
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries24.removeChangeListener(seriesChangeListener36);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries41.addChangeListener(seriesChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries45.clear();
        xYSeries45.setMaximumItemCount((int) (byte) 10);
        xYSeries45.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list53 = xYSeries45.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        xYSeries45.removeChangeListener(seriesChangeListener54);
        xYSeries45.add((double) 100.0f, 100.0d);
        boolean boolean59 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries45.remove((int) (byte) 1);
        xYSeries41.add(xYDataItem61);
        xYSeries24.add(xYDataItem61);
        boolean boolean64 = xYSeries16.equals((java.lang.Object) xYDataItem61);
        xYSeries3.add(xYDataItem61, false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries43.setNotify(true);
        java.lang.Number number47 = null;
        xYSeries43.add((double) (-1), number47);
        java.util.List list49 = xYSeries43.getItems();
        boolean boolean50 = xYSeries43.getAllowDuplicateXValues();
        boolean boolean51 = xYSeries43.getNotify();
        boolean boolean52 = xYSeries43.getAllowDuplicateXValues();
        xYSeries43.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries55.clear();
        java.lang.Comparable comparable57 = xYSeries55.getKey();
        xYSeries55.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean65 = xYSeries55.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries55.remove(0);
        xYSeries43.add(xYDataItem67);
        xYSeries1.add(xYDataItem67, true);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 10.0d + "'", comparable57, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 3);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        int int7 = xYSeries5.getMaximumItemCount();
        xYSeries5.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int12 = xYSeries5.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries14.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries25.add(xYDataItem55, true);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true, true);
        xYSeries5.add(xYDataItem55, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        boolean boolean65 = xYSeries3.isEmpty();
        xYSeries3.add((double) 0L, (java.lang.Number) 1.0d, true);
        int int71 = xYSeries3.indexOf((java.lang.Number) (-3));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true, true);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (-5908509288197150436L), false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable12 = xYSeries11.getKey();
        xYSeries11.add((double) (short) 0, (double) ' ');
        int int17 = xYSeries11.indexOf((java.lang.Number) 1.0d);
        xYSeries11.add((double) (-2), (-1.0d));
        xYSeries11.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean25 = xYSeries11.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        int int29 = xYSeries27.getMaximumItemCount();
        xYSeries27.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries27.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable40 = xYSeries39.getKey();
        xYSeries39.add((double) (short) 0, (double) ' ');
        int int45 = xYSeries39.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        xYSeries47.setMaximumItemCount((int) (byte) 10);
        xYSeries47.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list55 = xYSeries47.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries47.removeChangeListener(seriesChangeListener56);
        xYSeries47.add((double) 100.0f, 100.0d);
        boolean boolean61 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries47.remove((int) (byte) 1);
        xYSeries39.add(xYDataItem63);
        xYSeries35.add(xYDataItem63, false);
        xYSeries11.add(xYDataItem63);
        java.lang.String str68 = xYSeries11.getDescription();
        boolean boolean69 = xYSeries11.getAutoSort();
        int int70 = xYSeries11.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries11.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10L);
        xYSeries3.add(xYDataItem73, true);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (short) 10 + "'", comparable40, (short) 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2) + "'", int45 == (-2));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.clear();
        xYSeries1.setNotify(true);
        int int12 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        xYSeries1.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj9 = xYSeries1.clone();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate(10.0d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-2), (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.setMaximumItemCount((int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries1.removeChangeListener(seriesChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries1.removeChangeListener(seriesChangeListener23);
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 100.0d, true);
        xYSeries1.updateByIndex(1, (java.lang.Number) (-3));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        xYSeries3.setKey((java.lang.Comparable) false);
        boolean boolean22 = xYSeries3.getAutoSort();
        java.lang.Class<?> wildcardClass23 = xYSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        xYSeries9.setMaximumItemCount((int) (byte) 10);
        xYSeries9.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list17 = xYSeries9.getItems();
        xYSeries1.data = list17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false, true);
        xYSeries3.delete(2147483647, 100);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener27);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries1.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 3, false);
        java.lang.Comparable comparable17 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) (short) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0d + "'", comparable17, 10.0d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        boolean boolean12 = xYSeries1.getAutoSort();
        boolean boolean13 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) 'a', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries7.addChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list19 = xYSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries11.removeChangeListener(seriesChangeListener20);
        xYSeries11.add((double) 100.0f, 100.0d);
        boolean boolean25 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries11.remove((int) (byte) 1);
        xYSeries7.add(xYDataItem27);
        xYSeries3.add(xYDataItem27);
        java.lang.Object obj30 = xYSeries3.clone();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries3.addOrUpdate((double) 2, (double) 100);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(xYDataItem33);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        xYSeries1.setMaximumItemCount(3);
        java.lang.Number number21 = null;
        xYSeries1.add((java.lang.Number) 100.0d, number21);
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) 4, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener27);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        int int13 = xYSeries1.indexOf((java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) 0, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) (-1L), false);
        java.util.List list21 = xYSeries1.data;
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        xYSeries1.fireSeriesChanged();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        xYSeries10.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries10.clear();
        java.util.List list19 = xYSeries10.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries10.removeChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries27.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        xYSeries1.add(0.0d, (double) (short) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number58 = xYSeries1.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        xYSeries12.clear();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries48.clear();
        int int50 = xYSeries48.getMaximumItemCount();
        xYSeries48.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries56 = xYSeries48.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable61 = xYSeries60.getKey();
        xYSeries60.add((double) (short) 0, (double) ' ');
        int int66 = xYSeries60.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries68.clear();
        xYSeries68.setMaximumItemCount((int) (byte) 10);
        xYSeries68.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list76 = xYSeries68.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        xYSeries68.removeChangeListener(seriesChangeListener77);
        xYSeries68.add((double) 100.0f, 100.0d);
        boolean boolean82 = xYSeries68.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries68.remove((int) (byte) 1);
        xYSeries60.add(xYDataItem84);
        xYSeries56.add(xYDataItem84, false);
        xYSeries12.add(xYDataItem84, false);
        org.jfree.data.xy.XYDataItem xYDataItem92 = xYSeries12.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) 10);
        xYSeries12.clear();
        xYSeries12.fireSeriesChanged();
        xYSeries12.add((double) (short) 10, (java.lang.Number) (-1), false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries56);
        org.junit.Assert.assertEquals("'" + comparable61 + "' != '" + (short) 10 + "'", comparable61, (short) 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xYDataItem84);
        org.junit.Assert.assertNull(xYDataItem92);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        java.util.List list4 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        double[][] doubleArray13 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(100, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        java.lang.String str7 = xYSeries5.getDescription();
        xYSeries5.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean12 = xYSeries5.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        java.lang.String str16 = xYSeries14.getDescription();
        xYSeries14.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean21 = xYSeries14.equals((java.lang.Object) 2147483647);
        boolean boolean22 = xYSeries5.equals((java.lang.Object) xYSeries14);
        xYSeries14.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        java.lang.String str30 = xYSeries28.getDescription();
        xYSeries28.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean35 = xYSeries28.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.clear();
        java.lang.String str39 = xYSeries37.getDescription();
        xYSeries37.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean44 = xYSeries37.equals((java.lang.Object) 2147483647);
        boolean boolean45 = xYSeries28.equals((java.lang.Object) xYSeries37);
        xYSeries28.fireSeriesChanged();
        xYSeries28.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        xYSeries51.setMaximumItemCount((int) (byte) 10);
        xYSeries51.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list59 = xYSeries51.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        xYSeries51.removeChangeListener(seriesChangeListener60);
        xYSeries51.add((double) 100.0f, 100.0d);
        boolean boolean65 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries51.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem67, false);
        xYSeries14.add(xYDataItem67);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem67);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, true, false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        int int12 = xYSeries1.getItemCount();
        xYSeries1.setDescription("");
        boolean boolean15 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list34 = xYSeries26.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries26.removeChangeListener(seriesChangeListener35);
        xYSeries26.add((double) 100.0f, 100.0d);
        boolean boolean40 = xYSeries26.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries26.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem42);
        xYSeries12.add(xYDataItem42, true);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true, true);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        int int50 = xYSeries49.getItemCount();
        xYSeries49.add((double) 0, (java.lang.Number) 4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        int int18 = xYSeries16.getMaximumItemCount();
        int int19 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        java.lang.Comparable comparable23 = xYSeries21.getKey();
        xYSeries21.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean31 = xYSeries21.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries21.remove(0);
        xYSeries16.add(xYDataItem33, false);
        xYSeries12.add(xYDataItem33, true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = xYSeries40.getY(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0d + "'", comparable23, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 10);
        xYSeries1.setMaximumItemCount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries19 = xYSeries1.createCopy((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        int int4 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.Comparable comparable10 = xYSeries8.getKey();
        xYSeries8.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean18 = xYSeries8.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries8.remove(0);
        xYSeries1.add(xYDataItem20, false);
        java.lang.Comparable comparable23 = xYSeries1.getKey();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0d + "'", comparable23, 10.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        xYSeries9.setMaximumItemCount((int) (byte) 10);
        xYSeries9.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries9.clear();
        java.util.List list18 = xYSeries9.data;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries9.removeChangeListener(seriesChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries26.addChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        xYSeries30.setMaximumItemCount((int) (byte) 10);
        xYSeries30.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list38 = xYSeries30.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries30.removeChangeListener(seriesChangeListener39);
        xYSeries30.add((double) 100.0f, 100.0d);
        boolean boolean44 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries30.remove((int) (byte) 1);
        xYSeries26.add(xYDataItem46);
        xYSeries9.add(xYDataItem46);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem46);
        int int50 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        boolean boolean20 = xYSeries10.getNotify();
        xYSeries10.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        int int25 = xYSeries10.indexOf((java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener26);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.update((java.lang.Number) 0, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        java.lang.Object obj17 = xYSeries16.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries16.getX((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        boolean boolean20 = xYSeries10.getNotify();
        xYSeries10.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries10.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        java.lang.Comparable comparable29 = xYSeries27.getKey();
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries27.createCopy((int) '4', (int) (short) 10);
        boolean boolean33 = xYSeries32.getNotify();
        xYSeries32.add((double) (-1L), (double) 0, true);
        boolean boolean38 = xYSeries32.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries32.createCopy(3, 0);
        double[][] doubleArray42 = xYSeries41.toArray();
        int int44 = xYSeries41.indexOf((java.lang.Number) (-3));
        java.util.List list45 = xYSeries41.data;
        xYSeries10.data = list45;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 10.0d + "'", comparable29, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove(0);
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        xYSeries17.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener21);
        boolean boolean23 = xYSeries17.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries17.createCopy((int) 'a', (int) '4');
        java.util.List list27 = xYSeries17.data;
        boolean boolean28 = xYSeries17.getAutoSort();
        java.util.List list29 = xYSeries17.getItems();
        xYSeries3.data = list29;
        int int31 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = xYSeries3.getX(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((double) 1L, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex((int) (byte) -1, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.clear();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries21.addChangeListener(seriesChangeListener27);
        boolean boolean29 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.setNotify(true);
        java.lang.Number number35 = null;
        xYSeries31.add((double) (-1), number35);
        java.util.List list37 = xYSeries31.getItems();
        xYSeries21.data = list37;
        xYSeries10.data = list37;
        xYSeries10.setDescription("hi!");
        int int42 = xYSeries10.getItemCount();
        java.util.List list43 = xYSeries10.data;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        xYSeries1.add((double) (-2), (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.setNotify(true);
        java.lang.Number number28 = null;
        xYSeries24.add((double) (-1), number28);
        java.util.List list30 = xYSeries24.getItems();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        java.lang.Comparable comparable34 = xYSeries32.getKey();
        xYSeries32.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean38 = xYSeries24.equals((java.lang.Object) 100);
        double[][] doubleArray39 = xYSeries24.toArray();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable44 = xYSeries43.getKey();
        int int46 = xYSeries43.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries43.removeChangeListener(seriesChangeListener47);
        boolean boolean49 = xYSeries24.equals((java.lang.Object) seriesChangeListener47);
        boolean boolean50 = xYSeries1.equals((java.lang.Object) boolean49);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) -1, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 10.0d + "'", comparable34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + (short) 10 + "'", comparable44, (short) 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        int int13 = xYSeries11.getMaximumItemCount();
        xYSeries11.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int18 = xYSeries11.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.setNotify(true);
        java.lang.Number number24 = null;
        xYSeries20.add((double) (-1), number24);
        java.util.List list26 = xYSeries20.getItems();
        boolean boolean27 = xYSeries20.getAllowDuplicateXValues();
        boolean boolean28 = xYSeries20.getNotify();
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries20.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable38 = xYSeries37.getKey();
        xYSeries37.add((double) (short) 0, (double) ' ');
        int int43 = xYSeries37.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries45.clear();
        xYSeries45.setMaximumItemCount((int) (byte) 10);
        xYSeries45.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list53 = xYSeries45.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        xYSeries45.removeChangeListener(seriesChangeListener54);
        xYSeries45.add((double) 100.0f, 100.0d);
        boolean boolean59 = xYSeries45.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries45.remove((int) (byte) 1);
        xYSeries37.add(xYDataItem61);
        xYSeries31.add(xYDataItem61, true);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true, true);
        xYSeries11.add(xYDataItem61, true);
        xYSeries9.setKey((java.lang.Comparable) xYDataItem61);
        xYSeries3.add(xYDataItem61);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries3.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1), false);
        java.lang.Comparable comparable19 = xYSeries1.getKey();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries1.getItems();
        java.lang.Number number13 = null;
        xYSeries1.add(0.0d, number13, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean15 = xYSeries1.equals((java.lang.Object) 100);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable21 = xYSeries20.getKey();
        int int23 = xYSeries20.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries20.removeChangeListener(seriesChangeListener24);
        boolean boolean26 = xYSeries1.equals((java.lang.Object) seriesChangeListener24);
        xYSeries1.add((double) 1.0f, (double) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries1.removeChangeListener(seriesChangeListener30);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        boolean boolean14 = xYSeries7.getAllowDuplicateXValues();
        boolean boolean15 = xYSeries7.getNotify();
        int int17 = xYSeries7.indexOf((java.lang.Number) (short) 1);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) (short) 1);
        java.lang.Comparable comparable19 = xYSeries1.getKey();
        xYSeries1.add((double) (short) 1, (double) 0.0f, true);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable28 = xYSeries27.getKey();
        xYSeries27.add((double) (short) 0, (double) ' ');
        int int33 = xYSeries27.indexOf((java.lang.Number) 1.0d);
        xYSeries27.add((double) (-2), (-1.0d));
        xYSeries27.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean41 = xYSeries27.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries43.clear();
        int int45 = xYSeries43.getMaximumItemCount();
        xYSeries43.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries51 = xYSeries43.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable56 = xYSeries55.getKey();
        xYSeries55.add((double) (short) 0, (double) ' ');
        int int61 = xYSeries55.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries63.clear();
        xYSeries63.setMaximumItemCount((int) (byte) 10);
        xYSeries63.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list71 = xYSeries63.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener72 = null;
        xYSeries63.removeChangeListener(seriesChangeListener72);
        xYSeries63.add((double) 100.0f, 100.0d);
        boolean boolean77 = xYSeries63.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries63.remove((int) (byte) 1);
        xYSeries55.add(xYDataItem79);
        xYSeries51.add(xYDataItem79, false);
        xYSeries27.add(xYDataItem79);
        boolean boolean84 = xYSeries1.equals((java.lang.Object) xYDataItem79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 10 + "'", comparable28, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries51);
        org.junit.Assert.assertEquals("'" + comparable56 + "' != '" + (short) 10 + "'", comparable56, (short) 10);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-2) + "'", int61 == (-2));
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYDataItem79);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true, false);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries84.update((java.lang.Number) (-3), (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (byte) 0, false);
        java.lang.Object obj10 = xYSeries1.clone();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        double[][] doubleArray13 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries16.update((java.lang.Number) 2, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener24);
        xYSeries18.setNotify(false);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) xYSeries18);
        int int29 = xYSeries18.getMaximumItemCount();
        int int31 = xYSeries18.indexOf((java.lang.Number) (byte) 1);
        xYSeries18.setDescription("");
        xYSeries18.add((double) '#', (double) 100.0f);
        xYSeries18.setNotify(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        boolean boolean20 = xYSeries10.getNotify();
        xYSeries10.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries10.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0);
        java.util.List list27 = xYSeries26.data;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        java.lang.String str19 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries23.add(xYDataItem47);
        xYSeries14.add(xYDataItem47);
        xYSeries1.add(xYDataItem47);
        xYSeries1.update((java.lang.Number) (-1L), (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.setNotify(true);
        java.lang.Number number15 = null;
        xYSeries11.add((double) (-1), number15);
        java.util.List list17 = xYSeries11.getItems();
        boolean boolean18 = xYSeries11.getAllowDuplicateXValues();
        boolean boolean19 = xYSeries11.getNotify();
        int int21 = xYSeries11.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable22 = xYSeries11.getKey();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries24.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable34 = xYSeries33.getKey();
        xYSeries33.add((double) (short) 0, (double) ' ');
        int int39 = xYSeries33.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries41.clear();
        xYSeries41.setMaximumItemCount((int) (byte) 10);
        xYSeries41.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list49 = xYSeries41.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        xYSeries41.removeChangeListener(seriesChangeListener50);
        xYSeries41.add((double) 100.0f, 100.0d);
        boolean boolean55 = xYSeries41.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries41.remove((int) (byte) 1);
        xYSeries33.add(xYDataItem57);
        xYSeries24.add(xYDataItem57);
        xYSeries11.add(xYDataItem57);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem57);
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries65.clear();
        xYSeries65.setMaximumItemCount((int) (byte) 10);
        xYSeries65.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list73 = xYSeries65.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener74 = null;
        xYSeries65.removeChangeListener(seriesChangeListener74);
        xYSeries65.add((double) 100.0f, 100.0d);
        boolean boolean79 = xYSeries65.getAutoSort();
        java.lang.Object obj80 = xYSeries65.clone();
        boolean boolean81 = xYSeries1.equals((java.lang.Object) xYSeries65);
        boolean boolean82 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0d + "'", comparable22, 10.0d);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (short) 10 + "'", comparable34, (short) 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        int int81 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener82 = null;
        xYSeries1.addChangeListener(seriesChangeListener82);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        boolean boolean61 = xYSeries3.getAutoSort();
        int int62 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries3.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10L);
        org.jfree.data.xy.XYSeries xYSeries68 = xYSeries3.createCopy((int) (byte) 1, 2);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(xYSeries68);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        java.lang.Object obj17 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries1.getX(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        xYSeries10.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries10.clear();
        java.util.List list19 = xYSeries10.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries10.removeChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries27.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries54.remove((java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        boolean boolean32 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries23);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries35.setNotify(true);
        java.lang.Number number39 = null;
        xYSeries35.add((double) (-1), number39);
        java.util.List list41 = xYSeries35.getItems();
        boolean boolean42 = xYSeries35.getAllowDuplicateXValues();
        boolean boolean43 = xYSeries35.getNotify();
        int int45 = xYSeries35.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable46 = xYSeries35.getKey();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries48.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries48.removeChangeListener(seriesChangeListener51);
        java.lang.String str53 = xYSeries48.getDescription();
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable58 = xYSeries57.getKey();
        xYSeries57.add((double) (short) 0, (double) ' ');
        int int63 = xYSeries57.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries65.clear();
        xYSeries65.setMaximumItemCount((int) (byte) 10);
        xYSeries65.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list73 = xYSeries65.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener74 = null;
        xYSeries65.removeChangeListener(seriesChangeListener74);
        xYSeries65.add((double) 100.0f, 100.0d);
        boolean boolean79 = xYSeries65.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries65.remove((int) (byte) 1);
        xYSeries57.add(xYDataItem81);
        xYSeries48.add(xYDataItem81);
        xYSeries35.add(xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        java.util.List list87 = xYSeries86.data;
        xYSeries23.data = list87;
        java.beans.PropertyChangeListener propertyChangeListener89 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener89);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2) + "'", int45 == (-2));
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10.0d + "'", comparable46, 10.0d);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (short) 10 + "'", comparable58, (short) 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-2) + "'", int63 == (-2));
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(xYDataItem81);
        org.junit.Assert.assertNotNull(list87);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        java.lang.String str12 = xYSeries6.getDescription();
        double[][] doubleArray13 = xYSeries6.toArray();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        xYSeries10.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries10.clear();
        java.util.List list19 = xYSeries10.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries10.removeChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries27.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        xYSeries1.add(0.0d, (double) (short) 10, true);
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries1.remove(1);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        xYSeries61.addChangeListener(seriesChangeListener62);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        xYSeries1.add((double) (-1.0f), 0.0d);
        xYSeries1.clear();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        int int81 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray82 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries1.remove((java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertNotNull(doubleArray82);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        boolean boolean18 = xYSeries1.isEmpty();
        java.lang.String str19 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 2, (double) '#');
        int int15 = xYSeries1.getItemCount();
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 100.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        java.lang.Object obj10 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.addChangeListener(seriesChangeListener11);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(xYSeries15);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries1.addChangeListener(seriesChangeListener32);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries1.removeChangeListener(seriesChangeListener34);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries1.removeChangeListener(seriesChangeListener36);
        java.util.List list38 = xYSeries1.data;
        int int40 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) -1, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-3) + "'", int40 == (-3));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable21 = xYSeries20.getKey();
        xYSeries20.add((double) (short) 0, (double) ' ');
        int int26 = xYSeries20.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        xYSeries28.setMaximumItemCount((int) (byte) 10);
        xYSeries28.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list36 = xYSeries28.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries28.removeChangeListener(seriesChangeListener37);
        xYSeries28.add((double) 100.0f, 100.0d);
        boolean boolean42 = xYSeries28.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries28.remove((int) (byte) 1);
        xYSeries20.add(xYDataItem44);
        xYSeries1.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries49.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add((double) 100.0f, (double) 1L, false);
        xYSeries13.fireSeriesChanged();
        xYSeries13.clear();
        boolean boolean22 = xYSeries1.equals((java.lang.Object) xYSeries13);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries13.update((java.lang.Number) 0L, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.lang.Object obj13 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener22);
        boolean boolean24 = xYSeries18.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries18.createCopy((int) 'a', (int) '4');
        java.util.List list28 = xYSeries18.data;
        xYSeries1.data = list28;
        boolean boolean30 = xYSeries1.getNotify();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean16 = xYSeries9.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries20.addChangeListener(seriesChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        xYSeries24.setMaximumItemCount((int) (byte) 10);
        xYSeries24.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list32 = xYSeries24.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries24.removeChangeListener(seriesChangeListener33);
        xYSeries24.add((double) 100.0f, 100.0d);
        boolean boolean38 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries24.remove((int) (byte) 1);
        xYSeries20.add(xYDataItem40);
        xYSeries9.add(xYDataItem40, false);
        xYSeries1.add(xYDataItem40, false);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        xYSeries46.setKey((java.lang.Comparable) 100);
        xYSeries46.delete((int) (short) 100, 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries46.addChangeListener(seriesChangeListener52);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 10, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        java.lang.Object obj13 = xYSeries1.clone();
        java.lang.Number number15 = xYSeries1.getX(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-2) + "'", number15, (-2));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries3.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        boolean boolean32 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean33 = xYSeries1.equals((java.lang.Object) xYSeries23);
        xYSeries1.setKey((java.lang.Comparable) 1L);
        boolean boolean36 = xYSeries1.getNotify();
        java.lang.Comparable comparable37 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 1L + "'", comparable37, 1L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.lang.Object obj4 = xYSeries1.clone();
        java.util.List list5 = xYSeries1.data;
        java.util.List list6 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(4, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) 10, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries15.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, false, true);
        xYSeries3.fireSeriesChanged();
        java.lang.Number number6 = null;
        xYSeries3.add((java.lang.Number) 2147483647, number6, false);
        java.util.List list9 = xYSeries3.getItems();
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        xYSeries1.fireSeriesChanged();
        boolean boolean22 = xYSeries1.getNotify();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.setKey((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener27);
        xYSeries1.clear();
        java.lang.Comparable comparable30 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = xYSeries1.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertNull(xYDataItem33);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false);
        xYSeries2.add((double) (byte) 100, (java.lang.Number) (short) 1);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.add(number6, (java.lang.Number) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries10.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        int int23 = xYSeries10.getItemCount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 2147483647);
        boolean boolean9 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list19 = xYSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries11.removeChangeListener(seriesChangeListener20);
        xYSeries11.add((double) 100.0f, 100.0d);
        boolean boolean25 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries11.remove((int) (byte) 1);
        xYSeries3.add(xYDataItem27);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, false);
        boolean boolean31 = xYSeries30.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = xYSeries1.equals((java.lang.Object) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        int int18 = xYSeries16.getMaximumItemCount();
        xYSeries16.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries16.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable29 = xYSeries28.getKey();
        xYSeries28.add((double) (short) 0, (double) ' ');
        int int34 = xYSeries28.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.clear();
        xYSeries36.setMaximumItemCount((int) (byte) 10);
        xYSeries36.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list44 = xYSeries36.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries36.removeChangeListener(seriesChangeListener45);
        xYSeries36.add((double) 100.0f, 100.0d);
        boolean boolean50 = xYSeries36.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries36.remove((int) (byte) 1);
        xYSeries28.add(xYDataItem52);
        xYSeries24.add(xYDataItem52, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, false);
        xYSeries1.add(xYDataItem52);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        xYSeries1.removeChangeListener(seriesChangeListener59);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        xYSeries1.removeChangeListener(seriesChangeListener61);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (short) 10 + "'", comparable29, (short) 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        int int14 = xYSeries1.getItemCount();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        java.lang.String str7 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '4', (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d, true);
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries1.createCopy((int) 'a', (int) (short) 1);
        java.util.List list19 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        java.lang.String str15 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f));
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 4);
        double[][] doubleArray22 = xYSeries1.toArray();
        boolean boolean23 = xYSeries1.isEmpty();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), true, true);
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.getDataItem((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries12.addChangeListener(seriesChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        xYSeries16.setMaximumItemCount((int) (byte) 10);
        xYSeries16.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list24 = xYSeries16.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries16.removeChangeListener(seriesChangeListener25);
        xYSeries16.add((double) 100.0f, 100.0d);
        boolean boolean30 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries16.remove((int) (byte) 1);
        xYSeries12.add(xYDataItem32);
        xYSeries1.add(xYDataItem32, false);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener36);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 0, number5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.setNotify(true);
        java.lang.Number number17 = null;
        xYSeries13.add((double) (-1), number17);
        java.util.List list19 = xYSeries13.getItems();
        boolean boolean20 = xYSeries13.getAllowDuplicateXValues();
        boolean boolean21 = xYSeries13.getNotify();
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries13.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable31 = xYSeries30.getKey();
        xYSeries30.add((double) (short) 0, (double) ' ');
        int int36 = xYSeries30.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        xYSeries38.setMaximumItemCount((int) (byte) 10);
        xYSeries38.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list46 = xYSeries38.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries38.removeChangeListener(seriesChangeListener47);
        xYSeries38.add((double) 100.0f, 100.0d);
        boolean boolean52 = xYSeries38.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries38.remove((int) (byte) 1);
        xYSeries30.add(xYDataItem54);
        xYSeries24.add(xYDataItem54, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries3.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (short) 10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) 10 + "'", comparable31, (short) 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNull(xYDataItem61);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries7.addChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list19 = xYSeries11.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries11.removeChangeListener(seriesChangeListener20);
        xYSeries11.add((double) 100.0f, 100.0d);
        boolean boolean25 = xYSeries11.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries11.remove((int) (byte) 1);
        xYSeries7.add(xYDataItem27);
        xYSeries3.add(xYDataItem27);
        xYSeries3.add((double) (byte) 1, (java.lang.Number) 1.0d, false);
        xYSeries3.clear();
        java.lang.String str35 = xYSeries3.getDescription();
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        boolean boolean15 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries19.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) xYSeries19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries3.remove(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        xYSeries3.addChangeListener(seriesChangeListener63);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries66.clear();
        xYSeries66.setMaximumItemCount((int) (byte) 10);
        xYSeries66.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list74 = xYSeries66.getItems();
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries76.clear();
        java.lang.String str78 = xYSeries76.getDescription();
        java.util.List list79 = xYSeries76.getItems();
        xYSeries66.data = list79;
        xYSeries66.fireSeriesChanged();
        boolean boolean82 = xYSeries3.equals((java.lang.Object) xYSeries66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number84 = xYSeries66.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false, true);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Class<?> wildcardClass5 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable10 = xYSeries9.getKey();
        double[][] doubleArray11 = xYSeries9.toArray();
        xYSeries9.add(1.0d, (double) 0, true);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        xYSeries17.setMaximumItemCount((int) (byte) 10);
        xYSeries17.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries17.clear();
        java.util.List list26 = xYSeries17.data;
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries17.removeChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries34.addChangeListener(seriesChangeListener35);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        xYSeries38.setMaximumItemCount((int) (byte) 10);
        xYSeries38.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list46 = xYSeries38.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries38.removeChangeListener(seriesChangeListener47);
        xYSeries38.add((double) 100.0f, 100.0d);
        boolean boolean52 = xYSeries38.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries38.remove((int) (byte) 1);
        xYSeries34.add(xYDataItem54);
        xYSeries17.add(xYDataItem54);
        boolean boolean57 = xYSeries9.equals((java.lang.Object) xYDataItem54);
        xYSeries1.add(xYDataItem54, true);
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries1.addOrUpdate((double) 1, (double) (-1L));
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries1.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(xYDataItem62);
        org.junit.Assert.assertNull(xYDataItem65);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.add((double) 10.0f, (java.lang.Number) 1L, false);
        int int12 = xYSeries1.indexOf((java.lang.Number) 100L);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries10.add((java.lang.Number) 100, (java.lang.Number) 1.0d, true);
        int int16 = xYSeries10.indexOf((java.lang.Number) (short) 100);
        xYSeries10.add((java.lang.Number) 2, (java.lang.Number) (short) 0, true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries15 = xYSeries3.createCopy((-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        xYSeries1.add((double) 2, (double) (byte) -1, false);
        java.lang.Class<?> wildcardClass12 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate((double) 0L, (double) ' ');
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getNotify();
        xYSeries1.add((double) (short) -1, (double) 100);
        java.lang.Number number18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number18, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount((int) '#');
        xYSeries3.fireSeriesChanged();
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        xYSeries1.add((double) (-5908509288197150436L), (double) (-2), false);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries12.addChangeListener(seriesChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        xYSeries16.setMaximumItemCount((int) (byte) 10);
        xYSeries16.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list24 = xYSeries16.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries16.removeChangeListener(seriesChangeListener25);
        xYSeries16.add((double) 100.0f, 100.0d);
        boolean boolean30 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries16.remove((int) (byte) 1);
        xYSeries12.add(xYDataItem32);
        xYSeries1.add(xYDataItem32, false);
        xYSeries1.add((double) 100.0f, (double) (byte) -1, false);
        java.lang.Number number41 = xYSeries1.getX(2);
        java.lang.Object obj42 = xYSeries1.clone();
        xYSeries1.add((double) (-2), (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        java.lang.Comparable comparable49 = xYSeries47.getKey();
        xYSeries47.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean57 = xYSeries47.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries47.remove(0);
        org.jfree.data.xy.XYSeries xYSeries62 = xYSeries47.createCopy((int) (byte) 0, 0);
        java.lang.Object obj63 = xYSeries62.clone();
        double[][] doubleArray64 = xYSeries62.toArray();
        boolean boolean65 = xYSeries62.getAllowDuplicateXValues();
        java.util.List list66 = xYSeries62.data;
        xYSeries1.data = list66;
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries69.setNotify(true);
        java.lang.Number number73 = null;
        xYSeries69.add((double) (-1), number73);
        java.util.List list75 = xYSeries69.getItems();
        boolean boolean76 = xYSeries69.getAllowDuplicateXValues();
        boolean boolean77 = xYSeries69.getNotify();
        org.jfree.data.xy.XYSeries xYSeries80 = xYSeries69.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        xYSeries80.addPropertyChangeListener(propertyChangeListener81);
        java.util.List list83 = xYSeries80.data;
        java.lang.String str84 = xYSeries80.getDescription();
        java.lang.String str85 = xYSeries80.getDescription();
        java.lang.String str86 = xYSeries80.getDescription();
        boolean boolean87 = xYSeries1.equals((java.lang.Object) xYSeries80);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number89 = xYSeries80.getY(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + number41 + "' != '" + 100.0d + "'", number41, 100.0d);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 10.0d + "'", comparable49, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(xYDataItem59);
        org.junit.Assert.assertNotNull(xYSeries62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(xYSeries80);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        int int18 = xYSeries16.getMaximumItemCount();
        int int19 = xYSeries16.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        java.lang.Comparable comparable23 = xYSeries21.getKey();
        xYSeries21.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean31 = xYSeries21.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries21.remove(0);
        xYSeries16.add(xYDataItem33, false);
        xYSeries12.add(xYDataItem33, true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries40.add((double) 'a', (double) 2147483647, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0d + "'", comparable23, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean15 = xYSeries1.equals((java.lang.Object) 100);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable21 = xYSeries20.getKey();
        int int23 = xYSeries20.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries20.removeChangeListener(seriesChangeListener24);
        boolean boolean26 = xYSeries1.equals((java.lang.Object) seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable31 = xYSeries30.getKey();
        xYSeries30.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries30.remove(0);
        boolean boolean38 = xYSeries1.equals((java.lang.Object) 0);
        boolean boolean39 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) 10 + "'", comparable31, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable11 = xYSeries10.getKey();
        xYSeries10.add((double) (short) 0, (double) ' ');
        int int16 = xYSeries10.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list26 = xYSeries18.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries18.removeChangeListener(seriesChangeListener27);
        xYSeries18.add((double) 100.0f, 100.0d);
        boolean boolean32 = xYSeries18.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries18.remove((int) (byte) 1);
        xYSeries10.add(xYDataItem34);
        xYSeries1.add(xYDataItem34);
        xYSeries1.setDescription("");
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries1.createCopy((int) ' ', (int) (short) 0);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj44 = xYSeries1.clone();
        xYSeries1.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray7 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        boolean boolean19 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.addOrUpdate((double) 1.0f, (double) 4);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable20 = xYSeries19.getKey();
        xYSeries19.add((double) (short) 0, (double) ' ');
        int int25 = xYSeries19.indexOf((java.lang.Number) 1.0d);
        xYSeries19.add((double) (-2), (-1.0d));
        xYSeries19.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean33 = xYSeries19.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries35.clear();
        int int37 = xYSeries35.getMaximumItemCount();
        xYSeries35.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries35.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable48 = xYSeries47.getKey();
        xYSeries47.add((double) (short) 0, (double) ' ');
        int int53 = xYSeries47.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries55.clear();
        xYSeries55.setMaximumItemCount((int) (byte) 10);
        xYSeries55.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list63 = xYSeries55.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        xYSeries55.removeChangeListener(seriesChangeListener64);
        xYSeries55.add((double) 100.0f, 100.0d);
        boolean boolean69 = xYSeries55.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries55.remove((int) (byte) 1);
        xYSeries47.add(xYDataItem71);
        xYSeries43.add(xYDataItem71, false);
        xYSeries19.add(xYDataItem71);
        java.lang.String str76 = xYSeries19.getDescription();
        boolean boolean77 = xYSeries19.getAutoSort();
        int int78 = xYSeries19.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries19.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10L);
        xYSeries1.add(xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false, false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertEquals("'" + comparable48 + "' != '" + (short) 10 + "'", comparable48, (short) 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-2) + "'", int53 == (-2));
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(xYDataItem71);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((double) (byte) 0, (double) (byte) 100);
        xYSeries1.add((double) (byte) 0, (java.lang.Number) (-1));
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 'a', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        boolean boolean81 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) (byte) 1, true);
        xYSeries1.add((double) 10.0f, (double) (short) -1);
        double[][] doubleArray89 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(doubleArray89);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        java.util.List list3 = xYSeries2.getItems();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = xYSeries1.equals((java.lang.Object) (-1.0d));
        java.lang.Comparable comparable15 = xYSeries1.getKey();
        xYSeries1.add((double) 100.0f, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        xYSeries1.add((double) 2, (double) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (-2));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        boolean boolean61 = xYSeries3.getAutoSort();
        int int62 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) 10, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        java.lang.String str19 = xYSeries14.getDescription();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries23.add(xYDataItem47);
        xYSeries14.add(xYDataItem47);
        xYSeries1.add(xYDataItem47);
        xYSeries1.add((double) 3, 100.0d);
        xYSeries1.fireSeriesChanged();
        int int55 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries10.addChangeListener(seriesChangeListener20);
        xYSeries10.clear();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries24.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        java.lang.Comparable comparable33 = xYSeries31.getKey();
        xYSeries31.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean41 = xYSeries31.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries31.remove(0);
        xYSeries24.add(xYDataItem43, false);
        xYSeries10.add(xYDataItem43);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.update((java.lang.Number) 4, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 4");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 10.0d + "'", comparable33, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.util.List list11 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add(10.0d, (java.lang.Number) 10.0f, true);
        xYSeries1.add((double) 100L, (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.Object obj16 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean25 = xYSeries18.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        java.lang.String str29 = xYSeries27.getDescription();
        xYSeries27.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean34 = xYSeries27.equals((java.lang.Object) 2147483647);
        boolean boolean35 = xYSeries18.equals((java.lang.Object) xYSeries27);
        java.util.List list36 = xYSeries18.getItems();
        xYSeries1.data = list36;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = xYSeries1.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        xYSeries1.add((double) '#', (double) 10L);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.remove((java.lang.Number) 100.0f);
        boolean boolean21 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        boolean boolean21 = xYSeries1.equals((java.lang.Object) 2147483647);
        java.lang.String str22 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean26 = xYSeries1.isEmpty();
        boolean boolean27 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean28 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        xYSeries1.add((double) 1L, (double) (short) 1);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener8);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean14 = xYSeries1.equals((java.lang.Object) (-1.0d));
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 10.0f);
        java.util.List list18 = xYSeries1.getItems();
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray12 = xYSeries1.toArray();
        boolean boolean13 = xYSeries1.isEmpty();
        java.lang.String str14 = xYSeries1.getDescription();
        java.lang.Object obj15 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 10L, (java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        xYSeries9.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries9.createCopy((int) 'a', 1);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries14.createCopy((int) (short) 10, 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries14.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        int int4 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries6.clear();
        java.lang.Comparable comparable8 = xYSeries6.getKey();
        xYSeries6.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean16 = xYSeries6.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries6.remove(0);
        xYSeries1.add(xYDataItem18, false);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0d + "'", comparable8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("");
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        boolean boolean13 = xYSeries1.isEmpty();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (-2), false);
        java.util.List list18 = xYSeries1.data;
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.addOrUpdate((double) (short) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        xYSeries3.setMaximumItemCount((int) (short) 100);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Comparable comparable8 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0d + "'", comparable8, 10.0d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        xYSeries10.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries10.clear();
        java.util.List list19 = xYSeries10.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries10.removeChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries27.addChangeListener(seriesChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list39 = xYSeries31.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries31.removeChangeListener(seriesChangeListener40);
        xYSeries31.add((double) 100.0f, 100.0d);
        boolean boolean45 = xYSeries31.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries31.remove((int) (byte) 1);
        xYSeries27.add(xYDataItem47);
        xYSeries10.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries1.add(xYDataItem47, true);
        xYSeries1.add(0.0d, (double) (short) 10, true);
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries1.remove(1);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = xYSeries61.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        xYSeries24.setMaximumItemCount((int) (byte) 10);
        xYSeries24.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list32 = xYSeries24.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries24.removeChangeListener(seriesChangeListener33);
        xYSeries24.add((double) 100.0f, 100.0d);
        boolean boolean38 = xYSeries24.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries24.remove((int) (byte) 1);
        xYSeries1.add(xYDataItem40, false);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries1.addOrUpdate((double) 0.0f, (double) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries1.addChangeListener(seriesChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.clear();
        java.lang.Comparable comparable51 = xYSeries49.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries49.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries49.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable62 = xYSeries61.getKey();
        xYSeries61.add((double) (short) 0, (double) ' ');
        xYSeries61.setDescription("");
        double[][] doubleArray68 = xYSeries61.toArray();
        boolean boolean69 = xYSeries49.equals((java.lang.Object) doubleArray68);
        boolean boolean70 = xYSeries49.getNotify();
        boolean boolean71 = xYSeries1.equals((java.lang.Object) boolean70);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries1.addOrUpdate((double) (short) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -4, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNull(xYDataItem45);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + 10.0d + "'", comparable51, 10.0d);
        org.junit.Assert.assertNull(xYDataItem54);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + (short) 10 + "'", comparable62, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray7 = xYSeries1.toArray();
        java.util.List list8 = xYSeries1.getItems();
        double[][] doubleArray9 = xYSeries1.toArray();
        boolean boolean10 = xYSeries1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) 10.0f, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        java.lang.Object obj15 = xYSeries1.clone();
        java.lang.String str16 = xYSeries1.getDescription();
        xYSeries1.add(0.0d, 0.0d, false);
        xYSeries1.add((double) 3, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (-5908509288197150436L), true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) ' ', 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        xYSeries1.add((double) (-2), (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.setNotify(true);
        java.lang.Number number28 = null;
        xYSeries24.add((double) (-1), number28);
        java.util.List list30 = xYSeries24.getItems();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        java.lang.Comparable comparable34 = xYSeries32.getKey();
        xYSeries32.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean38 = xYSeries24.equals((java.lang.Object) 100);
        double[][] doubleArray39 = xYSeries24.toArray();
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable44 = xYSeries43.getKey();
        int int46 = xYSeries43.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries43.removeChangeListener(seriesChangeListener47);
        boolean boolean49 = xYSeries24.equals((java.lang.Object) seriesChangeListener47);
        boolean boolean50 = xYSeries1.equals((java.lang.Object) boolean49);
        java.util.List list51 = xYSeries1.data;
        boolean boolean52 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 10.0d + "'", comparable34, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + (short) 10 + "'", comparable44, (short) 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.isEmpty();
        java.util.List list8 = xYSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true, true);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (-5908509288197150436L), false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable12 = xYSeries11.getKey();
        xYSeries11.add((double) (short) 0, (double) ' ');
        int int17 = xYSeries11.indexOf((java.lang.Number) 1.0d);
        xYSeries11.add((double) (-2), (-1.0d));
        xYSeries11.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean25 = xYSeries11.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.clear();
        int int29 = xYSeries27.getMaximumItemCount();
        xYSeries27.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries27.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable40 = xYSeries39.getKey();
        xYSeries39.add((double) (short) 0, (double) ' ');
        int int45 = xYSeries39.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        xYSeries47.setMaximumItemCount((int) (byte) 10);
        xYSeries47.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list55 = xYSeries47.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries47.removeChangeListener(seriesChangeListener56);
        xYSeries47.add((double) 100.0f, 100.0d);
        boolean boolean61 = xYSeries47.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries47.remove((int) (byte) 1);
        xYSeries39.add(xYDataItem63);
        xYSeries35.add(xYDataItem63, false);
        xYSeries11.add(xYDataItem63);
        java.lang.String str68 = xYSeries11.getDescription();
        boolean boolean69 = xYSeries11.getAutoSort();
        int int70 = xYSeries11.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries11.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10L);
        xYSeries3.add(xYDataItem73, true);
        boolean boolean76 = xYSeries3.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (short) 10 + "'", comparable40, (short) 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2) + "'", int45 == (-2));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) 1L, (java.lang.Number) 10.0f);
        boolean boolean16 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        boolean boolean8 = xYSeries3.isEmpty();
        boolean boolean9 = xYSeries3.getNotify();
        boolean boolean10 = xYSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries19.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries27.add(xYDataItem55, false);
        xYSeries3.add(xYDataItem55);
        xYSeries3.clear();
        java.lang.Class<?> wildcardClass61 = xYSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        boolean boolean20 = xYSeries10.getNotify();
        xYSeries10.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        boolean boolean24 = xYSeries10.getAllowDuplicateXValues();
        boolean boolean25 = xYSeries10.getNotify();
        xYSeries10.add((double) (byte) 100, (java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries10.remove((java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.util.List list12 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries14.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable32 = xYSeries31.getKey();
        xYSeries31.add((double) (short) 0, (double) ' ');
        int int37 = xYSeries31.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        xYSeries39.setMaximumItemCount((int) (byte) 10);
        xYSeries39.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list47 = xYSeries39.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries39.removeChangeListener(seriesChangeListener48);
        xYSeries39.add((double) 100.0f, 100.0d);
        boolean boolean53 = xYSeries39.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries39.remove((int) (byte) 1);
        xYSeries31.add(xYDataItem55);
        xYSeries25.add(xYDataItem55, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem55);
        java.lang.String str60 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) 100);
        xYSeries3.setMaximumItemCount((int) (byte) 10);
        java.util.List list66 = xYSeries3.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries3.removeChangeListener(seriesChangeListener67);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries3.setNotify(false);
        xYSeries3.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) (-2), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 4, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = xYDataItem12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false, true);
        int int4 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries3.getX((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.Comparable comparable11 = xYSeries9.getKey();
        xYSeries9.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean15 = xYSeries1.equals((java.lang.Object) 100);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable21 = xYSeries20.getKey();
        int int23 = xYSeries20.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries20.removeChangeListener(seriesChangeListener24);
        boolean boolean26 = xYSeries1.equals((java.lang.Object) seriesChangeListener24);
        xYSeries1.add((double) 1.0f, (double) (byte) 0);
        java.lang.Number number31 = null;
        xYSeries1.add((double) 0L, number31);
        int int33 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries15.setNotify(true);
        java.lang.Number number19 = null;
        xYSeries15.add((double) (-1), number19);
        java.util.List list21 = xYSeries15.getItems();
        boolean boolean22 = xYSeries15.getAllowDuplicateXValues();
        boolean boolean23 = xYSeries15.getNotify();
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries15.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable33 = xYSeries32.getKey();
        xYSeries32.add((double) (short) 0, (double) ' ');
        int int38 = xYSeries32.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries40.clear();
        xYSeries40.setMaximumItemCount((int) (byte) 10);
        xYSeries40.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list48 = xYSeries40.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries40.removeChangeListener(seriesChangeListener49);
        xYSeries40.add((double) 100.0f, 100.0d);
        boolean boolean54 = xYSeries40.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries40.remove((int) (byte) 1);
        xYSeries32.add(xYDataItem56);
        xYSeries26.add(xYDataItem56, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, true);
        xYSeries62.add((double) (short) 1, (double) 0L, true);
        xYSeries62.add(0.0d, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries62.update((java.lang.Number) 10.0f, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (short) 10 + "'", comparable33, (short) 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        boolean boolean19 = xYSeries10.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries10.addChangeListener(seriesChangeListener20);
        xYSeries10.clear();
        xYSeries10.add((java.lang.Number) 4, (java.lang.Number) (byte) 0);
        boolean boolean26 = xYSeries10.getNotify();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add(1.0d, (java.lang.Number) 100L);
        xYSeries1.add((double) (-1), (double) 2, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener24);
        xYSeries18.setNotify(false);
        boolean boolean28 = xYSeries1.equals((java.lang.Object) xYSeries18);
        int int29 = xYSeries18.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener37);
        java.util.List list39 = xYSeries33.getItems();
        xYSeries18.data = list39;
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries18.createCopy(100, 10);
        int int45 = xYSeries18.indexOf((java.lang.Number) (short) -1);
        java.util.List list46 = xYSeries18.data;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        xYSeries13.add((double) (short) 0, (double) ' ');
        xYSeries13.setDescription("");
        double[][] doubleArray20 = xYSeries13.toArray();
        boolean boolean21 = xYSeries1.equals((java.lang.Object) doubleArray20);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        xYSeries23.setMaximumItemCount((int) (byte) 10);
        xYSeries23.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries23.clear();
        xYSeries23.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries35.clear();
        java.lang.String str37 = xYSeries35.getDescription();
        xYSeries35.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean42 = xYSeries35.equals((java.lang.Object) 2147483647);
        boolean boolean43 = xYSeries23.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries45.setNotify(true);
        java.lang.Number number49 = null;
        xYSeries45.add((double) (-1), number49);
        java.util.List list51 = xYSeries45.getItems();
        boolean boolean52 = xYSeries45.getAllowDuplicateXValues();
        boolean boolean53 = xYSeries45.getNotify();
        boolean boolean54 = xYSeries45.getAllowDuplicateXValues();
        boolean boolean55 = xYSeries23.equals((java.lang.Object) xYSeries45);
        xYSeries23.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries62.clear();
        java.lang.Comparable comparable64 = xYSeries62.getKey();
        xYSeries62.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray68 = xYSeries62.toArray();
        java.util.List list69 = xYSeries62.getItems();
        xYSeries60.data = list69;
        xYSeries23.data = list69;
        xYSeries1.data = list69;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add((double) 0L, (double) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + 10.0d + "'", comparable64, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries3.addChangeListener(seriesChangeListener10);
        java.lang.Object obj12 = xYSeries3.clone();
        boolean boolean13 = xYSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.add((double) 0, (double) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) (byte) 10, 4);
        xYSeries3.add((java.lang.Number) (short) 100, (java.lang.Number) 10.0d);
        xYSeries3.setDescription("");
        java.lang.Object obj15 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647);
        xYSeries1.setMaximumItemCount(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (byte) 1);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable23 = xYSeries22.getKey();
        xYSeries22.add((double) (short) 0, (double) ' ');
        int int28 = xYSeries22.indexOf((java.lang.Number) 1.0d);
        xYSeries22.add((double) (-2), (-1.0d));
        xYSeries22.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean36 = xYSeries22.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        int int40 = xYSeries38.getMaximumItemCount();
        xYSeries38.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries38.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable51 = xYSeries50.getKey();
        xYSeries50.add((double) (short) 0, (double) ' ');
        int int56 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries58.clear();
        xYSeries58.setMaximumItemCount((int) (byte) 10);
        xYSeries58.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list66 = xYSeries58.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries58.removeChangeListener(seriesChangeListener67);
        xYSeries58.add((double) 100.0f, 100.0d);
        boolean boolean72 = xYSeries58.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries58.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem74);
        xYSeries46.add(xYDataItem74, false);
        xYSeries22.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem74);
        boolean boolean81 = xYSeries1.getAutoSort();
        java.lang.Comparable comparable82 = xYSeries1.getKey();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (short) 10 + "'", comparable23, (short) 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(comparable82);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(10, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, false);
        java.lang.Class<?> wildcardClass3 = xYSeries2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.setDescription("");
        java.lang.String str6 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries12.addChangeListener(seriesChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        xYSeries16.setMaximumItemCount((int) (byte) 10);
        xYSeries16.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list24 = xYSeries16.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries16.removeChangeListener(seriesChangeListener25);
        xYSeries16.add((double) 100.0f, 100.0d);
        boolean boolean30 = xYSeries16.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries16.remove((int) (byte) 1);
        xYSeries12.add(xYDataItem32);
        xYSeries1.add(xYDataItem32, false);
        xYSeries1.add((double) 100.0f, (double) (byte) -1, false);
        java.lang.Number number41 = xYSeries1.getX(2);
        java.lang.Object obj42 = xYSeries1.clone();
        xYSeries1.add((double) (-2), (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        java.lang.Comparable comparable49 = xYSeries47.getKey();
        xYSeries47.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean57 = xYSeries47.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries47.remove(0);
        org.jfree.data.xy.XYSeries xYSeries62 = xYSeries47.createCopy((int) (byte) 0, 0);
        java.lang.Object obj63 = xYSeries62.clone();
        double[][] doubleArray64 = xYSeries62.toArray();
        boolean boolean65 = xYSeries62.getAllowDuplicateXValues();
        java.util.List list66 = xYSeries62.data;
        xYSeries1.data = list66;
        int int68 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + number41 + "' != '" + 100.0d + "'", number41, 100.0d);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 10.0d + "'", comparable49, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(xYDataItem59);
        org.junit.Assert.assertNotNull(xYSeries62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.setNotify(true);
        boolean boolean13 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        boolean boolean14 = xYSeries7.getAllowDuplicateXValues();
        boolean boolean15 = xYSeries7.getNotify();
        int int17 = xYSeries7.indexOf((java.lang.Number) (short) 1);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) (short) 1);
        xYSeries1.setKey((java.lang.Comparable) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries1.addChangeListener(seriesChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove((java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray7 = xYSeries1.toArray();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries10.clear();
        java.lang.String str12 = xYSeries10.getDescription();
        xYSeries10.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean17 = xYSeries10.equals((java.lang.Object) 2147483647);
        boolean boolean18 = xYSeries1.equals((java.lang.Object) xYSeries10);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries10.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (-2));
        int int22 = xYSeries10.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries24.createCopy((int) '4', (int) '4');
        boolean boolean31 = xYSeries24.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        xYSeries33.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries33.clear();
        java.util.List list42 = xYSeries33.data;
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener43);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries33.removeChangeListener(seriesChangeListener45);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries50.addChangeListener(seriesChangeListener51);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries54.clear();
        xYSeries54.setMaximumItemCount((int) (byte) 10);
        xYSeries54.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list62 = xYSeries54.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        xYSeries54.removeChangeListener(seriesChangeListener63);
        xYSeries54.add((double) 100.0f, 100.0d);
        boolean boolean68 = xYSeries54.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries54.remove((int) (byte) 1);
        xYSeries50.add(xYDataItem70);
        xYSeries33.add(xYDataItem70);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70);
        xYSeries24.add(xYDataItem70, true);
        xYSeries10.setKey((java.lang.Comparable) true);
        xYSeries10.update((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xYDataItem70);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 10);
        xYSeries1.setNotify(true);
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }
}

