package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        xYSeries1.add((double) '#', (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) (byte) 100);
        java.lang.Comparable comparable16 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10.0d + "'", comparable16, 10.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.Comparable comparable15 = xYSeries13.getKey();
        xYSeries13.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean23 = xYSeries13.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries13.remove(0);
        xYSeries1.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries29.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setMaximumItemCount((int) (byte) 1);
        boolean boolean10 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries12.createCopy((int) '4', (int) '4');
        boolean boolean19 = xYSeries12.equals((java.lang.Object) "hi!");
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
        xYSeries12.add(xYDataItem58, true);
        xYSeries12.add((java.lang.Number) 10.0f, (java.lang.Number) 3);
        xYSeries12.updateByIndex((int) (byte) 1, (java.lang.Number) 100);
        xYSeries12.add((double) (-1), (java.lang.Number) (-1), false);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries75.setNotify(true);
        java.lang.Number number79 = null;
        xYSeries75.add((double) (-1), number79);
        java.util.List list81 = xYSeries75.getItems();
        xYSeries75.updateByIndex(0, (java.lang.Number) 100.0d);
        java.util.List list85 = xYSeries75.getItems();
        xYSeries12.data = list85;
        boolean boolean87 = xYSeries3.equals((java.lang.Object) xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        boolean boolean26 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) (-2));
        java.util.List list30 = xYSeries1.data;
        double[][] doubleArray31 = xYSeries1.toArray();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(doubleArray31);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries38.removeChangeListener(seriesChangeListener39);
        xYSeries38.fireSeriesChanged();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries1.createCopy((int) (byte) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries1.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYSeries30);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount(100);
        java.util.List list11 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        xYSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((double) (-2), (double) (-1.0f));
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries35.addChangeListener(seriesChangeListener36);
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
        xYSeries35.add(xYDataItem55);
        xYSeries1.add(xYDataItem55, false);
        xYSeries1.add((double) (byte) 1, (java.lang.Number) (-1), true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        xYSeries1.setNotify(false);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        java.lang.Number number14 = null;
        xYSeries1.add((java.lang.Number) 10L, number14);
        java.lang.String str16 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        java.lang.Object obj10 = xYSeries1.clone();
        boolean boolean11 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1, false, true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
            java.lang.Number number50 = xYSeries46.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, false, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries39.updateByIndex(3, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.setDescription("");
        int int14 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries38.removeChangeListener(seriesChangeListener39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = xYSeries38.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.addOrUpdate(0.0d, (double) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        double[][] doubleArray10 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray7 = xYSeries1.toArray();
        java.util.List list8 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        double[][] doubleArray11 = xYSeries1.toArray();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        int int4 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(2);
        java.lang.Object obj7 = xYSeries1.clone();
        java.lang.String str8 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        int int6 = xYSeries1.getItemCount();
        boolean boolean7 = xYSeries1.getAutoSort();
        java.lang.Class<?> wildcardClass8 = xYSeries1.getClass();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries69 = xYSeries3.createCopy((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        boolean boolean9 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) '#', (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        java.lang.String str11 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(2, (int) (byte) -1);
        xYSeries1.add((double) 4, (java.lang.Number) (-5908509288197150436L), false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        java.lang.Object obj11 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.Comparable comparable15 = xYSeries13.getKey();
        int int17 = xYSeries13.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable22 = xYSeries21.getKey();
        xYSeries21.add((double) (short) 0, (double) ' ');
        int int27 = xYSeries21.indexOf((java.lang.Number) 1.0d);
        xYSeries21.add((double) (-2), (-1.0d));
        xYSeries21.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean35 = xYSeries21.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.clear();
        int int39 = xYSeries37.getMaximumItemCount();
        xYSeries37.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries37.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable50 = xYSeries49.getKey();
        xYSeries49.add((double) (short) 0, (double) ' ');
        int int55 = xYSeries49.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries57.clear();
        xYSeries57.setMaximumItemCount((int) (byte) 10);
        xYSeries57.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list65 = xYSeries57.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener66 = null;
        xYSeries57.removeChangeListener(seriesChangeListener66);
        xYSeries57.add((double) 100.0f, 100.0d);
        boolean boolean71 = xYSeries57.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries57.remove((int) (byte) 1);
        xYSeries49.add(xYDataItem73);
        xYSeries45.add(xYDataItem73, false);
        xYSeries21.add(xYDataItem73);
        java.lang.String str78 = xYSeries21.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries21.remove(0);
        xYSeries13.add(xYDataItem80);
        xYSeries3.add(xYDataItem80);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries83.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 10 + "'", comparable22, (short) 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + (short) 10 + "'", comparable50, (short) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-2) + "'", int55 == (-2));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        java.util.List list63 = xYSeries62.data;
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
        org.junit.Assert.assertNotNull(list63);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.Class<?> wildcardClass42 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + number41 + "' != '" + 100.0d + "'", number41, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        boolean boolean22 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        xYSeries24.setMaximumItemCount((int) (byte) 10);
        xYSeries24.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries24.clear();
        xYSeries24.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.clear();
        java.lang.String str38 = xYSeries36.getDescription();
        xYSeries36.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean43 = xYSeries36.equals((java.lang.Object) 2147483647);
        boolean boolean44 = xYSeries24.equals((java.lang.Object) 2147483647);
        xYSeries24.setKey((java.lang.Comparable) (short) -1);
        boolean boolean47 = xYSeries1.equals((java.lang.Object) xYSeries24);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-5908509288197150436L), false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        java.util.List list3 = xYSeries2.getItems();
        xYSeries2.add((java.lang.Number) 10, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) (byte) 100);
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate(number16, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries15.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries1.addOrUpdate((double) (-5908509288197150436L), (double) 100);
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
        org.junit.Assert.assertNull(xYDataItem53);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 0, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.remove((java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        double[][] doubleArray19 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        boolean boolean18 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries35.addChangeListener(seriesChangeListener36);
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
        xYSeries35.add(xYDataItem55);
        xYSeries1.add(xYDataItem55, false);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true, true);
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries61.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(xYDataItem64);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.Comparable comparable10 = xYSeries8.getKey();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries8.createCopy((int) '4', (int) (short) 10);
        boolean boolean14 = xYSeries13.getNotify();
        xYSeries13.add((double) (-1L), (double) 0, true);
        java.lang.String str19 = xYSeries13.getDescription();
        boolean boolean20 = xYSeries1.equals((java.lang.Object) xYSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        boolean boolean3 = xYSeries1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + 100 + "'", comparable2, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries12.addChangeListener(seriesChangeListener46);
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        boolean boolean58 = xYSeries57.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number60 = xYSeries57.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (-5908509288197150436L), true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener9);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.Number number19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate(number19, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, false);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, false);
        java.lang.Class<?> wildcardClass67 = xYSeries66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        xYSeries1.setMaximumItemCount(3);
        xYSeries1.delete(3, (int) (byte) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + number41 + "' != '" + 100.0d + "'", number41, 100.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        double[][] doubleArray18 = xYSeries3.toArray();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (-1.0f), (double) (-1));
        java.util.List list13 = xYSeries1.getItems();
        boolean boolean14 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.Number number78 = xYSeries10.getY((int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + number78 + "' != '" + (-2) + "'", number78, (-2));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getNotify();
        xYSeries1.delete(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        xYSeries3.setNotify(true);
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-3), number11);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Object obj10 = xYSeries1.clone();
        xYSeries1.add((double) ' ', (double) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        xYSeries1.clear();
        boolean boolean57 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNull(xYDataItem55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.setDescription("");
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        java.lang.Number number14 = xYSeries1.getY(2);
        boolean boolean15 = xYSeries1.isEmpty();
        xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        xYSeries1.update((java.lang.Number) (-1.0f), (java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-3), (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((-2), (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem24);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.setNotify(true);
        java.lang.Number number25 = null;
        xYSeries21.add((double) (-1), number25);
        java.util.List list27 = xYSeries21.getItems();
        boolean boolean28 = xYSeries21.getAllowDuplicateXValues();
        boolean boolean29 = xYSeries21.getNotify();
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries21.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable39 = xYSeries38.getKey();
        xYSeries38.add((double) (short) 0, (double) ' ');
        int int44 = xYSeries38.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries46.clear();
        xYSeries46.setMaximumItemCount((int) (byte) 10);
        xYSeries46.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list54 = xYSeries46.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        xYSeries46.removeChangeListener(seriesChangeListener55);
        xYSeries46.add((double) 100.0f, 100.0d);
        boolean boolean60 = xYSeries46.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries46.remove((int) (byte) 1);
        xYSeries38.add(xYDataItem62);
        xYSeries32.add(xYDataItem62, true);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries67.clear();
        java.lang.Comparable comparable69 = xYSeries67.getKey();
        org.jfree.data.xy.XYSeries xYSeries72 = xYSeries67.createCopy((int) '4', (int) (short) 10);
        boolean boolean73 = xYSeries67.getNotify();
        xYSeries67.clear();
        double[][] doubleArray75 = xYSeries67.toArray();
        boolean boolean76 = xYSeries32.equals((java.lang.Object) xYSeries67);
        boolean boolean77 = xYSeries1.equals((java.lang.Object) xYSeries32);
        xYSeries32.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + (short) 10 + "'", comparable39, (short) 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertEquals("'" + comparable69 + "' != '" + 10.0d + "'", comparable69, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        xYSeries1.setNotify(false);
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        java.lang.String str21 = xYSeries19.getDescription();
        xYSeries19.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean26 = xYSeries19.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        java.lang.String str30 = xYSeries28.getDescription();
        xYSeries28.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean35 = xYSeries28.equals((java.lang.Object) 2147483647);
        boolean boolean36 = xYSeries19.equals((java.lang.Object) xYSeries28);
        xYSeries28.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries42.clear();
        java.lang.String str44 = xYSeries42.getDescription();
        xYSeries42.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean49 = xYSeries42.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        java.lang.String str53 = xYSeries51.getDescription();
        xYSeries51.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean58 = xYSeries51.equals((java.lang.Object) 2147483647);
        boolean boolean59 = xYSeries42.equals((java.lang.Object) xYSeries51);
        xYSeries42.fireSeriesChanged();
        xYSeries42.add((java.lang.Number) 1, (java.lang.Number) (-1));
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
        xYSeries42.add(xYDataItem81, false);
        xYSeries28.add(xYDataItem81);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem81);
        xYSeries1.add(xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, true, false);
        org.jfree.data.xy.XYDataItem xYDataItem92 = xYSeries89.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(xYDataItem81);
        org.junit.Assert.assertNull(xYDataItem92);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2), false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 1, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, true, false);
        int int4 = xYSeries3.getMaximumItemCount();
        xYSeries3.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) 2, (java.lang.Number) (-1));
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove(0);
        int int12 = xYSeries3.indexOf((java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647);
        xYSeries1.add((double) (byte) -1, (java.lang.Number) (short) 0);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((double) 0.0f, (double) 0L);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.addChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        java.util.List list25 = xYSeries24.getItems();
        xYSeries1.data = list25;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries1.addOrUpdate((double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (short) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries10.getY((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.setKey((java.lang.Comparable) 10.0d);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        xYSeries12.add((java.lang.Number) (byte) 10, (java.lang.Number) (short) 1, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        java.lang.Object obj17 = xYSeries16.clone();
        double[][] doubleArray18 = xYSeries16.toArray();
        boolean boolean19 = xYSeries16.isEmpty();
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
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75);
        xYSeries16.add(xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        java.lang.String str13 = xYSeries11.getDescription();
        java.util.List list14 = xYSeries11.getItems();
        xYSeries1.data = list14;
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.Comparable comparable20 = xYSeries18.getKey();
        xYSeries18.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean28 = xYSeries18.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries18.remove(0);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries18.createCopy((int) (byte) 0, 0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries35.clear();
        xYSeries35.setMaximumItemCount((int) (byte) 10);
        xYSeries35.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries35.clear();
        xYSeries35.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        java.lang.String str49 = xYSeries47.getDescription();
        xYSeries47.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean54 = xYSeries47.equals((java.lang.Object) 2147483647);
        boolean boolean55 = xYSeries35.equals((java.lang.Object) 2147483647);
        java.lang.String str56 = xYSeries35.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries35.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean60 = xYSeries35.getAutoSort();
        xYSeries35.setDescription("hi!");
        xYSeries35.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        xYSeries69.addChangeListener(seriesChangeListener70);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries73.clear();
        xYSeries73.setMaximumItemCount((int) (byte) 10);
        xYSeries73.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list81 = xYSeries73.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener82 = null;
        xYSeries73.removeChangeListener(seriesChangeListener82);
        xYSeries73.add((double) 100.0f, 100.0d);
        boolean boolean87 = xYSeries73.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries73.remove((int) (byte) 1);
        xYSeries69.add(xYDataItem89);
        xYSeries35.add(xYDataItem89, false);
        boolean boolean93 = xYSeries33.equals((java.lang.Object) xYDataItem89);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem89, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10.0d + "'", comparable20, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(xYDataItem59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        xYSeries10.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.lang.Class<?> wildcardClass57 = xYSeries56.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable10 = xYSeries9.getKey();
        xYSeries9.add((double) (short) 0, (double) ' ');
        int int15 = xYSeries9.indexOf((java.lang.Number) 1.0d);
        xYSeries9.add((double) (-2), (-1.0d));
        xYSeries9.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean23 = xYSeries9.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        int int27 = xYSeries25.getMaximumItemCount();
        xYSeries25.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries25.createCopy((int) (byte) 100, 2);
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
        xYSeries33.add(xYDataItem61, false);
        xYSeries9.add(xYDataItem61);
        java.lang.String str66 = xYSeries9.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries9.remove(0);
        xYSeries1.add(xYDataItem68);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, true, false);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        xYSeries49.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries49.add((double) 'a', (double) (-1L), true);
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.Class<?> wildcardClass59 = xYDataItem58.getClass();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        xYSeries12.setMaximumItemCount(100);
        xYSeries12.setDescription("hi!");
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.delete((int) (byte) 10, 1);
        xYSeries1.setKey((java.lang.Comparable) (-2));
        xYSeries1.add((double) 1.0f, (java.lang.Number) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        int int22 = xYSeries20.getMaximumItemCount();
        xYSeries20.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int27 = xYSeries20.indexOf((java.lang.Number) (byte) -1);
        java.util.List list28 = xYSeries20.data;
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        xYSeries30.setMaximumItemCount((int) (byte) 10);
        xYSeries30.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries30.clear();
        java.util.List list39 = xYSeries30.data;
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries30.removeChangeListener(seriesChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries47.addChangeListener(seriesChangeListener48);
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
        xYSeries47.add(xYDataItem67);
        xYSeries30.add(xYDataItem67);
        xYSeries20.add(xYDataItem67);
        xYSeries1.add(xYDataItem67);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        xYSeries1.add((-1.0d), 0.0d, false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        boolean boolean15 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
            java.lang.Number number24 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        boolean boolean34 = xYSeries1.getAutoSort();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem94 = xYSeries12.remove((java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        xYSeries1.updateByIndex(0, (java.lang.Number) 100.0d);
        boolean boolean11 = xYSeries1.isEmpty();
        double[][] doubleArray12 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj9 = xYSeries1.clone();
        java.lang.Object obj10 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        xYSeries15.add((java.lang.Number) (short) 10, (java.lang.Number) 100L, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries15.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        int int15 = xYSeries1.indexOf((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAutoSort();
        xYSeries1.setMaximumItemCount((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        boolean boolean18 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (short) 1, (java.lang.Number) 10.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener60);
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries1.addOrUpdate((double) 0L, (double) 4);
        java.lang.Number number65 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number65, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(xYDataItem64);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
            xYSeries1.update((java.lang.Number) 100, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
            xYSeries1.updateByIndex(2, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        double[][] doubleArray25 = xYSeries23.toArray();
        xYSeries23.add(1.0d, (double) 0, true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        xYSeries31.setMaximumItemCount((int) (byte) 10);
        xYSeries31.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries31.clear();
        java.util.List list40 = xYSeries31.data;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener41);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries31.removeChangeListener(seriesChangeListener43);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries48.addChangeListener(seriesChangeListener49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries52.clear();
        xYSeries52.setMaximumItemCount((int) (byte) 10);
        xYSeries52.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list60 = xYSeries52.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        xYSeries52.removeChangeListener(seriesChangeListener61);
        xYSeries52.add((double) 100.0f, 100.0d);
        boolean boolean66 = xYSeries52.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries52.remove((int) (byte) 1);
        xYSeries48.add(xYDataItem68);
        xYSeries31.add(xYDataItem68);
        boolean boolean71 = xYSeries23.equals((java.lang.Object) xYDataItem68);
        xYSeries15.add(xYDataItem68, true);
        xYSeries1.add(xYDataItem68, true);
        java.lang.Comparable comparable76 = xYSeries1.getKey();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + comparable76 + "' != '" + 10.0d + "'", comparable76, 10.0d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        xYSeries62.add((double) 1.0f, 1.0d, false);
        java.lang.String str67 = xYSeries62.getDescription();
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
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 4, (java.lang.Number) (-1L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        xYSeries3.add((double) (short) 1, 100.0d);
        xYSeries3.delete(10, (-1));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries48.addChangeListener(seriesChangeListener49);
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((double) (-5908509288197150436L), (double) 10);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.delete(100, (int) (byte) 10);
        java.util.List list9 = xYSeries1.getItems();
        java.lang.Object obj10 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable16 = xYSeries15.getKey();
        xYSeries15.add((double) (-1L), (double) (-5908509288197150436L));
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries15.remove((java.lang.Number) (short) -1);
        xYSeries1.add(xYDataItem21);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, true, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        java.lang.Object obj17 = xYSeries16.clone();
        double[][] doubleArray18 = xYSeries16.toArray();
        boolean boolean19 = xYSeries16.getAllowDuplicateXValues();
        java.lang.Comparable comparable20 = xYSeries16.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10.0d + "'", comparable20, 10.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        xYSeries1.setNotify(true);
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number7, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (-1.0f), (double) (-1));
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        xYSeries1.add((double) 100.0f, 10.0d, true);
        java.util.List list33 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 100L);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        int int14 = xYSeries1.getItemCount();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries1.addOrUpdate((double) 2, (double) (byte) 10);
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
        org.junit.Assert.assertNull(xYDataItem54);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (byte) 1, true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        java.lang.String str18 = xYSeries16.getDescription();
        xYSeries16.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean23 = xYSeries16.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        java.lang.String str27 = xYSeries25.getDescription();
        xYSeries25.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean32 = xYSeries25.equals((java.lang.Object) 2147483647);
        boolean boolean33 = xYSeries16.equals((java.lang.Object) xYSeries25);
        xYSeries25.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.clear();
        java.lang.String str41 = xYSeries39.getDescription();
        xYSeries39.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean46 = xYSeries39.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries48.clear();
        java.lang.String str50 = xYSeries48.getDescription();
        xYSeries48.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean55 = xYSeries48.equals((java.lang.Object) 2147483647);
        boolean boolean56 = xYSeries39.equals((java.lang.Object) xYSeries48);
        xYSeries39.fireSeriesChanged();
        xYSeries39.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries62.clear();
        xYSeries62.setMaximumItemCount((int) (byte) 10);
        xYSeries62.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list70 = xYSeries62.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener71 = null;
        xYSeries62.removeChangeListener(seriesChangeListener71);
        xYSeries62.add((double) 100.0f, 100.0d);
        boolean boolean76 = xYSeries62.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries62.remove((int) (byte) 1);
        xYSeries39.add(xYDataItem78, false);
        xYSeries25.add(xYDataItem78);
        xYSeries12.setKey((java.lang.Comparable) xYDataItem78);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem78);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(xYDataItem78);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.setNotify(true);
        java.lang.Number number25 = null;
        xYSeries21.add((double) (-1), number25);
        java.util.List list27 = xYSeries21.getItems();
        boolean boolean28 = xYSeries21.getAllowDuplicateXValues();
        boolean boolean29 = xYSeries21.getNotify();
        boolean boolean30 = xYSeries21.getAllowDuplicateXValues();
        xYSeries21.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.Comparable comparable35 = xYSeries33.getKey();
        xYSeries33.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean43 = xYSeries33.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries33.remove(0);
        xYSeries21.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, false);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem45);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0d + "'", comparable35, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        int int16 = xYSeries14.indexOf((java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        java.util.List list21 = xYSeries18.getItems();
        boolean boolean22 = xYSeries18.getNotify();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable27 = xYSeries26.getKey();
        xYSeries26.add((double) (short) 0, (double) ' ');
        int int32 = xYSeries26.indexOf((java.lang.Number) 1.0d);
        xYSeries26.add((double) (-2), (-1.0d));
        xYSeries26.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean40 = xYSeries26.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries42.clear();
        int int44 = xYSeries42.getMaximumItemCount();
        xYSeries42.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries42.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable55 = xYSeries54.getKey();
        xYSeries54.add((double) (short) 0, (double) ' ');
        int int60 = xYSeries54.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries62.clear();
        xYSeries62.setMaximumItemCount((int) (byte) 10);
        xYSeries62.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list70 = xYSeries62.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener71 = null;
        xYSeries62.removeChangeListener(seriesChangeListener71);
        xYSeries62.add((double) 100.0f, 100.0d);
        boolean boolean76 = xYSeries62.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries62.remove((int) (byte) 1);
        xYSeries54.add(xYDataItem78);
        xYSeries50.add(xYDataItem78, false);
        xYSeries26.add(xYDataItem78);
        xYSeries18.add(xYDataItem78);
        xYSeries14.add(xYDataItem78);
        java.util.List list85 = xYSeries14.data;
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 10 + "'", comparable27, (short) 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertEquals("'" + comparable55 + "' != '" + (short) 10 + "'", comparable55, (short) 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-2) + "'", int60 == (-2));
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(xYDataItem78);
        org.junit.Assert.assertNotNull(list85);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3);
        double[][] doubleArray2 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d, true);
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries1.createCopy((int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries18.getX(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem96 = xYSeries12.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        int int16 = xYSeries13.indexOf((java.lang.Number) (-1.0f));
        xYSeries13.setNotify(false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        boolean boolean66 = xYSeries3.getAutoSort();
        double[][] doubleArray67 = xYSeries3.toArray();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        double[][] doubleArray12 = xYSeries1.toArray();
        boolean boolean13 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getY((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        java.lang.String str11 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(2, (int) (byte) -1);
        xYSeries1.setMaximumItemCount(3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(10.0d, (java.lang.Number) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        boolean boolean9 = xYSeries1.getAutoSort();
        boolean boolean10 = xYSeries1.getNotify();
        int int12 = xYSeries1.indexOf((java.lang.Number) 100.0f);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        xYSeries1.add((double) 10, (java.lang.Number) (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        int int27 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((-1.0d), (java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass31 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        xYSeries1.setDescription("hi!");
        java.lang.Object obj9 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        java.lang.String str6 = xYSeries3.getDescription();
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.add((double) 1, 0.0d, false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        xYSeries25.add(0.0d, (java.lang.Number) (-2), true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(xYSeries25);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        xYSeries1.add((double) 1L, (java.lang.Number) 0);
        java.lang.Class<?> wildcardClass78 = xYSeries1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        xYSeries62.delete(4, (int) (byte) 1);
        java.lang.Comparable comparable70 = xYSeries62.getKey();
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
        org.junit.Assert.assertNotNull(comparable70);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55);
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
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, false, true);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.util.List list71 = xYSeries70.getItems();
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
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries2.addChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.setNotify(true);
        java.lang.Number number20 = null;
        xYSeries16.add((double) (-1), number20);
        java.util.List list22 = xYSeries16.getItems();
        boolean boolean23 = xYSeries16.getAllowDuplicateXValues();
        boolean boolean24 = xYSeries16.getNotify();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries16.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        int int31 = xYSeries1.getItemCount();
        java.util.List list32 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        java.lang.Object obj17 = xYSeries16.clone();
        double[][] doubleArray18 = xYSeries16.toArray();
        boolean boolean19 = xYSeries16.getNotify();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        java.lang.Object obj34 = xYSeries1.clone();
        int int36 = xYSeries1.indexOf((java.lang.Number) 10L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        xYSeries3.add(1.0d, (double) 0, true);
        xYSeries3.add((double) (-1.0f), (double) (short) 1, false);
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
        java.util.List list29 = xYSeries26.data;
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.setNotify(true);
        java.lang.Number number37 = null;
        xYSeries33.add((double) (-1), number37);
        java.util.List list39 = xYSeries33.getItems();
        boolean boolean40 = xYSeries33.getAllowDuplicateXValues();
        boolean boolean41 = xYSeries33.getNotify();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries33.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries44.addPropertyChangeListener(propertyChangeListener45);
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
        xYSeries44.add(xYDataItem74, true);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true, true);
        xYSeries26.add(xYDataItem74, false);
        xYSeries3.add(xYDataItem74);
        double[][] doubleArray84 = xYSeries3.toArray();
        xYSeries3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 100L, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        java.lang.String str21 = xYSeries19.getDescription();
        xYSeries19.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean26 = xYSeries19.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        java.lang.String str30 = xYSeries28.getDescription();
        xYSeries28.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean35 = xYSeries28.equals((java.lang.Object) 2147483647);
        boolean boolean36 = xYSeries19.equals((java.lang.Object) xYSeries28);
        xYSeries28.add((java.lang.Number) (byte) -1, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries42.clear();
        java.lang.String str44 = xYSeries42.getDescription();
        xYSeries42.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean49 = xYSeries42.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries51.clear();
        java.lang.String str53 = xYSeries51.getDescription();
        xYSeries51.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean58 = xYSeries51.equals((java.lang.Object) 2147483647);
        boolean boolean59 = xYSeries42.equals((java.lang.Object) xYSeries51);
        xYSeries42.fireSeriesChanged();
        xYSeries42.add((java.lang.Number) 1, (java.lang.Number) (-1));
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
        xYSeries42.add(xYDataItem81, false);
        xYSeries28.add(xYDataItem81);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem81);
        xYSeries1.add(xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) 3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.removeChangeListener(seriesChangeListener25);
        java.util.List list27 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(xYDataItem24);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries37.update((java.lang.Number) 10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        xYSeries12.setMaximumItemCount((int) (byte) 10);
        xYSeries12.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries12.clear();
        java.util.List list21 = xYSeries12.data;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries12.removeChangeListener(seriesChangeListener24);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries29.addChangeListener(seriesChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        xYSeries33.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list41 = xYSeries33.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries33.removeChangeListener(seriesChangeListener42);
        xYSeries33.add((double) 100.0f, 100.0d);
        boolean boolean47 = xYSeries33.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries33.remove((int) (byte) 1);
        xYSeries29.add(xYDataItem49);
        xYSeries12.add(xYDataItem49);
        xYSeries1.add(xYDataItem49);
        java.lang.Class<?> wildcardClass53 = xYDataItem49.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries1.addOrUpdate((double) (short) 100, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(xYDataItem63);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true);
        boolean boolean3 = xYSeries2.getNotify();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        xYSeries53.fireSeriesChanged();
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        java.lang.String str9 = xYSeries3.getDescription();
        java.util.List list10 = xYSeries3.data;
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        java.lang.Comparable comparable14 = xYSeries12.getKey();
        xYSeries12.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean22 = xYSeries12.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries12.remove(0);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries12.createCopy((int) (byte) 0, 0);
        xYSeries12.add((java.lang.Number) 10.0f, (java.lang.Number) (-1L), false);
        boolean boolean32 = xYSeries3.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        java.util.List list15 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.setNotify(true);
        java.lang.Number number21 = null;
        xYSeries17.add((double) (-1), number21);
        java.util.List list23 = xYSeries17.getItems();
        boolean boolean24 = xYSeries17.getAllowDuplicateXValues();
        boolean boolean25 = xYSeries17.getNotify();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries17.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable35 = xYSeries34.getKey();
        xYSeries34.add((double) (short) 0, (double) ' ');
        int int40 = xYSeries34.indexOf((java.lang.Number) 1.0d);
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
        xYSeries34.add(xYDataItem58);
        xYSeries28.add(xYDataItem58, true);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, true);
        xYSeries1.setKey((java.lang.Comparable) true);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 10 + "'", comparable35, (short) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        xYSeries1.add((double) (byte) 0, (java.lang.Number) (short) 10, true);
        int int10 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), true, true);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((double) (short) 0, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = xYSeries3.isEmpty();
        xYSeries3.fireSeriesChanged();
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) -1);
        xYSeries3.add((double) (short) 0, (java.lang.Number) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        boolean boolean43 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        double[][] doubleArray14 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.setNotify(true);
        java.lang.Number number20 = null;
        xYSeries16.add((double) (-1), number20);
        java.util.List list22 = xYSeries16.getItems();
        boolean boolean23 = xYSeries16.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener24);
        java.util.List list26 = xYSeries16.getItems();
        xYSeries1.data = list26;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 4, (double) (-2));
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        boolean boolean16 = xYSeries15.getAutoSort();
        int int17 = xYSeries15.getItemCount();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.util.List list11 = xYSeries1.getItems();
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        xYSeries11.setMaximumItemCount((int) (byte) 10);
        xYSeries11.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries11.clear();
        xYSeries11.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        java.lang.String str25 = xYSeries23.getDescription();
        xYSeries23.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean30 = xYSeries23.equals((java.lang.Object) 2147483647);
        boolean boolean31 = xYSeries11.equals((java.lang.Object) 2147483647);
        java.lang.String str32 = xYSeries11.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries11.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean36 = xYSeries11.getAutoSort();
        xYSeries11.setDescription("hi!");
        xYSeries11.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries45.addChangeListener(seriesChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.clear();
        xYSeries49.setMaximumItemCount((int) (byte) 10);
        xYSeries49.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list57 = xYSeries49.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        xYSeries49.removeChangeListener(seriesChangeListener58);
        xYSeries49.add((double) 100.0f, 100.0d);
        boolean boolean63 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries49.remove((int) (byte) 1);
        xYSeries45.add(xYDataItem65);
        xYSeries11.add(xYDataItem65, false);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65);
        xYSeries1.add(xYDataItem65);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(xYDataItem35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.Number number77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries14.addOrUpdate(number77, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        boolean boolean15 = xYSeries1.getNotify();
        int int17 = xYSeries1.indexOf((java.lang.Number) 2147483647);
        xYSeries1.add(10.0d, (java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number45 = xYSeries1.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        xYSeries10.setMaximumItemCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries10.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        xYSeries1.fireSeriesChanged();
        xYSeries1.setMaximumItemCount(3);
        double[][] doubleArray18 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.updateByIndex(2147483647, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.util.List list11 = xYSeries1.data;
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 0.0f);
        java.lang.Object obj15 = xYSeries1.clone();
        xYSeries1.add((double) (byte) 1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries63 = xYSeries60.createCopy((int) (byte) -1, 2);
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
        org.junit.Assert.assertNotNull(xYSeries63);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        xYSeries3.add((double) (-1.0f), (java.lang.Number) 4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        xYSeries1.setNotify(false);
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        boolean boolean61 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = xYSeries3.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) 100.0f, true);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (short) 100);
        java.lang.Object obj15 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        xYSeries1.update((java.lang.Number) (byte) 100, (java.lang.Number) 10);
        java.lang.Object obj46 = xYSeries1.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        java.lang.Comparable comparable49 = xYSeries47.getKey();
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries47.createCopy((int) '4', (int) (short) 10);
        boolean boolean53 = xYSeries47.getNotify();
        xYSeries47.clear();
        double[][] doubleArray55 = xYSeries47.toArray();
        boolean boolean56 = xYSeries12.equals((java.lang.Object) xYSeries47);
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries47.addOrUpdate((java.lang.Number) 10.0f, (java.lang.Number) (-1.0f));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 10.0d + "'", comparable49, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(xYDataItem59);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        xYSeries12.setKey((java.lang.Comparable) true);
        java.lang.Number number21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries12.add(number21, (java.lang.Number) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 10.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries1.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        boolean boolean8 = xYSeries3.isEmpty();
        boolean boolean9 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        double[][] doubleArray16 = xYSeries15.toArray();
        boolean boolean17 = xYSeries15.isEmpty();
        xYSeries15.add((java.lang.Number) (short) 1, (java.lang.Number) 10L, false);
        xYSeries15.clear();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries1.getY(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        double[][] doubleArray12 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate(0.0d, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        boolean boolean23 = xYSeries10.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries25.createCopy((int) '4', (int) '4');
        xYSeries30.clear();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries30.addOrUpdate((double) 100.0f, (double) (-1L));
        boolean boolean35 = xYSeries10.equals((java.lang.Object) xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.clear();
        int int39 = xYSeries37.getMaximumItemCount();
        int int40 = xYSeries37.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries42.clear();
        java.lang.Comparable comparable44 = xYSeries42.getKey();
        xYSeries42.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean52 = xYSeries42.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries42.remove(0);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54);
        xYSeries37.add(xYDataItem54, true);
        xYSeries10.add(xYDataItem54);
        xYSeries10.add((double) 0L, (java.lang.Number) 3);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 10.0d + "'", comparable44, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove((java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        xYSeries10.add((java.lang.Number) 10L, (java.lang.Number) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries10.removeChangeListener(seriesChangeListener29);
        xYSeries10.setNotify(true);
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 100, (double) 10);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        int int15 = xYSeries1.indexOf((java.lang.Number) (-3));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("");
        java.lang.Number number13 = null;
        xYSeries1.add((java.lang.Number) (byte) 10, number13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getNotify();
        xYSeries1.add((double) (short) -1, (double) 100);
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setKey(comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
            java.lang.Object obj32 = xYSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries10.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) (byte) 100);
        java.lang.Number number29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries10.remove(number29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNull(xYDataItem28);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        java.lang.Comparable comparable14 = xYSeries12.getKey();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries12.createCopy((int) '4', (int) (short) 10);
        boolean boolean18 = xYSeries12.getNotify();
        xYSeries12.clear();
        double[][] doubleArray20 = xYSeries12.toArray();
        boolean boolean21 = xYSeries1.equals((java.lang.Object) xYSeries12);
        java.lang.Comparable comparable22 = xYSeries12.getKey();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0d + "'", comparable22, 10.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.delete(100, (int) (byte) 10);
        double[][] doubleArray9 = xYSeries1.toArray();
        double[][] doubleArray10 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.Number number36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries1.remove(number36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        int int12 = xYSeries1.indexOf((java.lang.Number) 100);
        java.lang.String str13 = xYSeries1.getDescription();
        java.util.List list14 = xYSeries1.data;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.add((double) ' ', (double) '#', false);
        java.lang.Number number16 = null;
        xYSeries1.add(0.0d, number16);
        double[][] doubleArray18 = xYSeries1.toArray();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.Comparable comparable10 = xYSeries8.getKey();
        xYSeries8.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean18 = xYSeries8.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries8.remove(0);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        int int23 = xYSeries21.indexOf((java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        java.lang.String str27 = xYSeries25.getDescription();
        java.util.List list28 = xYSeries25.getItems();
        boolean boolean29 = xYSeries25.getNotify();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable34 = xYSeries33.getKey();
        xYSeries33.add((double) (short) 0, (double) ' ');
        int int39 = xYSeries33.indexOf((java.lang.Number) 1.0d);
        xYSeries33.add((double) (-2), (-1.0d));
        xYSeries33.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean47 = xYSeries33.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.clear();
        int int51 = xYSeries49.getMaximumItemCount();
        xYSeries49.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries49.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable62 = xYSeries61.getKey();
        xYSeries61.add((double) (short) 0, (double) ' ');
        int int67 = xYSeries61.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries69.clear();
        xYSeries69.setMaximumItemCount((int) (byte) 10);
        xYSeries69.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list77 = xYSeries69.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        xYSeries69.removeChangeListener(seriesChangeListener78);
        xYSeries69.add((double) 100.0f, 100.0d);
        boolean boolean83 = xYSeries69.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries69.remove((int) (byte) 1);
        xYSeries61.add(xYDataItem85);
        xYSeries57.add(xYDataItem85, false);
        xYSeries33.add(xYDataItem85);
        xYSeries25.add(xYDataItem85);
        xYSeries21.add(xYDataItem85);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem85);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (short) 10 + "'", comparable34, (short) 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + (short) 10 + "'", comparable62, (short) 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-2) + "'", int67 == (-2));
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        xYSeries1.add((double) '#', (double) 10, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        int int20 = xYSeries10.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener21);
        xYSeries10.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        int int27 = xYSeries25.getMaximumItemCount();
        xYSeries25.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries25.createCopy((int) (byte) 100, 2);
        java.util.List list34 = xYSeries25.getItems();
        xYSeries25.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean38 = xYSeries25.getNotify();
        xYSeries25.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable45 = xYSeries44.getKey();
        xYSeries44.add((double) (short) 0, (double) ' ');
        int int50 = xYSeries44.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries52.clear();
        xYSeries52.setMaximumItemCount((int) (byte) 10);
        xYSeries52.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list60 = xYSeries52.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        xYSeries52.removeChangeListener(seriesChangeListener61);
        xYSeries52.add((double) 100.0f, 100.0d);
        boolean boolean66 = xYSeries52.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries52.remove((int) (byte) 1);
        xYSeries44.add(xYDataItem68);
        xYSeries25.add(xYDataItem68);
        xYSeries10.add(xYDataItem68, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (short) 10 + "'", comparable45, (short) 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        xYSeries53.clear();
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
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0f);
        int int16 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener17);
        java.lang.Object obj19 = xYSeries1.clone();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        double[][] doubleArray2 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries1.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
            xYSeries1.add((double) 4, (double) ' ', false);
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        xYSeries21.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries21.clear();
        xYSeries21.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.String str35 = xYSeries33.getDescription();
        xYSeries33.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean40 = xYSeries33.equals((java.lang.Object) 2147483647);
        boolean boolean41 = xYSeries21.equals((java.lang.Object) 2147483647);
        java.lang.String str42 = xYSeries21.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries21.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean46 = xYSeries21.getAutoSort();
        xYSeries21.setDescription("hi!");
        xYSeries21.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries55.addChangeListener(seriesChangeListener56);
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
        xYSeries55.add(xYDataItem75);
        xYSeries21.add(xYDataItem75, false);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, true, true);
        xYSeries1.add(xYDataItem75, false);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 100L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries4.clear();
        xYSeries4.setMaximumItemCount((int) (byte) 10);
        xYSeries4.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries4.clear();
        xYSeries4.setKey((java.lang.Comparable) (short) 0);
        xYSeries4.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries4.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        xYSeries22.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries22.clear();
        java.util.List list31 = xYSeries22.data;
        xYSeries4.data = list31;
        xYSeries2.data = list31;
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        java.util.List list93 = xYSeries1.data;
        xYSeries1.add((double) (-1L), (double) 0, false);
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
        org.junit.Assert.assertNotNull(list93);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (-1.0f), (double) (-1));
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAllowDuplicateXValues();
        boolean boolean22 = xYSeries14.getNotify();
        boolean boolean23 = xYSeries14.getAllowDuplicateXValues();
        xYSeries14.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        java.lang.Comparable comparable28 = xYSeries26.getKey();
        xYSeries26.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean36 = xYSeries26.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries26.remove(0);
        xYSeries14.add(xYDataItem38);
        xYSeries1.add(xYDataItem38, true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10.0d + "'", comparable28, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 3);
        xYSeries1.updateByIndex((int) (byte) 1, (java.lang.Number) 100);
        xYSeries1.add((double) (-1), (java.lang.Number) (-1), false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries64.setNotify(true);
        java.lang.Number number68 = null;
        xYSeries64.add((double) (-1), number68);
        java.util.List list70 = xYSeries64.getItems();
        xYSeries64.updateByIndex(0, (java.lang.Number) 100.0d);
        java.util.List list74 = xYSeries64.getItems();
        xYSeries1.data = list74;
        boolean boolean76 = xYSeries1.getNotify();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable18 = xYSeries17.getKey();
        xYSeries17.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries17.remove(0);
        boolean boolean25 = xYSeries1.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 10 + "'", comparable18, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        int int17 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        java.lang.Comparable comparable14 = xYSeries12.getKey();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries12.createCopy((int) '4', (int) (short) 10);
        boolean boolean18 = xYSeries12.getNotify();
        xYSeries12.clear();
        double[][] doubleArray20 = xYSeries12.toArray();
        boolean boolean21 = xYSeries1.equals((java.lang.Object) xYSeries12);
        boolean boolean22 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.setNotify(true);
        java.lang.Number number28 = null;
        xYSeries24.add((double) (-1), number28);
        java.util.List list30 = xYSeries24.getItems();
        boolean boolean31 = xYSeries24.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener32);
        xYSeries24.add((double) (short) 1, (java.lang.Number) (-5908509288197150436L), true);
        boolean boolean38 = xYSeries1.equals((java.lang.Object) (-5908509288197150436L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        boolean boolean14 = xYSeries1.getNotify();
        int int15 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 4, (double) (byte) 100);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        xYSeries3.setMaximumItemCount((int) (short) 100);
        boolean boolean14 = xYSeries3.getNotify();
        int int15 = xYSeries3.getMaximumItemCount();
        boolean boolean16 = xYSeries3.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 0, (double) (byte) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries2.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (byte) 100);
        java.lang.String str10 = xYSeries2.getDescription();
        boolean boolean11 = xYSeries2.isEmpty();
        xYSeries2.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries3.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 3);
        xYSeries3.fireSeriesChanged();
        java.lang.Number number54 = null;
        xYSeries3.add((double) (-1.0f), number54);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertNull(xYDataItem51);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        xYSeries2.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries2.getDescription();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable10 = xYSeries9.getKey();
        xYSeries9.add((double) (short) 0, (double) ' ');
        int int15 = xYSeries9.indexOf((java.lang.Number) 1.0d);
        xYSeries9.add((double) (-2), (-1.0d));
        xYSeries9.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean23 = xYSeries9.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        int int27 = xYSeries25.getMaximumItemCount();
        xYSeries25.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries25.createCopy((int) (byte) 100, 2);
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
        xYSeries33.add(xYDataItem61, false);
        xYSeries9.add(xYDataItem61);
        xYSeries1.add(xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true, true);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1, false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) (-1.0d));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.lang.Comparable comparable49 = xYSeries46.getKey();
        java.lang.Number number51 = null;
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries46.addOrUpdate((java.lang.Number) 3, number51);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 100 + "'", comparable49, 100);
        org.junit.Assert.assertNull(xYDataItem52);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        xYSeries1.fireSeriesChanged();
        java.util.List list41 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries1.removeChangeListener(seriesChangeListener42);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
            xYSeries1.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        boolean boolean23 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries3.removeChangeListener(seriesChangeListener26);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.getDataItem((int) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem29);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.clear();
        java.lang.String str10 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.addChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries1.getNotify();
        xYSeries1.add((double) '#', (java.lang.Number) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 100, (double) (byte) 0, true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        xYSeries14.setMaximumItemCount((int) (byte) 10);
        xYSeries14.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries14.clear();
        xYSeries14.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        java.lang.String str28 = xYSeries26.getDescription();
        xYSeries26.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean33 = xYSeries26.equals((java.lang.Object) 2147483647);
        boolean boolean34 = xYSeries14.equals((java.lang.Object) 2147483647);
        java.lang.String str35 = xYSeries14.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries14.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean39 = xYSeries14.getAutoSort();
        xYSeries14.setDescription("hi!");
        xYSeries14.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries14.addChangeListener(seriesChangeListener45);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries14.removeChangeListener(seriesChangeListener47);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries14.removeChangeListener(seriesChangeListener49);
        java.util.List list51 = xYSeries14.data;
        xYSeries3.data = list51;
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        int int57 = xYSeries3.indexOf((java.lang.Number) (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        boolean boolean12 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (short) 100, true);
        java.lang.String str17 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        xYSeries3.clear();
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        xYSeries1.clear();
        int int7 = xYSeries1.getMaximumItemCount();
        xYSeries1.delete((int) '4', (-2));
        double[][] doubleArray11 = xYSeries1.toArray();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        boolean boolean22 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray23 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, false);
        java.util.List list3 = xYSeries2.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.update((java.lang.Number) (-1.0d), (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
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
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, true);
        xYSeries1.add(xYDataItem48, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (-1L));
        boolean boolean9 = xYSeries3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Object obj12 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1, true, true);
        xYSeries20.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries20.remove((java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries1.addOrUpdate((double) 1, (double) (-2));
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries1.addOrUpdate((double) 4, 0.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertNull(xYDataItem41);
        org.junit.Assert.assertNull(xYDataItem44);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem15);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        xYSeries1.updateByIndex(0, (java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.add((double) 0, (double) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) (byte) 10, 4);
        xYSeries3.add((java.lang.Number) (short) 100, (java.lang.Number) 10.0d);
        xYSeries3.add((double) 3, (double) 1.0f, true);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable21 = xYSeries20.getKey();
        xYSeries20.add((double) (short) 0, (double) ' ');
        int int26 = xYSeries20.indexOf((java.lang.Number) 1.0d);
        xYSeries20.add((double) (-2), (-1.0d));
        xYSeries20.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean34 = xYSeries20.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.clear();
        int int38 = xYSeries36.getMaximumItemCount();
        xYSeries36.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries36.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable49 = xYSeries48.getKey();
        xYSeries48.add((double) (short) 0, (double) ' ');
        int int54 = xYSeries48.indexOf((java.lang.Number) 1.0d);
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
        xYSeries48.add(xYDataItem72);
        xYSeries44.add(xYDataItem72, false);
        xYSeries20.add(xYDataItem72);
        java.lang.String str77 = xYSeries20.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries20.remove(0);
        xYSeries3.add(xYDataItem79);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + (short) 10 + "'", comparable49, (short) 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-2) + "'", int54 == (-2));
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(xYDataItem79);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        boolean boolean20 = xYSeries10.isEmpty();
        java.lang.String str21 = xYSeries10.getDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener9);
        xYSeries3.setNotify(false);
        double[][] doubleArray13 = xYSeries3.toArray();
        java.lang.Object obj14 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Object obj10 = xYSeries1.clone();
        xYSeries1.add((double) ' ', (double) 100.0f);
        java.lang.Number number15 = xYSeries1.getY((int) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.addOrUpdate((double) 2147483647, (double) '#');
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        int int10 = xYSeries1.indexOf((java.lang.Number) 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) 100.0f, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        java.lang.String str24 = xYSeries22.getDescription();
        xYSeries22.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean29 = xYSeries22.equals((java.lang.Object) 2147483647);
        boolean boolean30 = xYSeries13.equals((java.lang.Object) xYSeries22);
        xYSeries13.fireSeriesChanged();
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
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, true, true);
        xYSeries13.add(xYDataItem87, false);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87);
        xYSeries1.add(xYDataItem87, true);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries1.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy(1, (int) 'a');
        xYSeries3.setDescription("hi!");
        double[][] doubleArray15 = xYSeries3.toArray();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable10 = xYSeries9.getKey();
        xYSeries9.add((double) (short) 0, (double) ' ');
        int int15 = xYSeries9.indexOf((java.lang.Number) 1.0d);
        xYSeries9.add((double) (-2), (-1.0d));
        xYSeries9.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean23 = xYSeries9.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        int int27 = xYSeries25.getMaximumItemCount();
        xYSeries25.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries25.createCopy((int) (byte) 100, 2);
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
        xYSeries33.add(xYDataItem61, false);
        xYSeries9.add(xYDataItem61);
        java.lang.String str66 = xYSeries9.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries9.remove(0);
        xYSeries1.add(xYDataItem68);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, true, true);
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries74.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertNull(xYDataItem77);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        xYSeries3.removeChangeListener(seriesChangeListener62);
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
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        xYSeries1.add((-1.0d), (java.lang.Number) 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        java.lang.Comparable comparable26 = xYSeries24.getKey();
        int int28 = xYSeries24.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable33 = xYSeries32.getKey();
        xYSeries32.add((double) (short) 0, (double) ' ');
        int int38 = xYSeries32.indexOf((java.lang.Number) 1.0d);
        xYSeries32.add((double) (-2), (-1.0d));
        xYSeries32.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean46 = xYSeries32.getAllowDuplicateXValues();
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
        xYSeries32.add(xYDataItem84);
        java.lang.String str89 = xYSeries32.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem91 = xYSeries32.remove(0);
        xYSeries24.add(xYDataItem91);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem91, false);
        xYSeries1.add(xYDataItem91, true);
        org.jfree.data.xy.XYSeries xYSeries97 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        int int98 = xYSeries97.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 10.0d + "'", comparable26, 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (short) 10 + "'", comparable33, (short) 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries56);
        org.junit.Assert.assertEquals("'" + comparable61 + "' != '" + (short) 10 + "'", comparable61, (short) 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-2) + "'", int66 == (-2));
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(xYDataItem84);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(xYDataItem91);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2147483647 + "'", int98 == 2147483647);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Comparable comparable64 = xYSeries62.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener65 = null;
        xYSeries62.removeChangeListener(seriesChangeListener65);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries62.update((java.lang.Number) (-2), (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -2");
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(comparable64);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        boolean boolean15 = xYSeries1.getNotify();
        int int17 = xYSeries1.indexOf((java.lang.Number) 2147483647);
        java.lang.Comparable comparable18 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (short) 100, (int) (byte) 10);
        xYSeries16.setDescription("hi!");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add(1.0d, (java.lang.Number) 100L);
        int int16 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.add((double) 10.0f, (java.lang.Number) 1L, false);
        boolean boolean11 = xYSeries1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        int int13 = xYSeries1.indexOf((java.lang.Number) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Object obj13 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.Comparable comparable15 = xYSeries13.getKey();
        xYSeries13.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean23 = xYSeries13.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries13.remove(0);
        xYSeries1.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25);
        boolean boolean30 = xYSeries29.isEmpty();
        xYSeries29.add(0.0d, (double) (byte) 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.util.List list9 = xYSeries1.getItems();
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (byte) -1, false);
        xYSeries1.add((double) 35, (java.lang.Number) (short) 0, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0d + "'", comparable6, 10.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        xYSeries1.delete((int) '#', (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        double[][] doubleArray10 = xYSeries1.toArray();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) 100, (double) 10L);
        int int16 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        int int63 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove(0);
        int int12 = xYSeries3.indexOf((java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener49);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNull(xYDataItem45);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getY((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        boolean boolean55 = xYSeries53.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13, false, false);
        xYSeries17.add((double) (-3), (java.lang.Number) 1.0f);
        boolean boolean21 = xYSeries17.getNotify();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a', true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        java.util.List list18 = xYSeries3.data;
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 0, (double) (byte) -1, true);
        xYSeries2.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add((double) 100.0f, (double) 1L, false);
        xYSeries9.setNotify(true);
        xYSeries9.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (-1L), (double) (-5908509288197150436L));
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries23.remove((java.lang.Number) (short) -1);
        xYSeries9.add(xYDataItem29);
        xYSeries2.add(xYDataItem29);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem29);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries18.removeChangeListener(seriesChangeListener21);
        java.lang.String str23 = xYSeries18.getDescription();
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
        xYSeries18.add(xYDataItem51);
        xYSeries18.setDescription("");
        xYSeries18.add((double) (-1), (double) (byte) 10, false);
        java.util.List list60 = xYSeries18.data;
        xYSeries1.data = list60;
        xYSeries1.setMaximumItemCount((int) 'a');
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 10 + "'", comparable28, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        int int7 = xYSeries1.getMaximumItemCount();
        java.lang.Class<?> wildcardClass8 = xYSeries1.getClass();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable10 = xYSeries9.getKey();
        xYSeries9.add((double) (short) 0, (double) ' ');
        int int15 = xYSeries9.indexOf((java.lang.Number) 1.0d);
        xYSeries9.add((double) (-2), (-1.0d));
        xYSeries9.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean23 = xYSeries9.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        int int27 = xYSeries25.getMaximumItemCount();
        xYSeries25.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries25.createCopy((int) (byte) 100, 2);
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
        xYSeries33.add(xYDataItem61, false);
        xYSeries9.add(xYDataItem61);
        java.lang.String str66 = xYSeries9.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries9.remove(0);
        xYSeries1.add(xYDataItem68);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, true, true);
        java.lang.Class<?> wildcardClass75 = xYSeries74.getClass();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        int int21 = xYSeries19.getMaximumItemCount();
        xYSeries19.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int26 = xYSeries19.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.setNotify(true);
        java.lang.Number number32 = null;
        xYSeries28.add((double) (-1), number32);
        java.util.List list34 = xYSeries28.getItems();
        boolean boolean35 = xYSeries28.getAllowDuplicateXValues();
        boolean boolean36 = xYSeries28.getNotify();
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries28.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener40);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable46 = xYSeries45.getKey();
        xYSeries45.add((double) (short) 0, (double) ' ');
        int int51 = xYSeries45.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries53.clear();
        xYSeries53.setMaximumItemCount((int) (byte) 10);
        xYSeries53.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list61 = xYSeries53.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        xYSeries53.removeChangeListener(seriesChangeListener62);
        xYSeries53.add((double) 100.0f, 100.0d);
        boolean boolean67 = xYSeries53.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries53.remove((int) (byte) 1);
        xYSeries45.add(xYDataItem69);
        xYSeries39.add(xYDataItem69, true);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, true, true);
        xYSeries19.add(xYDataItem69, true);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69);
        xYSeries17.add(xYDataItem69, false);
        xYSeries17.delete((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (short) 10 + "'", comparable46, (short) 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2) + "'", int51 == (-2));
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (byte) -1, (-1.0d));
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        xYSeries1.add((double) (short) 0, (java.lang.Number) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 1, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((double) 3, 10.0d);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        java.lang.Object obj15 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 1L);
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 0);
        java.lang.Comparable comparable16 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(xYDataItem15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        xYSeries13.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        int int12 = xYSeries1.indexOf((java.lang.Number) 100);
        java.lang.String str13 = xYSeries1.getDescription();
        java.lang.Number number15 = null;
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((java.lang.Number) (-1), number15);
        java.util.List list17 = xYSeries1.getItems();
        boolean boolean18 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries47.addPropertyChangeListener(propertyChangeListener48);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list18 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries3.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        java.lang.Object obj15 = xYSeries1.clone();
        java.lang.String str16 = xYSeries1.getDescription();
        double[][] doubleArray17 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        java.lang.String str24 = xYSeries22.getDescription();
        xYSeries22.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean29 = xYSeries22.equals((java.lang.Object) 2147483647);
        boolean boolean30 = xYSeries13.equals((java.lang.Object) xYSeries22);
        xYSeries13.fireSeriesChanged();
        xYSeries13.add((java.lang.Number) 1, (java.lang.Number) (-1));
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
        xYSeries13.add(xYDataItem52, false);
        xYSeries1.add(xYDataItem52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add(10.0d, (java.lang.Number) 10.0f, true);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        boolean boolean13 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.add((double) 'a', (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getX(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries46.clear();
        xYSeries46.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries46.addPropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = xYSeries46.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries46.createCopy((int) 'a', (int) '4');
        java.util.List list56 = xYSeries46.data;
        boolean boolean57 = xYSeries46.getAutoSort();
        java.util.List list58 = xYSeries46.getItems();
        xYSeries1.data = list58;
        boolean boolean60 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        boolean boolean4 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.lang.Object obj10 = xYSeries1.clone();
        java.lang.Number number12 = xYSeries1.getY(0);
        xYSeries1.add((double) (byte) 10, (java.lang.Number) 1, true);
        boolean boolean17 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 1.0d + "'", number12, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((-3), (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        xYSeries12.add((double) 2, (double) 100L, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        boolean boolean65 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries3.addOrUpdate((double) 0, 0.0d);
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
        org.junit.Assert.assertNull(xYDataItem68);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.util.List list4 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getX((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        xYSeries1.add((double) '#', (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.delete(35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 10, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        boolean boolean23 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries3.removeChangeListener(seriesChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries31.addChangeListener(seriesChangeListener32);
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
        xYSeries31.add(xYDataItem51);
        xYSeries3.add(xYDataItem51);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add((double) 100.0f, (double) 1L, false);
        xYSeries18.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries18.addOrUpdate((double) (-1.0f), (double) (-1));
        java.util.List list30 = xYSeries18.getItems();
        xYSeries12.data = list30;
        boolean boolean32 = xYSeries12.getAutoSort();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        xYSeries1.add((java.lang.Number) 4, (java.lang.Number) (short) 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex((int) (short) -1, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        boolean boolean61 = xYSeries60.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setMaximumItemCount(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) 1L, (java.lang.Number) 10.0f);
        xYSeries1.add((double) (byte) 1, (java.lang.Number) (-2));
        java.lang.Number number20 = xYSeries1.getY(0);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (-1.0f) + "'", number20, (-1.0f));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        xYSeries1.add(10.0d, (java.lang.Number) 10L, false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        xYSeries7.setMaximumItemCount((int) (byte) 10);
        xYSeries7.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries7.clear();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries7.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries7.remove(0);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, false);
        xYSeries1.add(xYDataItem20);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        int int45 = xYSeries1.getItemCount();
        boolean boolean46 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.util.List list6 = xYSeries1.getItems();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) 100.0f, true);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        xYSeries1.add((double) 2, (double) (byte) 1, true);
        java.lang.Class<?> wildcardClass20 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        xYSeries13.fireSeriesChanged();
        java.util.List list17 = xYSeries13.getItems();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        java.lang.Object obj47 = null;
        boolean boolean48 = xYSeries10.equals(obj47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number50 = xYSeries10.getY((-3));
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
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 10.0d + "'", comparable33, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        boolean boolean83 = xYSeries1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (byte) 100);
        xYSeries1.add((double) 0.0f, (double) (short) -1, true);
        java.util.List list13 = xYSeries1.getItems();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        xYSeries1.setDescription("");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener3);
        xYSeries2.add((double) 1.0f, (double) '4');
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10, (java.lang.Number) 100.0d);
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
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) 'a', (java.lang.Number) (-5908509288197150436L), true);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        java.util.List list3 = xYSeries2.data;
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        int int8 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean13 = xYSeries12.getNotify();
        java.lang.String str14 = xYSeries12.getDescription();
        int int15 = xYSeries12.getMaximumItemCount();
        boolean boolean16 = xYSeries1.equals((java.lang.Object) xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries21.addChangeListener(seriesChangeListener27);
        xYSeries21.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries21.addOrUpdate((double) 100, 100.0d);
        java.util.List list33 = xYSeries21.data;
        xYSeries1.data = list33;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        boolean boolean20 = xYSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries10.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        xYSeries3.add((double) 4, (double) (short) 100, false);
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        int int18 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.addChangeListener(seriesChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        java.lang.String str19 = xYSeries17.getDescription();
        xYSeries17.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean24 = xYSeries17.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        java.lang.String str28 = xYSeries26.getDescription();
        xYSeries26.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean33 = xYSeries26.equals((java.lang.Object) 2147483647);
        boolean boolean34 = xYSeries17.equals((java.lang.Object) xYSeries26);
        xYSeries17.fireSeriesChanged();
        xYSeries17.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries17.addOrUpdate((double) (-2), (double) '#');
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries17.getDataItem(0);
        xYSeries1.setKey((java.lang.Comparable) 0);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(xYDataItem40);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, true);
        java.lang.Object obj15 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable10 = xYSeries9.getKey();
        xYSeries9.add((double) (short) 0, (double) ' ');
        int int15 = xYSeries9.indexOf((java.lang.Number) 1.0d);
        xYSeries9.add((double) (-2), (-1.0d));
        xYSeries9.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean23 = xYSeries9.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        int int27 = xYSeries25.getMaximumItemCount();
        xYSeries25.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries25.createCopy((int) (byte) 100, 2);
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
        xYSeries33.add(xYDataItem61, false);
        xYSeries9.add(xYDataItem61);
        xYSeries1.add(xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61);
        boolean boolean71 = xYSeries70.getAutoSort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (short) 10 + "'", comparable38, (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries1.addChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        java.lang.String str20 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 1.0f, (double) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.addChangeListener(seriesChangeListener17);
        java.lang.String str19 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        boolean boolean19 = xYSeries1.getNotify();
        java.lang.Number number20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number20, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("");
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        int int15 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Object obj6 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        boolean boolean61 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries3.addOrUpdate(100.0d, 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener65 = null;
        xYSeries3.removeChangeListener(seriesChangeListener65);
        boolean boolean67 = xYSeries3.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(xYDataItem64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        int int27 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable28 = xYSeries1.getKey();
        java.lang.Class<?> wildcardClass29 = comparable28.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10.0d + "'", comparable28, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, true, true);
        xYSeries3.add((double) (short) 100, (double) '#', false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.lang.Comparable comparable4 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 10.0d + "'", comparable4, 10.0d);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.Comparable comparable15 = xYSeries13.getKey();
        xYSeries13.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean23 = xYSeries13.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries13.remove(0);
        xYSeries1.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 0);
        java.util.List list33 = xYSeries29.data;
        java.util.List list34 = xYSeries29.data;
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener35);
        xYSeries29.add((double) 0, (java.lang.Number) 35, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        int int16 = xYSeries14.indexOf((java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener22);
        boolean boolean24 = xYSeries18.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries18.createCopy((int) 'a', (int) '4');
        boolean boolean28 = xYSeries18.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.addOrUpdate((java.lang.Number) 10L, (java.lang.Number) (short) 10);
        boolean boolean32 = xYSeries14.equals((java.lang.Object) xYSeries18);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries18.addOrUpdate((java.lang.Number) 4, (java.lang.Number) 35);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(xYDataItem35);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        xYSeries80.add((double) 0, (double) (-2), true);
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        boolean boolean12 = xYSeries1.getAutoSort();
        boolean boolean13 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) (-1.0d), false);
        java.lang.Object obj18 = xYSeries1.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        xYSeries18.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries18.getDataItem(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        xYSeries3.updateByIndex(1, (java.lang.Number) 4);
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
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries3.remove((java.lang.Number) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true);
        xYSeries66.add((double) 2, (java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries71.clear();
        java.lang.String str73 = xYSeries71.getDescription();
        java.util.List list74 = xYSeries71.getItems();
        boolean boolean75 = xYSeries71.getNotify();
        xYSeries71.add((java.lang.Number) 10.0d, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable83 = xYSeries82.getKey();
        xYSeries82.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries82.remove(0);
        xYSeries71.add(xYDataItem89, false);
        xYSeries66.setKey((java.lang.Comparable) xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, true);
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
        org.junit.Assert.assertNotNull(xYDataItem64);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + comparable83 + "' != '" + (short) 10 + "'", comparable83, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        xYSeries3.add(1.0d, (double) 0, true);
        xYSeries3.add((double) (-1.0f), (double) (short) 1, false);
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
        java.util.List list29 = xYSeries26.data;
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.setNotify(true);
        java.lang.Number number37 = null;
        xYSeries33.add((double) (-1), number37);
        java.util.List list39 = xYSeries33.getItems();
        boolean boolean40 = xYSeries33.getAllowDuplicateXValues();
        boolean boolean41 = xYSeries33.getNotify();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries33.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries44.addPropertyChangeListener(propertyChangeListener45);
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
        xYSeries44.add(xYDataItem74, true);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true, true);
        xYSeries26.add(xYDataItem74, false);
        xYSeries3.add(xYDataItem74);
        double[][] doubleArray84 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + (short) 10 + "'", comparable51, (short) 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647);
        boolean boolean2 = xYSeries1.isEmpty();
        xYSeries1.add((double) 10L, (java.lang.Number) 1L, true);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.util.List list2 = xYSeries1.data;
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.util.List list4 = xYSeries1.getItems();
        int int6 = xYSeries1.indexOf((java.lang.Number) 1.0d);
        java.util.List list7 = xYSeries1.data;
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.setNotify(true);
        java.lang.Number number21 = null;
        xYSeries17.add((double) (-1), number21);
        java.util.List list23 = xYSeries17.getItems();
        boolean boolean24 = xYSeries17.getAllowDuplicateXValues();
        boolean boolean25 = xYSeries17.getNotify();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries17.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable35 = xYSeries34.getKey();
        xYSeries34.add((double) (short) 0, (double) ' ');
        int int40 = xYSeries34.indexOf((java.lang.Number) 1.0d);
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
        xYSeries34.add(xYDataItem58);
        xYSeries28.add(xYDataItem58, true);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, true);
        java.util.List list65 = xYSeries64.getItems();
        xYSeries1.data = list65;
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener67);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener69);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 10 + "'", comparable35, (short) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add(10.0d, (java.lang.Number) 10.0f, true);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        xYSeries18.setMaximumItemCount(2);
        int int43 = xYSeries18.indexOf((java.lang.Number) 100.0d);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries10.getDataItem(1);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (short) 100);
        int int13 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable10 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 100L, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        boolean boolean16 = xYSeries15.getAllowDuplicateXValues();
        int int17 = xYSeries15.getItemCount();
        java.lang.String str18 = xYSeries15.getDescription();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        xYSeries15.add((java.lang.Number) 2, (java.lang.Number) 10);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = xYSeries18.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean7 = xYSeries6.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries6.addOrUpdate((double) 10.0f, (double) (short) -1);
        xYSeries6.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.updateByIndex((int) (byte) -1, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true, true);
        xYSeries3.add(0.0d, (double) 'a');
        xYSeries3.clear();
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) 100.0f, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        java.lang.String str15 = xYSeries13.getDescription();
        xYSeries13.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean20 = xYSeries13.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        java.lang.String str24 = xYSeries22.getDescription();
        xYSeries22.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean29 = xYSeries22.equals((java.lang.Object) 2147483647);
        boolean boolean30 = xYSeries13.equals((java.lang.Object) xYSeries22);
        xYSeries13.fireSeriesChanged();
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
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, true, true);
        xYSeries13.add(xYDataItem87, false);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87);
        xYSeries1.add(xYDataItem87, true);
        java.lang.Class<?> wildcardClass99 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        xYSeries3.delete((int) 'a', (int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.setNotify(true);
        java.lang.Number number18 = null;
        xYSeries14.add((double) (-1), number18);
        java.util.List list20 = xYSeries14.getItems();
        boolean boolean21 = xYSeries14.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener22);
        double[][] doubleArray24 = xYSeries14.toArray();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.clear();
        xYSeries26.setMaximumItemCount((int) (byte) 10);
        xYSeries26.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries26.clear();
        java.util.List list35 = xYSeries26.data;
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries26.removeChangeListener(seriesChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        xYSeries43.addChangeListener(seriesChangeListener44);
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
        xYSeries43.add(xYDataItem63);
        xYSeries26.add(xYDataItem63);
        xYSeries14.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, true, true);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, false);
        xYSeries3.add(xYDataItem63, false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        boolean boolean15 = xYSeries1.getNotify();
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 3);
        int int19 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        xYSeries1.fireSeriesChanged();
        java.lang.String str16 = xYSeries1.getDescription();
        int int17 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        java.lang.String str11 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(2, (int) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries14.createCopy((int) (byte) 100, (int) ' ');
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        java.lang.Comparable comparable21 = xYSeries19.getKey();
        xYSeries19.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        boolean boolean25 = xYSeries19.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.setNotify(true);
        java.lang.Number number31 = null;
        xYSeries27.add((double) (-1), number31);
        java.util.List list33 = xYSeries27.getItems();
        xYSeries19.data = list33;
        xYSeries17.data = list33;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = xYSeries17.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0d + "'", comparable21, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.setNotify(true);
        java.lang.Number number40 = null;
        xYSeries36.add((double) (-1), number40);
        java.util.List list42 = xYSeries36.getItems();
        boolean boolean43 = xYSeries36.getAllowDuplicateXValues();
        boolean boolean44 = xYSeries36.getNotify();
        int int46 = xYSeries36.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable47 = xYSeries36.getKey();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.removeChangeListener(seriesChangeListener52);
        java.lang.String str54 = xYSeries49.getDescription();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable59 = xYSeries58.getKey();
        xYSeries58.add((double) (short) 0, (double) ' ');
        int int64 = xYSeries58.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries66.clear();
        xYSeries66.setMaximumItemCount((int) (byte) 10);
        xYSeries66.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list74 = xYSeries66.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener75 = null;
        xYSeries66.removeChangeListener(seriesChangeListener75);
        xYSeries66.add((double) 100.0f, 100.0d);
        boolean boolean80 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries66.remove((int) (byte) 1);
        xYSeries58.add(xYDataItem82);
        xYSeries49.add(xYDataItem82);
        xYSeries36.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, false);
        xYSeries1.add(xYDataItem82);
        xYSeries1.add((double) 2147483647, (double) 10);
        xYSeries1.fireSeriesChanged();
        boolean boolean93 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 10.0d + "'", comparable47, 10.0d);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + comparable59 + "' != '" + (short) 10 + "'", comparable59, (short) 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-2) + "'", int64 == (-2));
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(xYDataItem82);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        xYSeries1.update((java.lang.Number) 100.0d, (java.lang.Number) 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(xYSeries42);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        xYSeries13.add((double) (short) 0, (double) ' ');
        int int19 = xYSeries13.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        xYSeries21.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list29 = xYSeries21.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries21.removeChangeListener(seriesChangeListener30);
        xYSeries21.add((double) 100.0f, 100.0d);
        boolean boolean35 = xYSeries21.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries21.remove((int) (byte) 1);
        xYSeries13.add(xYDataItem37);
        xYSeries9.add(xYDataItem37, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, false);
        xYSeries42.add((double) 0.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 10, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.isEmpty();
        xYSeries6.add((java.lang.Number) (-1.0f), (java.lang.Number) (byte) 0);
        java.util.List list11 = xYSeries6.data;
        xYSeries6.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        xYSeries1.add(0.0d, (java.lang.Number) 1.0f, true);
        boolean boolean50 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (short) 100, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        xYSeries1.add((double) 100L, (double) 2, false);
        xYSeries1.add((double) 0, (double) 10.0f);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1);
        double[][] doubleArray14 = xYSeries1.toArray();
        java.lang.Comparable comparable15 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        xYSeries13.add((double) (short) 0, (double) ' ');
        int int19 = xYSeries13.indexOf((java.lang.Number) 1.0d);
        xYSeries13.add((double) (-2), (-1.0d));
        xYSeries13.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean27 = xYSeries13.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries29.clear();
        int int31 = xYSeries29.getMaximumItemCount();
        xYSeries29.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries29.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable42 = xYSeries41.getKey();
        xYSeries41.add((double) (short) 0, (double) ' ');
        int int47 = xYSeries41.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.clear();
        xYSeries49.setMaximumItemCount((int) (byte) 10);
        xYSeries49.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list57 = xYSeries49.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        xYSeries49.removeChangeListener(seriesChangeListener58);
        xYSeries49.add((double) 100.0f, 100.0d);
        boolean boolean63 = xYSeries49.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries49.remove((int) (byte) 1);
        xYSeries41.add(xYDataItem65);
        xYSeries37.add(xYDataItem65, false);
        xYSeries13.add(xYDataItem65);
        xYSeries1.add(xYDataItem65, false);
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (-5908509288197150436L));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (short) 10 + "'", comparable42, (short) 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-2) + "'", int47 == (-2));
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (byte) 100, true);
        boolean boolean17 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean18 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.remove((int) (short) 0);
        int int21 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Number number18 = null;
        xYSeries16.add((double) (byte) 0, number18, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries16.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number46 = xYSeries1.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.setMaximumItemCount(100);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove(0);
        int int12 = xYSeries3.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        java.lang.String str16 = xYSeries14.getDescription();
        java.util.List list17 = xYSeries14.getItems();
        boolean boolean18 = xYSeries14.getNotify();
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
        xYSeries14.add(xYDataItem74);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem74);
        java.util.List list81 = xYSeries3.getItems();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean4 = xYSeries3.getNotify();
        boolean boolean5 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.clear();
        java.lang.Object obj8 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 100, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        double[][] doubleArray40 = xYSeries18.toArray();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj9 = xYSeries1.clone();
        java.lang.String str10 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1L));
        boolean boolean19 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        int int13 = xYSeries1.indexOf((java.lang.Number) 1);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        xYSeries1.fireSeriesChanged();
        java.lang.Class<?> wildcardClass17 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy(4, 10);
        int int17 = xYSeries16.getItemCount();
        xYSeries16.add(0.0d, (java.lang.Number) 1, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries35.clear();
        java.lang.String str37 = xYSeries35.getDescription();
        xYSeries35.add((double) 100.0f, (double) 1L, false);
        xYSeries35.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries35.addOrUpdate((double) (-1.0f), (double) (-1));
        java.util.List list47 = xYSeries35.getItems();
        boolean boolean48 = xYSeries35.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries35.remove((int) (byte) 0);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        xYSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(xYDataItem46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        xYSeries12.setMaximumItemCount((int) (byte) 10);
        xYSeries12.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list20 = xYSeries12.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries12.removeChangeListener(seriesChangeListener21);
        xYSeries12.add((double) 100.0f, 100.0d);
        boolean boolean26 = xYSeries12.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries12.remove((int) (byte) 1);
        xYSeries12.clear();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable34 = xYSeries33.getKey();
        xYSeries33.add((double) (short) 0, (double) ' ');
        int int39 = xYSeries33.indexOf((java.lang.Number) 1.0d);
        xYSeries33.add((double) (-2), (-1.0d));
        xYSeries33.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean47 = xYSeries33.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.clear();
        int int51 = xYSeries49.getMaximumItemCount();
        xYSeries49.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries49.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable62 = xYSeries61.getKey();
        xYSeries61.add((double) (short) 0, (double) ' ');
        int int67 = xYSeries61.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries69.clear();
        xYSeries69.setMaximumItemCount((int) (byte) 10);
        xYSeries69.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list77 = xYSeries69.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        xYSeries69.removeChangeListener(seriesChangeListener78);
        xYSeries69.add((double) 100.0f, 100.0d);
        boolean boolean83 = xYSeries69.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries69.remove((int) (byte) 1);
        xYSeries61.add(xYDataItem85);
        xYSeries57.add(xYDataItem85, false);
        xYSeries33.add(xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85);
        xYSeries12.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true, false);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85);
        xYSeries1.add(xYDataItem85, true);
        java.lang.String str98 = xYSeries1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (short) 10 + "'", comparable34, (short) 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + (short) 10 + "'", comparable62, (short) 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-2) + "'", int67 == (-2));
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.Class<?> wildcardClass48 = doubleArray47.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 0, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries1.removeChangeListener(seriesChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 35, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 35");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, true);
        java.lang.Comparable comparable39 = xYSeries38.getKey();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries(comparable39, false, false);
        int int44 = xYSeries42.indexOf((java.lang.Number) 100.0f);
        xYSeries42.add((double) 2147483647, (java.lang.Number) (-1), true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(comparable39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex(100, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        xYSeries49.clear();
        xYSeries49.fireSeriesChanged();
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        xYSeries3.setMaximumItemCount((int) (byte) 10);
        int int65 = xYSeries3.getItemCount();
        xYSeries3.setMaximumItemCount(3);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener12);
        xYSeries1.delete((int) ' ', 1);
        java.util.List list17 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) (short) 1, (java.lang.Number) (byte) 100, true);
        boolean boolean17 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean18 = xYSeries1.isEmpty();
        int int20 = xYSeries1.indexOf((java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false);
        java.lang.Class<?> wildcardClass3 = xYSeries2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.add((double) 4, (double) 10.0f, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.addChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(35, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.lang.String str36 = xYSeries1.getDescription();
        java.lang.Comparable comparable37 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (short) 0 + "'", comparable37, (short) 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, false, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        xYSeries13.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries13.createCopy((int) (short) -1, (int) (byte) 1);
        java.lang.Number number18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries13.add(number18, (java.lang.Number) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34);
        int int39 = xYSeries37.indexOf((java.lang.Number) 3);
        java.lang.String str40 = xYSeries37.getDescription();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        xYSeries21.setMaximumItemCount((int) (byte) 10);
        xYSeries21.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries21.clear();
        xYSeries21.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.String str35 = xYSeries33.getDescription();
        xYSeries33.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean40 = xYSeries33.equals((java.lang.Object) 2147483647);
        boolean boolean41 = xYSeries21.equals((java.lang.Object) 2147483647);
        java.lang.String str42 = xYSeries21.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries21.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean46 = xYSeries21.getAutoSort();
        xYSeries21.setDescription("hi!");
        xYSeries21.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        xYSeries55.addChangeListener(seriesChangeListener56);
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
        xYSeries55.add(xYDataItem75);
        xYSeries21.add(xYDataItem75, false);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, true, true);
        xYSeries1.add(xYDataItem75, false);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75);
        xYSeries84.setKey((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 10, (double) ' ', true);
        xYSeries2.add((java.lang.Number) 1L, (java.lang.Number) 100L, true);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries1.fireSeriesChanged();
        int int13 = xYSeries1.indexOf((java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) (-1.0d));
        xYSeries1.add((double) 100L, (java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, false, true);
        int int4 = xYSeries3.getMaximumItemCount();
        xYSeries3.setMaximumItemCount(3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray5 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        xYSeries7.setMaximumItemCount((int) (byte) 10);
        xYSeries7.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries7.clear();
        xYSeries7.setKey((java.lang.Comparable) (short) 0);
        xYSeries7.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries7.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        xYSeries7.setMaximumItemCount(3);
        java.lang.Number number27 = null;
        xYSeries7.add((java.lang.Number) 100.0d, number27);
        xYSeries7.add((java.lang.Number) 0.0f, (java.lang.Number) 4, true);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries7.remove((java.lang.Number) (byte) 100);
        xYSeries1.add(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries36.setNotify(true);
        java.lang.Number number40 = null;
        xYSeries36.add((double) (-1), number40);
        java.util.List list42 = xYSeries36.getItems();
        boolean boolean43 = xYSeries36.getAllowDuplicateXValues();
        boolean boolean44 = xYSeries36.getNotify();
        int int46 = xYSeries36.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable47 = xYSeries36.getKey();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries49.removeChangeListener(seriesChangeListener52);
        java.lang.String str54 = xYSeries49.getDescription();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable59 = xYSeries58.getKey();
        xYSeries58.add((double) (short) 0, (double) ' ');
        int int64 = xYSeries58.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries66.clear();
        xYSeries66.setMaximumItemCount((int) (byte) 10);
        xYSeries66.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list74 = xYSeries66.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener75 = null;
        xYSeries66.removeChangeListener(seriesChangeListener75);
        xYSeries66.add((double) 100.0f, 100.0d);
        boolean boolean80 = xYSeries66.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries66.remove((int) (byte) 1);
        xYSeries58.add(xYDataItem82);
        xYSeries49.add(xYDataItem82);
        xYSeries36.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, false);
        xYSeries1.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true, true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 10.0d + "'", comparable47, 10.0d);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + comparable59 + "' != '" + (short) 10 + "'", comparable59, (short) 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-2) + "'", int64 == (-2));
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) 1L, (java.lang.Number) 10.0f);
        xYSeries1.add((double) (byte) 1, (java.lang.Number) (-2));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
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
        xYSeries1.setKey((java.lang.Comparable) xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        xYSeries3.clear();
        xYSeries3.add((-1.0d), (double) 0, false);
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
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        boolean boolean65 = xYSeries3.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener66);
        java.lang.String str68 = xYSeries3.getDescription();
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
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        int int14 = xYSeries1.getItemCount();
        java.util.List list15 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
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
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, false);
        xYSeries17.setKey((java.lang.Comparable) xYDataItem55);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true, false);
        xYSeries1.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + false + "'", comparable3, false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        boolean boolean15 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 0.0d, (java.lang.Number) (byte) 1);
        int int19 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        int int4 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        xYSeries1.add((double) 4, (double) (-1.0f), false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        java.util.List list5 = xYSeries3.data;
        double[][] doubleArray6 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getY((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        boolean boolean20 = xYSeries1.getNotify();
        int int21 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        boolean boolean5 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.setNotify(true);
        java.lang.Number number21 = null;
        xYSeries17.add((double) (-1), number21);
        java.util.List list23 = xYSeries17.getItems();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        java.lang.String str27 = xYSeries25.getDescription();
        xYSeries25.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean32 = xYSeries25.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries36.addChangeListener(seriesChangeListener37);
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
        xYSeries36.add(xYDataItem56);
        xYSeries25.add(xYDataItem56, false);
        xYSeries17.add(xYDataItem56, false);
        xYSeries7.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        boolean boolean64 = xYSeries3.equals((java.lang.Object) xYSeries63);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13);
        xYSeries14.add((double) (short) 10, (double) 1L, false);
        java.util.List list19 = xYSeries14.getItems();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
            java.lang.Number number35 = xYSeries1.getX(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.lang.Object obj47 = null;
        boolean boolean48 = xYSeries1.equals(obj47);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        int int12 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getY((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        java.util.List list15 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.setNotify(true);
        java.lang.Number number21 = null;
        xYSeries17.add((double) (-1), number21);
        java.util.List list23 = xYSeries17.getItems();
        boolean boolean24 = xYSeries17.getAllowDuplicateXValues();
        boolean boolean25 = xYSeries17.getNotify();
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries17.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable35 = xYSeries34.getKey();
        xYSeries34.add((double) (short) 0, (double) ' ');
        int int40 = xYSeries34.indexOf((java.lang.Number) 1.0d);
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
        xYSeries34.add(xYDataItem58);
        xYSeries28.add(xYDataItem58, true);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, true);
        xYSeries1.setKey((java.lang.Comparable) true);
        xYSeries1.add((double) (short) -1, (double) (-1), false);
        xYSeries1.add((double) 0L, 1.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 10 + "'", comparable35, (short) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        java.lang.String str17 = xYSeries1.getDescription();
        xYSeries1.add((double) 2, (java.lang.Number) 10, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        int int14 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true, true);
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.getItems();
        boolean boolean10 = xYSeries1.isEmpty();
        java.lang.String str11 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        int int20 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        boolean boolean10 = xYSeries1.isEmpty();
        xYSeries1.add((double) ' ', (double) '#', false);
        java.lang.Number number16 = null;
        xYSeries1.add(0.0d, number16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.addChangeListener(seriesChangeListener18);
        xYSeries1.add((double) 0L, (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries25 = xYSeries1.createCopy((int) 'a', 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy(1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem83, true);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        java.util.List list94 = xYSeries93.getItems();
        xYSeries90.data = list94;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries90.add((java.lang.Number) 1.0f, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(list94);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.setNotify(true);
        java.lang.Number number20 = null;
        xYSeries16.add((double) (-1), number20);
        java.util.List list22 = xYSeries16.getItems();
        boolean boolean23 = xYSeries16.getAllowDuplicateXValues();
        boolean boolean24 = xYSeries16.getNotify();
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries16.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries16.remove((int) (short) 0);
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        int int31 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        java.lang.Comparable comparable35 = xYSeries33.getKey();
        org.jfree.data.xy.XYSeries xYSeries38 = xYSeries33.createCopy((int) '4', (int) (short) 10);
        boolean boolean39 = xYSeries33.isEmpty();
        java.util.List list40 = xYSeries33.data;
        xYSeries1.data = list40;
        boolean boolean42 = xYSeries1.isEmpty();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0d + "'", comparable35, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Object obj10 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        int int15 = xYSeries1.indexOf((java.lang.Number) 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        xYSeries1.add((double) (short) -1, (java.lang.Number) 10, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        xYSeries19.setMaximumItemCount((int) (byte) 10);
        xYSeries19.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries19.clear();
        java.util.List list28 = xYSeries19.data;
        xYSeries1.data = list28;
        java.lang.String str30 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        java.lang.Object obj23 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, false);
        boolean boolean96 = xYSeries95.getAutoSort();
        xYSeries95.clear();
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 0, (double) (byte) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries2.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (byte) 100);
        java.lang.String str10 = xYSeries2.getDescription();
        int int11 = xYSeries2.getMaximumItemCount();
        xYSeries2.clear();
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean4 = xYSeries3.getNotify();
        boolean boolean5 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries3.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries15 = xYSeries1.createCopy(3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        xYSeries17.add((double) (byte) 0, (java.lang.Number) 10.0d);
        double[][] doubleArray21 = xYSeries17.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries17.removeChangeListener(seriesChangeListener22);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        java.lang.String str13 = xYSeries11.getDescription();
        java.util.List list14 = xYSeries11.getItems();
        xYSeries1.data = list14;
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.addOrUpdate((double) 35, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0, false);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 2, true);
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
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.beans.PropertyChangeListener propertyChangeListener94 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener94);
        xYSeries3.add((java.lang.Number) (-1.0d), (java.lang.Number) (byte) 1);
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        int int16 = xYSeries13.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries13.removeChangeListener(seriesChangeListener17);
        xYSeries13.setNotify(false);
        boolean boolean21 = xYSeries13.getAutoSort();
        xYSeries13.setMaximumItemCount((int) (short) 100);
        boolean boolean24 = xYSeries1.equals((java.lang.Object) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries1.removeChangeListener(seriesChangeListener25);
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        java.lang.Object obj10 = xYSeries1.clone();
        boolean boolean11 = xYSeries1.getNotify();
        int int12 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        java.lang.Number number14 = xYSeries1.getY(2);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy(0, (int) (short) 1);
        boolean boolean18 = xYSeries17.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove(0);
        int int12 = xYSeries3.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        java.lang.String str16 = xYSeries14.getDescription();
        java.util.List list17 = xYSeries14.getItems();
        boolean boolean18 = xYSeries14.getNotify();
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
        xYSeries14.add(xYDataItem74);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem74);
        boolean boolean81 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        xYSeries3.setKey((java.lang.Comparable) false);
        double[][] doubleArray22 = xYSeries3.toArray();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        xYSeries1.update((java.lang.Number) (-1.0f), (java.lang.Number) 10L);
        java.lang.Number number47 = null;
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries1.addOrUpdate((java.lang.Number) 1.0d, number47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = xYDataItem48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNull(xYDataItem48);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.lang.Object obj4 = xYSeries1.clone();
        java.lang.Comparable comparable5 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0d + "'", comparable5, 10.0d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        boolean boolean20 = xYSeries10.isEmpty();
        xYSeries10.add((double) (short) -1, (java.lang.Number) (short) 1, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        xYSeries1.setDescription("");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0d + "'", comparable17, 10.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        java.lang.Object obj19 = xYSeries10.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries10.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean17 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 0L);
        xYSeries1.add((double) (short) 1, (double) '4');
        java.util.List list24 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = xYSeries1.getY((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.clear();
        java.lang.String str13 = xYSeries11.getDescription();
        java.util.List list14 = xYSeries11.getItems();
        xYSeries1.data = list14;
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add((-1.0d), (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 0.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        xYSeries13.clear();
        boolean boolean17 = xYSeries13.getAutoSort();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries1.getY(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.setNotify(true);
        int int9 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries47.clear();
        java.lang.Comparable comparable49 = xYSeries47.getKey();
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries47.createCopy((int) '4', (int) (short) 10);
        boolean boolean53 = xYSeries47.getNotify();
        xYSeries47.clear();
        double[][] doubleArray55 = xYSeries47.toArray();
        boolean boolean56 = xYSeries12.equals((java.lang.Object) xYSeries47);
        xYSeries47.add((double) 4, (double) (short) 0);
        xYSeries47.add((java.lang.Number) 2147483647, (java.lang.Number) 2, true);
        xYSeries47.add((java.lang.Number) 1.0d, (java.lang.Number) (-3));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 10.0d + "'", comparable49, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        int int13 = xYSeries1.indexOf((java.lang.Number) 1);
        xYSeries1.add((double) (short) 1, (double) (short) 10, true);
        java.lang.Number number19 = null;
        xYSeries1.add((java.lang.Number) 1L, number19, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        int int20 = xYSeries10.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries10.addOrUpdate((double) 0L, (double) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem23);
    }
}

