package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) '#', (double) (short) -1);
        xYSeries1.add((double) (short) 100, (java.lang.Number) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries1.createCopy((int) (byte) 1, (-3));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        xYSeries1.delete(100, 10);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries37.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries44.clear();
        java.lang.Comparable comparable46 = xYSeries44.getKey();
        xYSeries44.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean54 = xYSeries44.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries44.remove(0);
        xYSeries37.add(xYDataItem56, false);
        xYSeries1.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries62.clear();
        java.lang.Comparable comparable64 = xYSeries62.getKey();
        xYSeries62.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean72 = xYSeries62.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries62.remove(0);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries60.add(xYDataItem74, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        xYSeries60.removeChangeListener(seriesChangeListener78);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener80);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries60.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10.0d + "'", comparable46, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + 10.0d + "'", comparable64, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries15.createCopy((int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries15.updateByIndex(5, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        java.util.List list19 = xYSeries3.data;
        double[][] doubleArray20 = xYSeries3.toArray();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.Object obj16 = xYSeries1.clone();
        java.lang.String str17 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        int int29 = xYSeries1.getItemCount();
        xYSeries1.add((double) (short) 10, (java.lang.Number) 100.0d);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        int int72 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number74 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52);
        java.lang.String str60 = xYSeries59.getDescription();
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
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) (-5908509288197150436L), (java.lang.Number) 2147483647);
        java.lang.String str12 = xYSeries1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        xYSeries1.updateByIndex(0, (java.lang.Number) 100.0d);
        java.lang.Number number12 = xYSeries1.getY(0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 100.0d + "'", number12, 100.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        java.lang.Number number47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries1.addOrUpdate(number47, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        xYSeries1.add((double) 10, (java.lang.Number) (-5908509288197150436L));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((double) ' ', 0.0d);
        java.util.List list9 = xYSeries3.data;
        int int10 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable15 = xYSeries14.getKey();
        xYSeries14.add((double) (short) 0, (double) ' ');
        int int20 = xYSeries14.indexOf((java.lang.Number) 1.0d);
        xYSeries14.add((double) (-2), (-1.0d));
        xYSeries14.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean28 = xYSeries14.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        int int32 = xYSeries30.getMaximumItemCount();
        xYSeries30.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries38 = xYSeries30.createCopy((int) (byte) 100, 2);
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
        xYSeries38.add(xYDataItem66, false);
        xYSeries14.add(xYDataItem66);
        java.lang.String str71 = xYSeries14.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries14.remove(0);
        xYSeries3.add(xYDataItem73, false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + (short) 10 + "'", comparable43, (short) 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2) + "'", int48 == (-2));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem43);
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
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove((java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem11, true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(xYDataItem11);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false);
        xYSeries2.add((double) 100, (double) 0, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries2.addOrUpdate((double) 35, 1.0d);
        xYSeries2.add((java.lang.Number) 100.0f, (java.lang.Number) (-1));
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        boolean boolean71 = xYSeries70.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = xYSeries1.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
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
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries3.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        xYSeries1.setMaximumItemCount(10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1), (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        xYSeries1.add((java.lang.Number) (short) 0, (java.lang.Number) 4, false);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.addOrUpdate((java.lang.Number) 4.0d, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        java.lang.String str24 = xYSeries22.getDescription();
        xYSeries22.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean29 = xYSeries22.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries31.clear();
        java.lang.String str33 = xYSeries31.getDescription();
        xYSeries31.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean38 = xYSeries31.equals((java.lang.Object) 2147483647);
        boolean boolean39 = xYSeries22.equals((java.lang.Object) xYSeries31);
        java.util.List list40 = xYSeries22.getItems();
        boolean boolean41 = xYSeries1.equals((java.lang.Object) list40);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries1.remove((java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.util.List list83 = xYSeries3.data;
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener85 = null;
        xYSeries3.addChangeListener(seriesChangeListener85);
        xYSeries3.add((double) 3, 4.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number92 = xYSeries3.getX(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.Object obj40 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries1.removeChangeListener(seriesChangeListener41);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries37.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries44.clear();
        java.lang.Comparable comparable46 = xYSeries44.getKey();
        xYSeries44.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean54 = xYSeries44.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries44.remove(0);
        xYSeries37.add(xYDataItem56, false);
        xYSeries1.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries62.clear();
        java.lang.Comparable comparable64 = xYSeries62.getKey();
        xYSeries62.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean72 = xYSeries62.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries62.remove(0);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries60.add(xYDataItem74, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        xYSeries60.removeChangeListener(seriesChangeListener78);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries60.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10.0d + "'", comparable46, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + 10.0d + "'", comparable64, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries52.setNotify(true);
        int int56 = xYSeries52.indexOf((java.lang.Number) 100L);
        boolean boolean57 = xYSeries52.getNotify();
        xYSeries52.fireSeriesChanged();
        java.util.List list59 = xYSeries52.getItems();
        boolean boolean60 = xYSeries1.equals((java.lang.Object) xYSeries52);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable65 = xYSeries64.getKey();
        xYSeries64.add((double) (short) 0, (double) ' ');
        int int70 = xYSeries64.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries72.clear();
        xYSeries72.setMaximumItemCount((int) (byte) 10);
        xYSeries72.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list80 = xYSeries72.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener81 = null;
        xYSeries72.removeChangeListener(seriesChangeListener81);
        xYSeries72.add((double) 100.0f, 100.0d);
        boolean boolean86 = xYSeries72.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries72.remove((int) (byte) 1);
        xYSeries64.add(xYDataItem88);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem88, false);
        xYSeries1.add(xYDataItem88, true);
        java.lang.Number number94 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number94, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + comparable65 + "' != '" + (short) 10 + "'", comparable65, (short) 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-2) + "'", int70 == (-2));
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(xYDataItem88);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        boolean boolean66 = xYSeries3.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        xYSeries3.add((double) 1, (double) (-1.0f), true);
        boolean boolean8 = xYSeries3.getNotify();
        boolean boolean9 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, false, false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        xYSeries1.add((double) 10.0f, (double) 100);
        xYSeries1.clear();
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        boolean boolean13 = xYSeries6.getNotify();
        java.util.List list14 = xYSeries6.data;
        xYSeries6.add((java.lang.Number) 1.0d, (java.lang.Number) (-1.0f));
        double[][] doubleArray18 = xYSeries6.toArray();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        java.lang.String str18 = xYSeries16.getDescription();
        xYSeries16.add((double) 100.0f, (double) 1L, false);
        xYSeries16.setNotify(true);
        boolean boolean26 = xYSeries16.equals((java.lang.Object) 100.0d);
        xYSeries16.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        java.util.List list30 = xYSeries16.data;
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.setNotify(true);
        java.lang.Number number36 = null;
        xYSeries32.add((double) (-1), number36);
        java.util.List list38 = xYSeries32.getItems();
        boolean boolean39 = xYSeries32.getAllowDuplicateXValues();
        boolean boolean40 = xYSeries32.getNotify();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries32.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.addPropertyChangeListener(propertyChangeListener44);
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
        xYSeries43.add(xYDataItem73, true);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, true, true);
        xYSeries16.setKey((java.lang.Comparable) true);
        xYSeries16.clear();
        xYSeries16.add((java.lang.Number) 1.0d, (java.lang.Number) 1L);
        boolean boolean85 = xYSeries1.equals((java.lang.Object) xYSeries16);
        xYSeries1.setMaximumItemCount(10);
        xYSeries1.setMaximumItemCount((int) '#');
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + (short) 10 + "'", comparable50, (short) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-2) + "'", int55 == (-2));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        int int50 = xYSeries48.indexOf((java.lang.Number) 1.0d);
        double[][] doubleArray51 = xYSeries48.toArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(doubleArray51);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        boolean boolean12 = xYSeries1.getAutoSort();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, true);
        xYSeries2.add((double) 3, (java.lang.Number) 1.0d, false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) 100L);
        java.lang.Number number10 = xYSeries3.getX((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable15 = xYSeries14.getKey();
        xYSeries14.add((double) (short) 0, (double) ' ');
        int int20 = xYSeries14.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        xYSeries22.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list30 = xYSeries22.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries22.removeChangeListener(seriesChangeListener31);
        xYSeries22.add((double) 100.0f, 100.0d);
        boolean boolean36 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries22.remove((int) (byte) 1);
        xYSeries14.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, true, true);
        boolean boolean43 = xYSeries3.equals((java.lang.Object) xYSeries42);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61);
        xYSeries72.add((double) 0, (java.lang.Number) (short) 10, false);
        boolean boolean77 = xYSeries72.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        xYSeries49.removeChangeListener(seriesChangeListener50);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries49.update((java.lang.Number) 35, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 35");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        boolean boolean13 = xYSeries6.getNotify();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries15.setNotify(true);
        java.lang.Number number19 = null;
        xYSeries15.add((double) (-1), number19);
        java.util.List list21 = xYSeries15.getItems();
        boolean boolean22 = xYSeries15.getAllowDuplicateXValues();
        boolean boolean23 = xYSeries15.getNotify();
        int int25 = xYSeries15.indexOf((java.lang.Number) (short) 1);
        xYSeries15.fireSeriesChanged();
        xYSeries15.clear();
        double[][] doubleArray28 = xYSeries15.toArray();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.setNotify(true);
        java.lang.Number number34 = null;
        xYSeries30.add((double) (-1), number34);
        java.util.List list36 = xYSeries30.getItems();
        boolean boolean37 = xYSeries30.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener38);
        java.util.List list40 = xYSeries30.getItems();
        xYSeries15.data = list40;
        xYSeries6.data = list40;
        int int43 = xYSeries6.getItemCount();
        boolean boolean44 = xYSeries6.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        java.lang.String str60 = xYSeries1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 10 + "'", comparable10, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries1.createCopy((int) 'a', 10);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        java.lang.Comparable comparable40 = xYSeries38.getKey();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries38.createCopy((int) '4', (int) (short) 10);
        boolean boolean44 = xYSeries38.isEmpty();
        java.util.List list45 = xYSeries38.data;
        xYSeries1.data = list45;
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries1.addOrUpdate((double) (byte) 100, 4.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 100.0f);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 10.0d + "'", comparable40, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(xYDataItem49);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.setNotify(true);
        java.lang.Number number34 = null;
        xYSeries30.add((double) (-1), number34);
        java.util.List list36 = xYSeries30.getItems();
        boolean boolean37 = xYSeries30.getAllowDuplicateXValues();
        boolean boolean38 = xYSeries30.getNotify();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries30.createCopy(2147483647, (int) (short) 10);
        java.lang.Object obj42 = xYSeries30.clone();
        int int43 = xYSeries30.getItemCount();
        boolean boolean44 = xYSeries30.getAllowDuplicateXValues();
        xYSeries30.add((double) 1L, (java.lang.Number) (short) 1, true);
        java.lang.Comparable comparable49 = xYSeries30.getKey();
        boolean boolean50 = xYSeries19.equals((java.lang.Object) xYSeries30);
        boolean boolean51 = xYSeries19.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 10.0d + "'", comparable49, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries1.addChangeListener(seriesChangeListener24);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.add((double) (-3), (java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1.0f));
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.Comparable comparable51 = xYSeries1.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + 10.0d + "'", comparable51, 10.0d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.getDataItem((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        boolean boolean94 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 100.0f, (java.lang.Number) 4.0d, true);
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        xYSeries1.add(0.0d, (double) 1.0f);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10.0d + "'", comparable28, 10.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        xYSeries1.setDescription("hi!");
        boolean boolean7 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (short) 100, 4);
        xYSeries1.setDescription("hi!");
        int int16 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        int int20 = xYSeries18.getMaximumItemCount();
        xYSeries18.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int25 = xYSeries18.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries27.setNotify(true);
        java.lang.Number number31 = null;
        xYSeries27.add((double) (-1), number31);
        java.util.List list33 = xYSeries27.getItems();
        boolean boolean34 = xYSeries27.getAllowDuplicateXValues();
        boolean boolean35 = xYSeries27.getNotify();
        org.jfree.data.xy.XYSeries xYSeries38 = xYSeries27.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries38.addPropertyChangeListener(propertyChangeListener39);
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
        xYSeries38.add(xYDataItem68, true);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, true, true);
        xYSeries18.add(xYDataItem68, true);
        xYSeries16.setKey((java.lang.Comparable) xYDataItem68);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem68);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false, true);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        xYSeries83.add((java.lang.Number) 0, (java.lang.Number) 0, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYSeries38);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (short) 10 + "'", comparable45, (short) 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        double[][] doubleArray16 = xYSeries15.toArray();
        xYSeries15.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        xYSeries23.setNotify(false);
        boolean boolean32 = xYSeries23.getAutoSort();
        boolean boolean33 = xYSeries15.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        boolean boolean17 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem83, false, true);
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
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        int int2 = xYSeries1.getItemCount();
        java.lang.Object obj3 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        xYSeries8.setMaximumItemCount((int) (byte) 10);
        xYSeries8.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries8.clear();
        xYSeries8.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        java.lang.String str22 = xYSeries20.getDescription();
        xYSeries20.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean27 = xYSeries20.equals((java.lang.Object) 2147483647);
        boolean boolean28 = xYSeries8.equals((java.lang.Object) 2147483647);
        xYSeries8.setKey((java.lang.Comparable) (short) -1);
        xYSeries8.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries8.addPropertyChangeListener(propertyChangeListener34);
        xYSeries8.clear();
        java.lang.Comparable comparable37 = xYSeries8.getKey();
        boolean boolean38 = xYSeries1.equals((java.lang.Object) xYSeries8);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries42.clear();
        xYSeries42.setMaximumItemCount((int) (byte) 10);
        xYSeries42.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries42.clear();
        xYSeries42.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries54.clear();
        java.lang.String str56 = xYSeries54.getDescription();
        xYSeries54.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean61 = xYSeries54.equals((java.lang.Object) 2147483647);
        boolean boolean62 = xYSeries42.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries64.setNotify(true);
        java.lang.Number number68 = null;
        xYSeries64.add((double) (-1), number68);
        java.util.List list70 = xYSeries64.getItems();
        boolean boolean71 = xYSeries64.getAllowDuplicateXValues();
        boolean boolean72 = xYSeries64.getNotify();
        boolean boolean73 = xYSeries64.getAllowDuplicateXValues();
        boolean boolean74 = xYSeries42.equals((java.lang.Object) xYSeries64);
        xYSeries42.setKey((java.lang.Comparable) 1L);
        xYSeries42.clear();
        xYSeries42.delete((int) (byte) 1, 0);
        xYSeries42.fireSeriesChanged();
        java.util.List list82 = xYSeries42.getItems();
        xYSeries1.data = list82;
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (short) -1 + "'", comparable37, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean10 = xYSeries1.getAutoSort();
        xYSeries1.fireSeriesChanged();
        java.lang.String str12 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (byte) 0, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.setNotify(true);
        java.lang.Number number17 = null;
        xYSeries13.add((double) (-1), number17);
        java.util.List list19 = xYSeries13.getItems();
        boolean boolean20 = xYSeries13.getAllowDuplicateXValues();
        boolean boolean21 = xYSeries13.getNotify();
        boolean boolean22 = xYSeries13.getAllowDuplicateXValues();
        xYSeries13.fireSeriesChanged();
        java.lang.Object obj24 = xYSeries13.clone();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        int int32 = xYSeries30.getMaximumItemCount();
        xYSeries30.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int37 = xYSeries30.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.setNotify(true);
        java.lang.Number number43 = null;
        xYSeries39.add((double) (-1), number43);
        java.util.List list45 = xYSeries39.getItems();
        boolean boolean46 = xYSeries39.getAllowDuplicateXValues();
        boolean boolean47 = xYSeries39.getNotify();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries39.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries50.addPropertyChangeListener(propertyChangeListener51);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable57 = xYSeries56.getKey();
        xYSeries56.add((double) (short) 0, (double) ' ');
        int int62 = xYSeries56.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries64.clear();
        xYSeries64.setMaximumItemCount((int) (byte) 10);
        xYSeries64.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list72 = xYSeries64.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        xYSeries64.removeChangeListener(seriesChangeListener73);
        xYSeries64.add((double) 100.0f, 100.0d);
        boolean boolean78 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries64.remove((int) (byte) 1);
        xYSeries56.add(xYDataItem80);
        xYSeries50.add(xYDataItem80, true);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, true, true);
        xYSeries30.add(xYDataItem80, true);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem80);
        xYSeries13.setKey((java.lang.Comparable) xYDataItem80);
        xYSeries1.add(xYDataItem80);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (short) 10 + "'", comparable57, (short) 10);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-2) + "'", int62 == (-2));
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries15.createCopy((int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.update((java.lang.Number) 0.0d, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        int int99 = xYSeries1.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 2147483647 + "'", int99 == 2147483647);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        xYSeries47.add((java.lang.Number) 1.0f, (java.lang.Number) 2147483647, false);
        java.util.List list52 = xYSeries47.data;
        xYSeries47.add(4.0d, (java.lang.Number) 1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        java.lang.Number number11 = null;
        xYSeries7.add((double) (-1), number11);
        java.util.List list13 = xYSeries7.getItems();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries15.clear();
        xYSeries15.setMaximumItemCount((int) (byte) 10);
        xYSeries15.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list23 = xYSeries15.getItems();
        xYSeries7.data = list23;
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries28.clear();
        xYSeries28.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries28.addChangeListener(seriesChangeListener34);
        xYSeries28.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries28.addOrUpdate((double) 100, 100.0d);
        java.util.List list40 = xYSeries28.data;
        xYSeries7.data = list40;
        xYSeries1.data = list40;
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries1.remove((java.lang.Number) 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(xYDataItem39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries1.createCopy((int) '4', (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries33.createCopy((int) (byte) 0, (int) ' ');
        double[][] doubleArray37 = xYSeries33.toArray();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertNotNull(doubleArray37);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries49.addOrUpdate((double) (-1.0f), 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNull(xYDataItem52);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        xYSeries2.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        int int7 = xYSeries5.getMaximumItemCount();
        xYSeries5.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries5.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable18 = xYSeries17.getKey();
        xYSeries17.add((double) (short) 0, (double) ' ');
        int int23 = xYSeries17.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        xYSeries25.setMaximumItemCount((int) (byte) 10);
        xYSeries25.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list33 = xYSeries25.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries25.removeChangeListener(seriesChangeListener34);
        xYSeries25.add((double) 100.0f, 100.0d);
        boolean boolean39 = xYSeries25.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries25.remove((int) (byte) 1);
        xYSeries17.add(xYDataItem41);
        xYSeries13.add(xYDataItem41, false);
        xYSeries2.add(xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, true, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 10 + "'", comparable18, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2) + "'", int23 == (-2));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, false, true);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, true);
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
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        java.util.List list15 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) 1.0d, (java.lang.Number) (-5908509288197150436L), true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.util.List list18 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries1.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        xYSeries47.add((-1.0d), (java.lang.Number) (short) 10);
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
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.addPropertyChangeListener(propertyChangeListener31);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries30.delete((-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (byte) 0, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.util.List list9 = xYSeries1.data;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        boolean boolean64 = xYSeries47.getNotify();
        xYSeries47.clear();
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true, true);
        xYSeries3.add(0.0d, (double) 'a');
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) (short) 100);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        xYSeries1.add((double) (-1), (java.lang.Number) 100.0f);
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
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        boolean boolean17 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener18);
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
        java.util.List list35 = xYSeries32.data;
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries32.addPropertyChangeListener(propertyChangeListener36);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries39.setNotify(true);
        java.lang.Number number43 = null;
        xYSeries39.add((double) (-1), number43);
        java.util.List list45 = xYSeries39.getItems();
        boolean boolean46 = xYSeries39.getAllowDuplicateXValues();
        boolean boolean47 = xYSeries39.getNotify();
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries39.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries50.addPropertyChangeListener(propertyChangeListener51);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable57 = xYSeries56.getKey();
        xYSeries56.add((double) (short) 0, (double) ' ');
        int int62 = xYSeries56.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries64.clear();
        xYSeries64.setMaximumItemCount((int) (byte) 10);
        xYSeries64.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list72 = xYSeries64.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        xYSeries64.removeChangeListener(seriesChangeListener73);
        xYSeries64.add((double) 100.0f, 100.0d);
        boolean boolean78 = xYSeries64.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries64.remove((int) (byte) 1);
        xYSeries56.add(xYDataItem80);
        xYSeries50.add(xYDataItem80, true);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, true, true);
        xYSeries32.add(xYDataItem80, false);
        java.util.List list89 = xYSeries32.data;
        xYSeries1.data = list89;
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (short) 10 + "'", comparable57, (short) 10);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-2) + "'", int62 == (-2));
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(xYDataItem80);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        xYSeries16.setMaximumItemCount(2147483647);
        java.lang.Number number24 = xYSeries16.getY((int) (byte) 0);
        int int25 = xYSeries16.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries18.addChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        xYSeries22.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list30 = xYSeries22.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries22.removeChangeListener(seriesChangeListener31);
        xYSeries22.add((double) 100.0f, 100.0d);
        boolean boolean36 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries22.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem38);
        xYSeries1.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38);
        xYSeries41.add((java.lang.Number) 100L, (java.lang.Number) 10, true);
        xYSeries41.add((double) 100, (double) (-1));
        java.lang.Class<?> wildcardClass49 = xYSeries41.getClass();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener27);
        java.lang.Number number30 = xYSeries1.getX(1);
        xYSeries1.fireSeriesChanged();
        boolean boolean32 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + number30 + "' != '" + 10.0d + "'", number30, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.lang.Number number35 = xYSeries1.getX((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries1.addChangeListener(seriesChangeListener36);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertEquals("'" + number35 + "' != '" + (short) 1 + "'", number35, (short) 1);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        xYSeries51.add((double) ' ', (java.lang.Number) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries51.update((java.lang.Number) 1, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 4, (java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = xYDataItem4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        xYSeries2.setDescription("");
        java.lang.String str60 = xYSeries2.getDescription();
        xYSeries2.add(0.0d, (java.lang.Number) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries2.remove((java.lang.Number) 100.0f);
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(xYDataItem65);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        boolean boolean20 = xYSeries10.isEmpty();
        java.lang.Object obj21 = xYSeries10.clone();
        xYSeries10.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries10.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries14.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries82 = xYSeries14.createCopy(100, (int) '#');
        java.util.List list83 = xYSeries82.getItems();
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
        org.junit.Assert.assertNull(xYDataItem79);
        org.junit.Assert.assertNotNull(xYSeries82);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) 5, (double) (-3));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        int int4 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(2);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable14 = xYSeries13.getKey();
        int int16 = xYSeries13.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries13.removeChangeListener(seriesChangeListener17);
        xYSeries13.setNotify(false);
        boolean boolean21 = xYSeries13.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.setNotify(true);
        java.lang.Number number27 = null;
        xYSeries23.add((double) (-1), number27);
        java.util.List list29 = xYSeries23.getItems();
        boolean boolean30 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries23.getNotify();
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries23.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries34.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable41 = xYSeries40.getKey();
        xYSeries40.add((double) (short) 0, (double) ' ');
        int int46 = xYSeries40.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries48.clear();
        xYSeries48.setMaximumItemCount((int) (byte) 10);
        xYSeries48.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list56 = xYSeries48.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        xYSeries48.removeChangeListener(seriesChangeListener57);
        xYSeries48.add((double) 100.0f, 100.0d);
        boolean boolean62 = xYSeries48.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries48.remove((int) (byte) 1);
        xYSeries40.add(xYDataItem64);
        xYSeries34.add(xYDataItem64, true);
        xYSeries13.setKey((java.lang.Comparable) xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem64);
        xYSeries1.add(xYDataItem64);
        double[][] doubleArray72 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(xYSeries34);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + (short) 10 + "'", comparable41, (short) 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-2) + "'", int46 == (-2));
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(xYDataItem64);
        org.junit.Assert.assertNotNull(doubleArray72);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (short) 100, (int) (byte) 10);
        xYSeries1.add((double) (short) 0, (double) 0, true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 100, false);
        xYSeries1.add((double) 1, (java.lang.Number) 0L, true);
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
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false, true);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        boolean boolean85 = xYSeries84.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.setKey((java.lang.Comparable) 10.0d);
        xYSeries1.add((double) 2, (java.lang.Number) 10);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) 10, 10.0d, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        xYSeries10.setNotify(false);
        xYSeries10.setMaximumItemCount((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.updateByIndex((-1), (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        java.lang.Object obj67 = xYSeries1.clone();
        xYSeries1.add((double) (-3), (java.lang.Number) (short) -1);
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
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.setNotify(true);
        java.lang.Number number9 = null;
        xYSeries5.add((double) (-1), number9);
        java.util.List list11 = xYSeries5.getItems();
        boolean boolean12 = xYSeries5.getAllowDuplicateXValues();
        boolean boolean13 = xYSeries5.getNotify();
        int int15 = xYSeries5.indexOf((java.lang.Number) (short) 1);
        java.lang.Comparable comparable16 = xYSeries5.getKey();
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
        xYSeries5.add(xYDataItem51);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem51);
        xYSeries3.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10.0d + "'", comparable16, 10.0d);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 10 + "'", comparable28, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(xYDataItem51);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false, true);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
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
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 5, true);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries1.createCopy((int) 'a', 10);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        java.lang.Comparable comparable40 = xYSeries38.getKey();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries38.createCopy((int) '4', (int) (short) 10);
        boolean boolean44 = xYSeries38.isEmpty();
        java.util.List list45 = xYSeries38.data;
        xYSeries1.data = list45;
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries1.addOrUpdate((double) (byte) 100, 4.0d);
        boolean boolean50 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list51 = xYSeries1.data;
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 10.0d + "'", comparable40, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 2);
        xYSeries1.add((java.lang.Number) (byte) -1, (java.lang.Number) 3, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries1.addChangeListener(seriesChangeListener28);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem15, true);
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries17.createCopy((int) (byte) -1, (int) (byte) 10);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries17.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem15);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        java.util.List list16 = xYSeries1.getItems();
        java.lang.String str17 = xYSeries1.getDescription();
        int int18 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.add((double) 0, (double) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) (byte) 10, 4);
        xYSeries9.add((double) 'a', (java.lang.Number) (short) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries9.updateByIndex((int) (byte) 10, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        boolean boolean20 = xYSeries10.isEmpty();
        java.lang.Object obj21 = xYSeries10.clone();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries1.createCopy((int) 'a', 10);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        java.lang.Comparable comparable40 = xYSeries38.getKey();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries38.createCopy((int) '4', (int) (short) 10);
        boolean boolean44 = xYSeries38.isEmpty();
        java.util.List list45 = xYSeries38.data;
        xYSeries1.data = list45;
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries1.addOrUpdate((double) (byte) 100, 4.0d);
        boolean boolean50 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        xYSeries1.removeChangeListener(seriesChangeListener51);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + 10.0d + "'", comparable40, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (-1), false);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        xYSeries22.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list30 = xYSeries22.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries22.removeChangeListener(seriesChangeListener31);
        xYSeries22.add((java.lang.Number) (-1L), (java.lang.Number) (byte) 0);
        xYSeries22.setMaximumItemCount((int) (byte) 1);
        boolean boolean38 = xYSeries1.equals((java.lang.Object) (byte) 1);
        org.jfree.data.xy.XYDataItem xYDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getNotify();
        java.lang.Number number9 = null;
        xYSeries1.add((java.lang.Number) (short) -1, number9, true);
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries40.setNotify(true);
        java.lang.Number number44 = null;
        xYSeries40.add((double) (-1), number44);
        java.util.List list46 = xYSeries40.getItems();
        boolean boolean47 = xYSeries40.getAllowDuplicateXValues();
        boolean boolean48 = xYSeries40.getNotify();
        org.jfree.data.xy.XYSeries xYSeries51 = xYSeries40.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries40.remove((int) (short) 0);
        xYSeries1.add(xYDataItem53, true);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYSeries51);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        java.lang.Comparable comparable84 = xYSeries1.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable84 + "' != '" + 10.0d + "'", comparable84, 10.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false);
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false);
        xYSeries2.add((-1.0d), (double) 100.0f);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.String str4 = xYSeries3.getDescription();
        int int6 = xYSeries3.indexOf((java.lang.Number) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false, true);
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
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        java.lang.Number number14 = xYSeries1.getY(2);
        boolean boolean15 = xYSeries1.isEmpty();
        xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) (byte) 100);
        int int20 = xYSeries1.indexOf((java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-4) + "'", int20 == (-4));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) 3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.setDescription("");
        double[][] doubleArray9 = xYSeries1.toArray();
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) '4', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 2);
        xYSeries2.add((double) (byte) 1, (double) (byte) -1);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0d + "'", comparable7, 10.0d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean16 = xYSeries9.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean25 = xYSeries18.equals((java.lang.Object) 2147483647);
        boolean boolean26 = xYSeries9.equals((java.lang.Object) xYSeries18);
        xYSeries9.fireSeriesChanged();
        xYSeries9.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries9.setNotify(false);
        xYSeries9.setKey((java.lang.Comparable) "");
        xYSeries9.clear();
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
        xYSeries9.setKey((java.lang.Comparable) xYDataItem54);
        xYSeries1.add(xYDataItem54);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 10.0d + "'", comparable44, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        boolean boolean10 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) '#', 35);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries7.addOrUpdate((java.lang.Number) (-5908509288197150436L), (java.lang.Number) 4.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        int int14 = xYSeries1.getItemCount();
        java.util.List list15 = xYSeries1.getItems();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        xYSeries5.setMaximumItemCount((int) (byte) 10);
        xYSeries5.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries5.clear();
        xYSeries5.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        java.lang.String str19 = xYSeries17.getDescription();
        xYSeries17.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean24 = xYSeries17.equals((java.lang.Object) 2147483647);
        boolean boolean25 = xYSeries5.equals((java.lang.Object) 2147483647);
        java.lang.String str26 = xYSeries5.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries5.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean30 = xYSeries5.getAutoSort();
        xYSeries5.setDescription("hi!");
        xYSeries5.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries5.addChangeListener(seriesChangeListener36);
        boolean boolean38 = xYSeries3.equals((java.lang.Object) seriesChangeListener36);
        xYSeries3.add((double) 10.0f, (double) (byte) 100);
        xYSeries3.add((java.lang.Number) 100L, (java.lang.Number) 1L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        double[][] doubleArray23 = xYSeries1.toArray();
        boolean boolean24 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.remove((java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        xYSeries1.setMaximumItemCount(10);
        java.util.List list15 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.delete((int) (byte) 10, 1);
        xYSeries1.setKey((java.lang.Comparable) (-2));
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries1.createCopy((int) (short) 10, 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        xYSeries1.add((double) 100, 1.0d);
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
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries79.clear();
        java.lang.Comparable comparable81 = xYSeries79.getKey();
        org.jfree.data.xy.XYSeries xYSeries84 = xYSeries79.createCopy((int) '4', (int) (short) 10);
        boolean boolean85 = xYSeries79.isEmpty();
        java.util.List list86 = xYSeries79.data;
        xYSeries1.data = list86;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2147483647, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + comparable81 + "' != '" + 10.0d + "'", comparable81, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        xYSeries1.add((double) '#', (double) 10L);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        java.lang.String str16 = xYSeries14.getDescription();
        xYSeries14.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean21 = xYSeries14.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        java.lang.String str25 = xYSeries23.getDescription();
        xYSeries23.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean30 = xYSeries23.equals((java.lang.Object) 2147483647);
        boolean boolean31 = xYSeries14.equals((java.lang.Object) xYSeries23);
        xYSeries14.fireSeriesChanged();
        xYSeries14.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.clear();
        xYSeries37.setMaximumItemCount((int) (byte) 10);
        xYSeries37.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list45 = xYSeries37.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        xYSeries37.removeChangeListener(seriesChangeListener46);
        xYSeries37.add((double) 100.0f, 100.0d);
        boolean boolean51 = xYSeries37.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries37.remove((int) (byte) 1);
        xYSeries14.add(xYDataItem53, false);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries14.remove(1);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) '#', 35);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean16 = xYSeries9.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean25 = xYSeries18.equals((java.lang.Object) 2147483647);
        boolean boolean26 = xYSeries9.equals((java.lang.Object) xYSeries18);
        boolean boolean27 = xYSeries18.getNotify();
        boolean boolean28 = xYSeries18.getNotify();
        xYSeries18.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries18.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem33, true, true);
        xYSeries3.add(xYDataItem33, false);
        java.lang.Comparable comparable39 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + 100.0f + "'", comparable39, 100.0f);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        boolean boolean12 = xYSeries1.getAutoSort();
        java.lang.String str13 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) '#', (double) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        xYSeries16.setMaximumItemCount((int) (byte) 10);
        xYSeries16.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries16.clear();
        xYSeries16.setKey((java.lang.Comparable) (short) 0);
        xYSeries16.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries16.add((java.lang.Number) (short) 10, (java.lang.Number) (-1));
        boolean boolean33 = xYSeries1.equals((java.lang.Object) (-1));
        java.lang.String str34 = xYSeries1.getDescription();
        xYSeries1.add((java.lang.Number) 35, (java.lang.Number) 4);
        xYSeries1.add((double) (short) 100, (java.lang.Number) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        xYSeries2.setNotify(false);
        xYSeries2.clear();
        java.util.List list6 = xYSeries2.getItems();
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        xYSeries1.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries11.setNotify(true);
        java.lang.Number number15 = null;
        xYSeries11.add((double) (-1), number15);
        java.util.List list17 = xYSeries11.getItems();
        boolean boolean18 = xYSeries11.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener19);
        double[][] doubleArray21 = xYSeries11.toArray();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries23.clear();
        xYSeries23.setMaximumItemCount((int) (byte) 10);
        xYSeries23.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries23.clear();
        java.util.List list32 = xYSeries23.data;
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries23.removeChangeListener(seriesChangeListener35);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries40.addChangeListener(seriesChangeListener41);
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
        xYSeries40.add(xYDataItem60);
        xYSeries23.add(xYDataItem60);
        xYSeries11.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem60);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener66 = null;
        xYSeries1.addChangeListener(seriesChangeListener66);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        xYSeries9.setNotify(true);
        double[][] doubleArray12 = xYSeries9.toArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        java.lang.Object obj17 = xYSeries16.clone();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries16.addOrUpdate((double) 0L, (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries1.fireSeriesChanged();
        java.util.List list12 = xYSeries1.data;
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 10);
        xYSeries1.add((java.lang.Number) (short) 10, (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries1.createCopy(5, (-2));
        boolean boolean21 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        xYSeries1.delete((int) (byte) 10, 2);
        boolean boolean63 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) (-2));
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        java.lang.Class<?> wildcardClass20 = xYSeries1.getClass();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries3.createCopy((-3), 2147483647);
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
        org.junit.Assert.assertNotNull(xYSeries64);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        int int6 = xYSeries1.getItemCount();
        int int8 = xYSeries1.indexOf((java.lang.Number) 1L);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) (short) 1, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((int) (byte) 100, (int) (short) 1);
        xYSeries3.add(0.0d, (java.lang.Number) 100.0d, false);
        int int14 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        xYSeries60.addChangeListener(seriesChangeListener63);
        double[][] doubleArray65 = xYSeries60.toArray();
        xYSeries60.add((double) (-5908509288197150436L), (java.lang.Number) 2147483647);
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
        org.junit.Assert.assertNotNull(doubleArray65);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) 1L, (java.lang.Number) 10.0f);
        xYSeries1.add(0.0d, (java.lang.Number) 10.0f, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (short) 100, 4);
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries16.addChangeListener(seriesChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries16.addChangeListener(seriesChangeListener21);
        boolean boolean23 = xYSeries1.equals((java.lang.Object) seriesChangeListener21);
        xYSeries1.add(10.0d, (java.lang.Number) (byte) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries18.addChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        xYSeries22.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list30 = xYSeries22.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries22.removeChangeListener(seriesChangeListener31);
        xYSeries22.add((double) 100.0f, 100.0d);
        boolean boolean36 = xYSeries22.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries22.remove((int) (byte) 1);
        xYSeries18.add(xYDataItem38);
        xYSeries1.add(xYDataItem38);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries1.removeChangeListener(seriesChangeListener41);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate(10.0d, (double) 35);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false);
        int int60 = xYSeries58.indexOf((java.lang.Number) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries58.remove((java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d, true);
        xYSeries1.fireSeriesChanged();
        double[][] doubleArray17 = xYSeries1.toArray();
        xYSeries1.clear();
        java.lang.Class<?> wildcardClass19 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        java.lang.Object obj39 = xYSeries38.clone();
        xYSeries38.setMaximumItemCount(0);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener42);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        boolean boolean62 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries64.clear();
        xYSeries64.setMaximumItemCount((int) (byte) 10);
        xYSeries64.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list72 = xYSeries64.getItems();
        int int73 = xYSeries64.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener74 = null;
        xYSeries64.removeChangeListener(seriesChangeListener74);
        boolean boolean76 = xYSeries64.getNotify();
        int int77 = xYSeries64.getItemCount();
        java.util.List list78 = xYSeries64.data;
        xYSeries3.data = list78;
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(list78);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        java.lang.Object obj32 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertNotNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        int int9 = xYSeries1.getItemCount();
        xYSeries1.clear();
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        java.lang.Class<?> wildcardClass93 = xYDataItem87.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries3.clear();
        xYSeries3.setMaximumItemCount((int) (byte) 10);
        xYSeries3.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list11 = xYSeries3.getItems();
        xYSeries1.data = list11;
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        java.lang.Object obj48 = xYSeries47.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries47.updateByIndex(0, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        xYSeries3.setMaximumItemCount(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem88 = xYSeries3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        java.util.List list3 = xYSeries2.getItems();
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
        boolean boolean23 = xYSeries14.getNotify();
        boolean boolean24 = xYSeries14.getNotify();
        xYSeries14.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries14.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem29, true, true);
        xYSeries2.add(xYDataItem29, true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem29);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (byte) 100);
        xYSeries1.add((double) 0.0f, (double) (short) -1, true);
        xYSeries1.updateByIndex(0, (java.lang.Number) 2147483647);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries65.clear();
        java.lang.String str67 = xYSeries65.getDescription();
        java.util.List list68 = xYSeries65.getItems();
        boolean boolean69 = xYSeries65.getNotify();
        xYSeries65.add((double) (short) -1, (double) 100L, false);
        java.util.List list74 = xYSeries65.data;
        boolean boolean75 = xYSeries47.equals((java.lang.Object) list74);
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
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.delete((int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((double) 1.0f, (double) 0);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries7.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable17 = xYSeries16.getKey();
        xYSeries16.add((double) (short) 0, (double) ' ');
        int int22 = xYSeries16.indexOf((java.lang.Number) 1.0d);
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
        xYSeries16.add(xYDataItem40);
        xYSeries7.add(xYDataItem40);
        xYSeries7.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries7.getNotify();
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.setNotify(true);
        java.lang.Number number53 = null;
        xYSeries49.add((double) (-1), number53);
        java.util.List list55 = xYSeries49.getItems();
        boolean boolean56 = xYSeries49.getAllowDuplicateXValues();
        boolean boolean57 = xYSeries49.getNotify();
        boolean boolean58 = xYSeries49.getAllowDuplicateXValues();
        xYSeries49.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries61.clear();
        java.lang.Comparable comparable63 = xYSeries61.getKey();
        xYSeries61.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean71 = xYSeries61.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries61.remove(0);
        xYSeries49.add(xYDataItem73);
        xYSeries7.add(xYDataItem73, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, false, true);
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + 10.0d + "'", comparable63, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean10 = xYSeries1.getAutoSort();
        xYSeries1.fireSeriesChanged();
        java.lang.String str12 = xYSeries1.getDescription();
        xYSeries1.add((double) 10L, (double) (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13, false, false);
        xYSeries17.setMaximumItemCount(0);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        java.lang.String str7 = xYSeries5.getDescription();
        xYSeries5.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean12 = xYSeries5.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries16.addChangeListener(seriesChangeListener17);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        xYSeries20.setMaximumItemCount((int) (byte) 10);
        xYSeries20.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list28 = xYSeries20.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries20.removeChangeListener(seriesChangeListener29);
        xYSeries20.add((double) 100.0f, 100.0d);
        boolean boolean34 = xYSeries20.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries20.remove((int) (byte) 1);
        xYSeries16.add(xYDataItem36);
        xYSeries5.add(xYDataItem36, false);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries41.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries48.clear();
        java.lang.Comparable comparable50 = xYSeries48.getKey();
        xYSeries48.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean58 = xYSeries48.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries48.remove(0);
        xYSeries41.add(xYDataItem60, false);
        xYSeries5.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        xYSeries1.add(xYDataItem60, false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + 10.0d + "'", comparable50, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
            xYSeries12.update(number21, (java.lang.Number) (-1));
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.lang.Object obj10 = xYSeries1.clone();
        java.lang.Number number12 = xYSeries1.getY(0);
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
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, false, false);
        xYSeries1.add(xYDataItem63);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 1.0d + "'", number12, 1.0d);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        xYSeries1.add((double) '4', (java.lang.Number) (byte) 0);
        org.jfree.data.xy.XYDataItem xYDataItem54 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem54, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        double[][] doubleArray14 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean4 = xYSeries3.getNotify();
        java.lang.Comparable comparable5 = xYSeries3.getKey();
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries3.createCopy((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 3 + "'", comparable5, 3);
        org.junit.Assert.assertNotNull(xYSeries8);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28);
        xYSeries29.setNotify(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem28);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = xYSeries3.getNotify();
        xYSeries3.add((double) '4', (java.lang.Number) 2147483647, true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.setNotify(false);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.util.List list12 = xYSeries3.getItems();
        xYSeries3.clear();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        xYSeries1.add(0.0d, (java.lang.Number) 0.0f);
        java.lang.Number number63 = xYSeries1.getX(0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertEquals("'" + number63 + "' != '" + (-1.0d) + "'", number63, (-1.0d));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25, true, true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, false);
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener94 = null;
        xYSeries3.addChangeListener(seriesChangeListener94);
        xYSeries3.update((java.lang.Number) (-2), (java.lang.Number) 35);
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
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        int int6 = xYSeries1.getItemCount();
        boolean boolean7 = xYSeries1.getAutoSort();
        xYSeries1.add((double) 0.0f, (double) (byte) 100, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        xYSeries14.fireSeriesChanged();
        boolean boolean16 = xYSeries14.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries14.removeChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.delete(35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries1.addChangeListener(seriesChangeListener27);
        boolean boolean29 = xYSeries1.getAutoSort();
        java.util.List list30 = xYSeries1.data;
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        double[][] doubleArray16 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        int int14 = xYSeries1.getItemCount();
        java.lang.String str15 = xYSeries1.getDescription();
        boolean boolean16 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72);
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
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries13.clear();
        xYSeries13.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries13.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries13.createCopy((int) 'a', (int) '4');
        boolean boolean23 = xYSeries13.isEmpty();
        double[][] doubleArray24 = xYSeries13.toArray();
        boolean boolean25 = xYSeries13.isEmpty();
        boolean boolean26 = xYSeries1.equals((java.lang.Object) xYSeries13);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (-1L), (double) (-5908509288197150436L));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1, false, true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem9);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener15);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1L));
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener19);
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries26.addOrUpdate((double) 1L, (double) (short) -1);
        boolean boolean30 = xYSeries26.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        int int34 = xYSeries32.getMaximumItemCount();
        xYSeries32.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = xYSeries32.createCopy((int) (byte) 100, 2);
        java.util.List list41 = xYSeries32.getItems();
        xYSeries32.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean45 = xYSeries32.getNotify();
        xYSeries32.setDescription("");
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
        xYSeries32.add(xYDataItem75);
        xYSeries26.add(xYDataItem75, false);
        xYSeries1.add(xYDataItem75, false);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries1.addOrUpdate(1.0d, (double) 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (short) 10 + "'", comparable52, (short) 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-2) + "'", int57 == (-2));
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertNull(xYDataItem84);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        java.lang.Comparable comparable63 = xYSeries3.getKey();
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
        org.junit.Assert.assertNotNull(comparable63);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        boolean boolean14 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable19 = xYSeries18.getKey();
        xYSeries18.add((double) (short) 0, (double) ' ');
        int int24 = xYSeries18.indexOf((java.lang.Number) 1.0d);
        xYSeries18.add((double) (-2), (-1.0d));
        xYSeries18.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean32 = xYSeries18.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries34.clear();
        int int36 = xYSeries34.getMaximumItemCount();
        xYSeries34.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries34.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable47 = xYSeries46.getKey();
        xYSeries46.add((double) (short) 0, (double) ' ');
        int int52 = xYSeries46.indexOf((java.lang.Number) 1.0d);
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
        xYSeries46.add(xYDataItem70);
        xYSeries42.add(xYDataItem70, false);
        xYSeries18.add(xYDataItem70);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70, true);
        xYSeries1.add(xYDataItem70, false);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + (short) 10 + "'", comparable47, (short) 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2) + "'", int52 == (-2));
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xYDataItem70);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, false, true);
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        int int20 = xYSeries10.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries10.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) (byte) 10, (java.lang.Number) 100.0d, true);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries14.clear();
        int int16 = xYSeries14.getMaximumItemCount();
        xYSeries14.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries14.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable27 = xYSeries26.getKey();
        xYSeries26.add((double) (short) 0, (double) ' ');
        int int32 = xYSeries26.indexOf((java.lang.Number) 1.0d);
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
        xYSeries26.add(xYDataItem50);
        xYSeries22.add(xYDataItem50, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, true);
        boolean boolean58 = xYSeries1.equals((java.lang.Object) xYSeries57);
        xYSeries1.updateByIndex((int) (byte) 1, (java.lang.Number) (short) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 10 + "'", comparable27, (short) 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        int int25 = xYSeries23.getMaximumItemCount();
        xYSeries23.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int30 = xYSeries23.indexOf((java.lang.Number) (byte) -1);
        java.util.List list31 = xYSeries23.data;
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
        xYSeries23.add(xYDataItem70);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70);
        xYSeries3.add(xYDataItem70, true);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70, false);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(xYDataItem70);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 0, (double) (byte) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries2.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (byte) 100);
        java.lang.String str10 = xYSeries2.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries2.removeChangeListener(seriesChangeListener11);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.setKey(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        java.util.List list21 = xYSeries10.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.delete(5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.Object obj16 = xYSeries1.clone();
        double[][] doubleArray17 = xYSeries1.toArray();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove((java.lang.Number) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(xYDataItem11);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number78 = xYSeries10.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        xYSeries12.add((java.lang.Number) 0L, (java.lang.Number) 100.0f, true);
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
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        int int46 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 10.0f, (double) 'a');
        xYSeries1.updateByIndex((int) (byte) 1, (java.lang.Number) (-2));
        xYSeries1.add((double) 4, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        boolean boolean53 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        java.lang.String str9 = xYSeries3.getDescription();
        java.lang.Object obj10 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        double[][] doubleArray77 = xYSeries16.toArray();
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
        org.junit.Assert.assertNotNull(doubleArray77);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries12.removeChangeListener(seriesChangeListener15);
        java.lang.String str17 = xYSeries12.getDescription();
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
        xYSeries12.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45);
        xYSeries1.add(xYDataItem45, false);
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 10 + "'", comparable22, (short) 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries1.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        int int18 = xYSeries1.indexOf((java.lang.Number) 10.0f);
        java.lang.Comparable comparable19 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener9);
        xYSeries3.setNotify(false);
        double[][] doubleArray13 = xYSeries3.toArray();
        xYSeries3.setMaximumItemCount((int) '#');
        int int16 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        xYSeries18.setMaximumItemCount((int) (byte) 10);
        xYSeries18.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries18.clear();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries18.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries18.remove(0);
        xYSeries18.add((java.lang.Number) (-1L), (java.lang.Number) (-1), false);
        boolean boolean36 = xYSeries18.getNotify();
        boolean boolean37 = xYSeries3.equals((java.lang.Object) boolean36);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (short) 100, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        xYSeries29.clear();
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
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (short) 1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem14, false);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries16.addOrUpdate((double) 2147483647, (double) (-5908509288197150436L));
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) 'a', (double) (short) 10);
        double[][] doubleArray14 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        java.lang.Object obj68 = xYSeries3.clone();
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
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100L);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        xYSeries17.setMaximumItemCount((int) '#');
        xYSeries17.setMaximumItemCount((int) (byte) 0);
        xYSeries17.setDescription("");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((double) '#', (double) (-1.0f));
        boolean boolean13 = xYSeries3.isEmpty();
        java.lang.Comparable comparable14 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.clear();
        java.lang.String str5 = xYSeries3.getDescription();
        xYSeries3.add((double) 0L, (double) (byte) 100, false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        java.util.List list21 = xYSeries1.data;
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray5 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        int int9 = xYSeries7.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries7.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        java.util.List list13 = xYSeries7.getItems();
        xYSeries1.data = list13;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        xYSeries9.clear();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries9.createCopy((int) 'a', (int) (byte) 1);
        xYSeries44.add(0.0d, (java.lang.Number) (-3), true);
        xYSeries44.setDescription("hi!");
        xYSeries44.add((double) 1L, (java.lang.Number) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        xYSeries44.removeChangeListener(seriesChangeListener54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertNotNull(xYSeries44);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((double) 'a', (double) (short) 10);
        boolean boolean14 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        xYSeries16.setMaximumItemCount((int) (byte) 10);
        xYSeries16.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list24 = xYSeries16.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries16.removeChangeListener(seriesChangeListener25);
        boolean boolean28 = xYSeries16.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries16.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem30);
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.add((double) 2, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (short) 100, 4);
        xYSeries1.setDescription("");
        int int15 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener3);
        boolean boolean5 = xYSeries2.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries2.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries52.clear();
        xYSeries52.setMaximumItemCount((int) (byte) 10);
        xYSeries52.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries52.clear();
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries52.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries52.remove(0);
        xYSeries3.add(xYDataItem65);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertNull(xYDataItem63);
        org.junit.Assert.assertNotNull(xYDataItem65);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1L));
        xYSeries1.add((java.lang.Number) (short) 100, (java.lang.Number) 10.0f, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        boolean boolean23 = xYSeries3.getNotify();
        boolean boolean24 = xYSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
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
        java.util.List list29 = xYSeries11.getItems();
        xYSeries1.data = list29;
        boolean boolean31 = xYSeries1.getNotify();
        java.lang.Class<?> wildcardClass32 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.add((double) 4, (double) 10.0f, true);
        java.lang.Class<?> wildcardClass14 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        xYSeries9.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries9.createCopy((int) 'a', 1);
        xYSeries9.add((double) (-1.0f), (double) 3);
        int int18 = xYSeries9.getItemCount();
        java.lang.String str19 = xYSeries9.getDescription();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        xYSeries1.clear();
        xYSeries1.add(0.0d, (java.lang.Number) (-4), true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy(4, 10);
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries1.createCopy((int) (byte) 0, (int) '4');
        xYSeries1.add((java.lang.Number) 1L, (java.lang.Number) 2147483647);
        boolean boolean23 = xYSeries1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.setNotify(true);
        java.lang.Number number26 = null;
        xYSeries22.add((double) (-1), number26);
        java.util.List list28 = xYSeries22.getItems();
        boolean boolean29 = xYSeries22.getAllowDuplicateXValues();
        boolean boolean30 = xYSeries22.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries22.addChangeListener(seriesChangeListener31);
        xYSeries22.add((double) 2, (double) '#');
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.setNotify(true);
        java.lang.Number number41 = null;
        xYSeries37.add((double) (-1), number41);
        java.util.List list43 = xYSeries37.getItems();
        boolean boolean44 = xYSeries37.getAllowDuplicateXValues();
        boolean boolean45 = xYSeries37.getNotify();
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries37.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries37.remove((int) (short) 0);
        xYSeries22.setKey((java.lang.Comparable) (short) 0);
        int int52 = xYSeries22.getItemCount();
        java.util.List list53 = xYSeries22.data;
        xYSeries1.data = list53;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        xYSeries6.clear();
        java.lang.Comparable comparable8 = xYSeries6.getKey();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0d + "'", comparable8, 10.0d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), true, true);
        java.lang.String str4 = xYSeries3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        int int11 = xYSeries9.getMaximumItemCount();
        xYSeries9.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries9.createCopy((int) (byte) 100, 2);
        java.util.List list18 = xYSeries9.getItems();
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
        xYSeries9.add(xYDataItem74);
        xYSeries1.add(xYDataItem74);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(list18);
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
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        xYSeries1.add((double) 10, (java.lang.Number) 100.0f);
        int int21 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.setKey((java.lang.Comparable) 10.0d);
        boolean boolean15 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        xYSeries1.add((java.lang.Number) 10L, (java.lang.Number) 35, false);
        xYSeries1.add((double) (byte) 100, (double) 1L);
        java.lang.String str20 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        xYSeries1.add((java.lang.Number) (-1.0f), (java.lang.Number) 0.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getNotify();
        xYSeries1.delete(0, (int) (byte) -1);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 1.0d, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        boolean boolean72 = xYSeries71.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener73);
        boolean boolean75 = xYSeries71.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        xYSeries1.setNotify(false);
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
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener26);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.addOrUpdate((double) 35, (double) '#');
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        xYSeries3.setKey((java.lang.Comparable) false);
        boolean boolean22 = xYSeries3.getNotify();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries25.removeChangeListener(seriesChangeListener28);
        java.lang.String str30 = xYSeries25.getDescription();
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
        xYSeries25.add(xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true);
        java.lang.Comparable comparable63 = xYSeries62.getKey();
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries(comparable63, false, false);
        int int68 = xYSeries66.indexOf((java.lang.Number) 100.0f);
        java.lang.Object obj69 = xYSeries66.clone();
        boolean boolean70 = xYSeries3.equals(obj69);
        java.util.List list71 = xYSeries3.data;
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 10 + "'", comparable35, (short) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(comparable63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        int int6 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((-4), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        xYSeries7.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener11);
        java.util.List list13 = xYSeries7.getItems();
        xYSeries1.data = list13;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(0.0d, (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries37.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries44.clear();
        java.lang.Comparable comparable46 = xYSeries44.getKey();
        xYSeries44.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean54 = xYSeries44.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries44.remove(0);
        xYSeries37.add(xYDataItem56, false);
        xYSeries1.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        xYSeries60.add((double) 2147483647, (java.lang.Number) (-1.0f), true);
        boolean boolean65 = xYSeries60.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries60.addOrUpdate((java.lang.Number) (-4), (java.lang.Number) 100L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10.0d + "'", comparable46, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(xYDataItem68);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 10, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        double[][] doubleArray16 = xYSeries15.toArray();
        int int18 = xYSeries15.indexOf((java.lang.Number) (-3));
        java.lang.Object obj19 = xYSeries15.clone();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        xYSeries23.add((double) (short) 0, (double) ' ');
        int int29 = xYSeries23.indexOf((java.lang.Number) 1.0d);
        xYSeries23.add((double) (-2), (-1.0d));
        xYSeries23.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean37 = xYSeries23.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries40.addOrUpdate((double) 1L, (double) (short) -1);
        boolean boolean44 = xYSeries40.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries46.clear();
        int int48 = xYSeries46.getMaximumItemCount();
        xYSeries46.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries54 = xYSeries46.createCopy((int) (byte) 100, 2);
        java.util.List list55 = xYSeries46.getItems();
        xYSeries46.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean59 = xYSeries46.getNotify();
        xYSeries46.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable66 = xYSeries65.getKey();
        xYSeries65.add((double) (short) 0, (double) ' ');
        int int71 = xYSeries65.indexOf((java.lang.Number) 1.0d);
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
        xYSeries65.add(xYDataItem89);
        xYSeries46.add(xYDataItem89);
        xYSeries40.add(xYDataItem89, false);
        xYSeries23.add(xYDataItem89);
        xYSeries15.add(xYDataItem89);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + comparable66 + "' != '" + (short) 10 + "'", comparable66, (short) 10);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-2) + "'", int71 == (-2));
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries10.createCopy((int) '4', (int) '4');
        boolean boolean17 = xYSeries10.equals((java.lang.Object) "hi!");
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries19.clear();
        xYSeries19.setMaximumItemCount((int) (byte) 10);
        xYSeries19.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries19.clear();
        java.util.List list28 = xYSeries19.data;
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener29);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries19.removeChangeListener(seriesChangeListener31);
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
        xYSeries19.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        xYSeries10.add(xYDataItem56, true);
        xYSeries10.add(0.0d, (double) (short) 10, true);
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries10.remove(1);
        xYSeries1.add(xYDataItem67);
        boolean boolean69 = xYSeries1.getNotify();
        xYSeries1.add((double) (short) 100, (double) 'a', true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener53);
        xYSeries1.add((double) 10.0f, (double) (short) 100, true);
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 1);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        boolean boolean12 = xYSeries6.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries6.createCopy(3, 0);
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries15.createCopy((int) '4', 10);
        java.util.List list19 = xYSeries18.data;
        int int20 = xYSeries18.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        xYSeries54.addChangeListener(seriesChangeListener55);
        org.jfree.data.xy.XYSeries xYSeries59 = xYSeries54.createCopy((int) 'a', (-2));
        org.jfree.data.xy.XYSeries xYSeries62 = xYSeries54.createCopy((-3), (int) ' ');
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(xYSeries59);
        org.junit.Assert.assertNotNull(xYSeries62);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        xYSeries7.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy(4, 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries1.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        int int12 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true, true);
        xYSeries16.add((double) (short) 1, (java.lang.Number) (-5908509288197150436L), false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable25 = xYSeries24.getKey();
        xYSeries24.add((double) (short) 0, (double) ' ');
        int int30 = xYSeries24.indexOf((java.lang.Number) 1.0d);
        xYSeries24.add((double) (-2), (-1.0d));
        xYSeries24.add((double) (-5908509288197150436L), (double) 10L, false);
        boolean boolean38 = xYSeries24.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries40.clear();
        int int42 = xYSeries40.getMaximumItemCount();
        xYSeries40.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries40.createCopy((int) (byte) 100, 2);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable53 = xYSeries52.getKey();
        xYSeries52.add((double) (short) 0, (double) ' ');
        int int58 = xYSeries52.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries60.clear();
        xYSeries60.setMaximumItemCount((int) (byte) 10);
        xYSeries60.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list68 = xYSeries60.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        xYSeries60.removeChangeListener(seriesChangeListener69);
        xYSeries60.add((double) 100.0f, 100.0d);
        boolean boolean74 = xYSeries60.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem76 = xYSeries60.remove((int) (byte) 1);
        xYSeries52.add(xYDataItem76);
        xYSeries48.add(xYDataItem76, false);
        xYSeries24.add(xYDataItem76);
        java.lang.String str81 = xYSeries24.getDescription();
        boolean boolean82 = xYSeries24.getAutoSort();
        int int83 = xYSeries24.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem86 = xYSeries24.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10L);
        xYSeries16.add(xYDataItem86, true);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, true, false);
        xYSeries1.add(xYDataItem86);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + (short) 10 + "'", comparable53, (short) 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-2) + "'", int58 == (-2));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(xYDataItem76);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 4 + "'", int83 == 4);
        org.junit.Assert.assertNotNull(xYDataItem86);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries38.clear();
        xYSeries38.setMaximumItemCount((int) (byte) 10);
        xYSeries38.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list46 = xYSeries38.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries38.removeChangeListener(seriesChangeListener47);
        xYSeries38.setNotify(true);
        int int51 = xYSeries38.getItemCount();
        boolean boolean52 = xYSeries1.equals((java.lang.Object) int51);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 100, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        xYSeries1.add((double) 0, (java.lang.Number) 10L, false);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(3, (int) '#');
        xYSeries9.add((double) (byte) -1, (double) (-3), false);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        xYSeries37.clear();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        xYSeries13.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries13.createCopy((int) (short) -1, (int) (byte) 1);
        java.util.List list18 = xYSeries13.getItems();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries7.clear();
        java.lang.String str9 = xYSeries7.getDescription();
        xYSeries7.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean14 = xYSeries7.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        java.lang.String str18 = xYSeries16.getDescription();
        xYSeries16.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean23 = xYSeries16.equals((java.lang.Object) 2147483647);
        boolean boolean24 = xYSeries7.equals((java.lang.Object) xYSeries16);
        xYSeries7.setMaximumItemCount((int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries7.addChangeListener(seriesChangeListener27);
        java.lang.Object obj29 = xYSeries7.clone();
        boolean boolean30 = xYSeries1.equals(obj29);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean7 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 10L, (java.lang.Number) (short) 0);
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        java.lang.Object obj39 = xYSeries38.clone();
        xYSeries38.setMaximumItemCount(0);
        java.util.List list42 = xYSeries38.getItems();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener44);
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 1);
        java.lang.Comparable comparable49 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + (short) 0 + "'", comparable49, (short) 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.util.List list21 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (-1L), (double) (-5908509288197150436L));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (short) -1);
        xYSeries3.add((double) 0.0f, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem9);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        xYSeries1.add((double) (-3), (double) 10);
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 35);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        java.lang.Object obj7 = xYSeries6.clone();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries6.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) 2);
        xYSeries6.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        java.lang.String str6 = xYSeries1.getDescription();
        int int7 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        boolean boolean14 = xYSeries1.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.addOrUpdate((double) 1.0f, (double) (short) -1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        xYSeries1.add((double) 100, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 5, (java.lang.Number) 35);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 5");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        java.lang.String str18 = xYSeries16.getDescription();
        xYSeries16.add((double) 100.0f, (double) 1L, false);
        xYSeries16.setNotify(true);
        boolean boolean26 = xYSeries16.equals((java.lang.Object) 100.0d);
        xYSeries16.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        java.util.List list30 = xYSeries16.data;
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.setNotify(true);
        java.lang.Number number36 = null;
        xYSeries32.add((double) (-1), number36);
        java.util.List list38 = xYSeries32.getItems();
        boolean boolean39 = xYSeries32.getAllowDuplicateXValues();
        boolean boolean40 = xYSeries32.getNotify();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries32.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.addPropertyChangeListener(propertyChangeListener44);
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
        xYSeries43.add(xYDataItem73, true);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, true, true);
        xYSeries16.setKey((java.lang.Comparable) true);
        xYSeries16.clear();
        xYSeries16.add((java.lang.Number) 1.0d, (java.lang.Number) 1L);
        boolean boolean85 = xYSeries1.equals((java.lang.Object) xYSeries16);
        xYSeries1.setMaximumItemCount(10);
        java.beans.PropertyChangeListener propertyChangeListener88 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener88);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + (short) 10 + "'", comparable50, (short) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-2) + "'", int55 == (-2));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        java.util.List list59 = xYSeries10.data;
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
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        java.lang.Number number79 = xYSeries1.getY(2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener80 = null;
        xYSeries1.removeChangeListener(seriesChangeListener80);
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
        org.junit.Assert.assertEquals("'" + number79 + "' != '" + (-1.0d) + "'", number79, (-1.0d));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries17.addOrUpdate((java.lang.Number) 4, (java.lang.Number) (byte) 0);
        xYSeries17.add((double) '4', (java.lang.Number) 0L, false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYSeries17);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries15.removeChangeListener(seriesChangeListener16);
        int int18 = xYSeries15.getItemCount();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries45.clear();
        xYSeries45.setMaximumItemCount((int) (byte) 10);
        xYSeries45.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries45.clear();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries45.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries45.remove(0);
        xYSeries1.add(xYDataItem58, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(xYDataItem56);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        xYSeries1.delete(100, 1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(0.0d, (java.lang.Number) (-3));
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
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        java.lang.String str11 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(2, (int) (byte) -1);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries14.createCopy((int) (byte) 100, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries1.addChangeListener(seriesChangeListener24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries1.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
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
        xYSeries5.fireSeriesChanged();
        xYSeries5.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries5.add(0.0d, (double) (-1));
        boolean boolean30 = xYSeries5.getNotify();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries32.removeChangeListener(seriesChangeListener35);
        java.lang.String str37 = xYSeries32.getDescription();
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
        xYSeries32.add(xYDataItem65);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem65, true);
        java.lang.Comparable comparable70 = xYSeries69.getKey();
        int int71 = xYSeries69.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries73.clear();
        int int75 = xYSeries73.getMaximumItemCount();
        int int76 = xYSeries73.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries78.clear();
        java.lang.Comparable comparable80 = xYSeries78.getKey();
        xYSeries78.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean88 = xYSeries78.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem90 = xYSeries78.remove(0);
        xYSeries73.add(xYDataItem90, false);
        xYSeries69.setKey((java.lang.Comparable) xYDataItem90);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem90, false);
        xYSeries5.add(xYDataItem90, true);
        xYSeries3.add(xYDataItem90);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (short) 10 + "'", comparable42, (short) 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-2) + "'", int47 == (-2));
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(comparable70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2147483647 + "'", int75 == 2147483647);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2147483647 + "'", int76 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable80 + "' != '" + 10.0d + "'", comparable80, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(xYDataItem90);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries29.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 0.0f);
        xYSeries29.add((double) (byte) 100, (double) (byte) 100, false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNull(xYDataItem36);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.util.List list6 = xYSeries1.data;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        org.jfree.data.xy.XYSeries xYSeries96 = xYSeries12.createCopy((int) (byte) 100, 0);
        java.lang.String str97 = xYSeries96.getDescription();
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
        org.junit.Assert.assertNotNull(xYSeries96);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (-2));
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries1.removeChangeListener(seriesChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.removeChangeListener(seriesChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) 3);
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        xYSeries12.setKey((java.lang.Comparable) (-1.0d));
        int int71 = xYSeries12.getMaximumItemCount();
        java.lang.Class<?> wildcardClass72 = xYSeries12.getClass();
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries21.removeChangeListener(seriesChangeListener24);
        java.lang.String str26 = xYSeries21.getDescription();
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
        xYSeries21.add(xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, true);
        xYSeries1.add(xYDataItem54, false);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) 10 + "'", comparable31, (short) 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries26.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries26.removeChangeListener(seriesChangeListener29);
        java.lang.String str31 = xYSeries26.getDescription();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable36 = xYSeries35.getKey();
        xYSeries35.add((double) (short) 0, (double) ' ');
        int int41 = xYSeries35.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries43.clear();
        xYSeries43.setMaximumItemCount((int) (byte) 10);
        xYSeries43.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list51 = xYSeries43.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries43.removeChangeListener(seriesChangeListener52);
        xYSeries43.add((double) 100.0f, 100.0d);
        boolean boolean57 = xYSeries43.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries43.remove((int) (byte) 1);
        xYSeries35.add(xYDataItem59);
        xYSeries26.add(xYDataItem59);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem59, false, true);
        xYSeries1.add(xYDataItem59);
        xYSeries1.add((double) (short) 0, (java.lang.Number) 1, false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (short) 10 + "'", comparable36, (short) 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(xYDataItem59);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.removeChangeListener(seriesChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) 100L);
        java.lang.Number number10 = xYSeries3.getX((int) (byte) 0);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-1.0d));
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        java.lang.Object obj40 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries1.remove((java.lang.Number) 4.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (byte) 0);
        xYSeries1.setMaximumItemCount((int) (byte) 1);
        xYSeries1.add((java.lang.Number) (-4), (java.lang.Number) (short) 0, false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        xYSeries38.clear();
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
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 1L);
        boolean boolean12 = xYSeries3.getAutoSort();
        java.lang.Object obj13 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        xYSeries1.setDescription("hi!");
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        java.lang.Comparable comparable5 = xYSeries2.getKey();
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (-5908509288197150436L) + "'", comparable5, (-5908509288197150436L));
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getNotify();
        xYSeries1.delete(0, (int) (byte) -1);
        int int10 = xYSeries1.getItemCount();
        boolean boolean11 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((double) '#', (double) (-1.0f));
        boolean boolean13 = xYSeries3.isEmpty();
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        java.lang.Object obj13 = xYSeries3.clone();
        java.lang.Class<?> wildcardClass14 = xYSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        int int14 = xYSeries1.getItemCount();
        java.util.List list15 = xYSeries1.getItems();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(10, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries10.remove((java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        xYSeries12.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries12.createCopy(3, (int) (short) -1);
        xYSeries12.setNotify(true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0d + "'", comparable23, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        java.lang.Object obj13 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        xYSeries17.setMaximumItemCount((int) (byte) 10);
        xYSeries17.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries17.clear();
        xYSeries17.setKey((java.lang.Comparable) (short) 0);
        xYSeries17.add((double) (byte) 1, 0.0d);
        int int31 = xYSeries17.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries33.clear();
        xYSeries33.setMaximumItemCount((int) (byte) 10);
        xYSeries33.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list41 = xYSeries33.getItems();
        xYSeries17.data = list41;
        boolean boolean43 = xYSeries1.equals((java.lang.Object) list41);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        java.util.List list15 = xYSeries1.data;
        int int16 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        xYSeries8.setMaximumItemCount((int) (byte) 10);
        xYSeries8.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries8.clear();
        xYSeries8.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        java.lang.String str22 = xYSeries20.getDescription();
        xYSeries20.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean27 = xYSeries20.equals((java.lang.Object) 2147483647);
        boolean boolean28 = xYSeries8.equals((java.lang.Object) 2147483647);
        xYSeries8.setKey((java.lang.Comparable) (short) -1);
        xYSeries8.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries8.addPropertyChangeListener(propertyChangeListener34);
        xYSeries8.clear();
        java.lang.Comparable comparable37 = xYSeries8.getKey();
        boolean boolean38 = xYSeries1.equals((java.lang.Object) xYSeries8);
        java.util.List list39 = xYSeries8.getItems();
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (short) -1 + "'", comparable37, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 0, (double) (byte) 1, false);
        java.lang.String str16 = xYSeries1.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        xYSeries1.add((double) (-5908509288197150436L), 0.0d);
        xYSeries1.setDescription("");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.add((double) (-1), (double) (-5908509288197150436L));
        java.util.List list6 = xYSeries1.data;
        xYSeries1.add((-1.0d), (double) '4', true);
        java.util.List list11 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (byte) 100 + "'", comparable2, (byte) 100);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (-1L), (double) (-5908509288197150436L));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem9);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        xYSeries1.add((double) 2147483647, (double) (-4), false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries37.createCopy((int) '4', (int) '4');
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries44.clear();
        java.lang.Comparable comparable46 = xYSeries44.getKey();
        xYSeries44.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean54 = xYSeries44.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries44.remove(0);
        xYSeries37.add(xYDataItem56, false);
        xYSeries1.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10.0d + "'", comparable46, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(xYDataItem56);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        java.util.List list11 = xYSeries1.data;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.clear();
        double[][] doubleArray9 = xYSeries1.toArray();
        xYSeries1.add((double) (short) 100, (java.lang.Number) 1L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries17.removeChangeListener(seriesChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        int int24 = xYSeries22.getMaximumItemCount();
        xYSeries22.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int29 = xYSeries22.indexOf((java.lang.Number) (byte) -1);
        java.util.List list30 = xYSeries22.data;
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries32.clear();
        xYSeries32.setMaximumItemCount((int) (byte) 10);
        xYSeries32.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries32.clear();
        java.util.List list41 = xYSeries32.data;
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener42);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        xYSeries32.removeChangeListener(seriesChangeListener44);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        xYSeries49.addChangeListener(seriesChangeListener50);
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
        xYSeries49.add(xYDataItem69);
        xYSeries32.add(xYDataItem69);
        xYSeries22.add(xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69);
        xYSeries17.add(xYDataItem69, false);
        xYSeries1.add(xYDataItem69);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = xYSeries1.getNotify();
        int int14 = xYSeries1.getItemCount();
        java.util.List list15 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.setNotify(true);
        java.lang.Number number21 = null;
        xYSeries17.add((double) (-1), number21);
        java.util.List list23 = xYSeries17.getItems();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries25.clear();
        xYSeries25.setMaximumItemCount((int) (byte) 10);
        xYSeries25.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list33 = xYSeries25.getItems();
        xYSeries17.data = list33;
        xYSeries1.data = list33;
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        boolean boolean4 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries7 = xYSeries3.createCopy((int) '#', 35);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries9.clear();
        java.lang.String str11 = xYSeries9.getDescription();
        xYSeries9.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean16 = xYSeries9.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries18.clear();
        java.lang.String str20 = xYSeries18.getDescription();
        xYSeries18.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean25 = xYSeries18.equals((java.lang.Object) 2147483647);
        boolean boolean26 = xYSeries9.equals((java.lang.Object) xYSeries18);
        boolean boolean27 = xYSeries18.getNotify();
        boolean boolean28 = xYSeries18.getNotify();
        xYSeries18.updateByIndex((int) (byte) 0, (java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries18.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem33, true, true);
        xYSeries3.add(xYDataItem33, false);
        java.util.List list39 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(xYSeries7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (short) 100, (-1.0d), true);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries37.clear();
        xYSeries37.setMaximumItemCount((int) (byte) 10);
        xYSeries37.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries37.clear();
        xYSeries37.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries49.clear();
        java.lang.String str51 = xYSeries49.getDescription();
        xYSeries49.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean56 = xYSeries49.equals((java.lang.Object) 2147483647);
        boolean boolean57 = xYSeries37.equals((java.lang.Object) 2147483647);
        xYSeries37.setKey((java.lang.Comparable) (short) -1);
        xYSeries37.add((double) (byte) 100, (java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries37.addPropertyChangeListener(propertyChangeListener63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener65);
        java.util.List list67 = xYSeries37.data;
        xYSeries1.data = list67;
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0d + "'", comparable11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) 10 + "'", comparable21, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(list67);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0d, (java.lang.Number) 35);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable13 = xYSeries12.getKey();
        xYSeries12.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries12.remove(0);
        xYSeries1.add(xYDataItem19, false);
        java.lang.String str22 = xYSeries1.getDescription();
        xYSeries1.add(100.0d, (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries28 = xYSeries1.createCopy((-2), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        xYSeries16.add((double) 0, (double) (short) 100);
        xYSeries16.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries16.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        boolean boolean52 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        boolean boolean8 = xYSeries1.equals((java.lang.Object) "hi!");
        java.lang.String str9 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries52.createCopy(0, 1);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
        java.util.List list58 = xYSeries55.data;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        int int16 = xYSeries1.getMaximumItemCount();
        xYSeries1.setDescription("");
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 4, false, false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        boolean boolean64 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-5908509288197150436L), (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -5908509288197150436");
        } catch (org.jfree.data.general.SeriesException e) {
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        java.util.List list13 = xYSeries1.data;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        xYSeries1.setNotify(true);
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        int int16 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.getDataItem((int) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }
}

