package org.jfree.data.xy;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        long long0 = org.jfree.data.xy.XYSeries.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-5908509288197150436L) + "'", long0 == (-5908509288197150436L));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries1.getX((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries12.add(xYDataItem13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number5, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.updateByIndex((int) (byte) -1, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        boolean boolean15 = xYSeries1.getAutoSort();
        int int16 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries10.remove((java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getX((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        org.jfree.data.xy.XYDataItem xYDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.add(xYDataItem3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getNotify();
        xYSeries1.delete(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(1, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 0, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries3.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        int int6 = xYSeries3.indexOf((java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1L, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getX((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', number7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setKey(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        java.lang.Class<?> wildcardClass10 = comparable9.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries23.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        double[][] doubleArray18 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries6.remove((java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries2.remove((java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        xYSeries17.add((java.lang.Number) 1, (java.lang.Number) (-1));
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
        xYSeries17.add(xYDataItem56, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem56, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYDataItem56);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100.0f, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (-1.0f), (double) (-1));
        xYSeries1.setNotify(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getX((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getY((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 0.0f, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries3.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries9.update((java.lang.Number) (short) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        java.lang.Class<?> wildcardClass11 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries23.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.lang.Class<?> wildcardClass5 = list4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (-1L), (double) (-5908509288197150436L));
        boolean boolean8 = xYSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
            xYSeries1.setMaximumItemCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.util.List list11 = xYSeries1.data;
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.remove((java.lang.Number) (short) -1);
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries14 = xYSeries3.createCopy((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 100, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(3, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((-1), (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        xYSeries1.updateByIndex((int) (byte) 0, (java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        int int35 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        int int49 = xYSeries48.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10L, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove((java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        boolean boolean4 = xYSeries1.getNotify();
        java.lang.Class<?> wildcardClass5 = xYSeries1.getClass();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries10.add((java.lang.Number) 100, (java.lang.Number) 1.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries10.getX((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = xYSeries1.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.delete((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass14 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries17 = xYSeries1.createCopy((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        boolean boolean12 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries43 = xYSeries9.createCopy(3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100.0f, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        xYSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries29 = xYSeries1.createCopy(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 100.0d, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries1.removeChangeListener(seriesChangeListener14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        java.util.List list18 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        java.lang.Number number17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number17, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries3.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
            org.jfree.data.xy.XYSeries xYSeries28 = xYSeries1.createCopy((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        java.lang.Class<?> wildcardClass10 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries53 = xYSeries1.createCopy((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number11, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 0.0d, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getNotify();
        xYSeries1.delete(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        int int6 = xYSeries1.getItemCount();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) 100.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries1.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = xYSeries1.getX((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int8 = xYSeries1.getItemCount();
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number9, (java.lang.Number) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.setKey((java.lang.Comparable) (byte) -1);
        java.lang.Object obj13 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0f, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.delete(100, (int) (byte) 10);
        boolean boolean9 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        boolean boolean31 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 10, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        boolean boolean12 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Comparable comparable39 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + 10.0d + "'", comparable39, 10.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries1.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        xYSeries1.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries48.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        java.lang.Number number54 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int55 = xYSeries1.indexOf(number54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        xYSeries1.setDescription("");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(comparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove((java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        xYSeries9.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries9.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries12.delete(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        java.lang.Object obj17 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100, true);
        double[][] doubleArray22 = xYSeries3.toArray();
        java.lang.Class<?> wildcardClass23 = doubleArray22.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(0.0d, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true, true);
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) (byte) 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        java.lang.Class<?> wildcardClass17 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
            java.lang.Number number15 = xYSeries1.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 10.0f, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(1, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries3.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries(comparable0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries20.clear();
        java.lang.Comparable comparable22 = xYSeries20.getKey();
        xYSeries20.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean30 = xYSeries20.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries20.remove(0);
        org.jfree.data.xy.XYSeries xYSeries35 = xYSeries20.createCopy((int) (byte) 0, 0);
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
        java.lang.String str58 = xYSeries37.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries37.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean62 = xYSeries37.getAutoSort();
        xYSeries37.setDescription("hi!");
        xYSeries37.add((java.lang.Number) (-1L), (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener72 = null;
        xYSeries71.addChangeListener(seriesChangeListener72);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries75.clear();
        xYSeries75.setMaximumItemCount((int) (byte) 10);
        xYSeries75.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list83 = xYSeries75.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener84 = null;
        xYSeries75.removeChangeListener(seriesChangeListener84);
        xYSeries75.add((double) 100.0f, 100.0d);
        boolean boolean89 = xYSeries75.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem91 = xYSeries75.remove((int) (byte) 1);
        xYSeries71.add(xYDataItem91);
        xYSeries37.add(xYDataItem91, false);
        boolean boolean95 = xYSeries35.equals((java.lang.Object) xYDataItem91);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem91);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0d + "'", comparable22, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries35);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(xYDataItem91);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.String str39 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1), (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Class<?> wildcardClass6 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.util.List list9 = xYSeries1.getItems();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = xYSeries3.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj13 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        xYSeries1.setMaximumItemCount((int) (byte) 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries10.add((java.lang.Number) 100, (java.lang.Number) 1.0d, true);
        int int16 = xYSeries10.indexOf((java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries10.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13);
        org.jfree.data.xy.XYDataItem xYDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.add(xYDataItem15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getX((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        xYSeries1.fireSeriesChanged();
        int int14 = xYSeries1.indexOf((java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 1, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        xYSeries1.add((double) 0L, (java.lang.Number) (-1));
        java.lang.Number number14 = xYSeries1.getY(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (-1.0f) + "'", number14, (-1.0f));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj13 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number64 = xYSeries3.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        java.util.List list20 = xYSeries1.getItems();
        java.lang.Comparable comparable21 = xYSeries1.getKey();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0d + "'", comparable21, 10.0d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 4, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getX(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, true, true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 4, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 4");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass2 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.getDataItem((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        xYSeries1.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0, true);
        xYSeries1.updateByIndex(1, (java.lang.Number) (-1));
        java.lang.Object obj18 = xYSeries1.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.fireSeriesChanged();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.lang.Class<?> wildcardClass9 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        int int15 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        xYSeries2.add((double) 0, (double) (byte) -1, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries2.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries2.getX((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        boolean boolean6 = xYSeries1.getAutoSort();
        java.lang.String str7 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0d + "'", comparable10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries1.addChangeListener(seriesChangeListener13);
        xYSeries1.add((double) 'a', (double) '#', true);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.util.List list4 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) (short) 0, true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries3.addOrUpdate((double) '#', (double) 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener63);
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
        org.junit.Assert.assertNull(xYDataItem62);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
            java.lang.Number number20 = xYSeries1.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
            xYSeries3.delete((-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        xYSeries2.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries2.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        java.lang.String str6 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (byte) 1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = xYSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (short) 100, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        int int4 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        boolean boolean9 = xYSeries1.getAutoSort();
        boolean boolean10 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (short) 100);
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
        int int99 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str3);
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
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 2147483647 + "'", int99 == 2147483647);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        int int24 = xYSeries22.getMaximumItemCount();
        xYSeries22.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries22.createCopy((int) (byte) 100, 2);
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
        xYSeries30.add(xYDataItem58, false);
        xYSeries30.clear();
        org.jfree.data.xy.XYSeries xYSeries65 = xYSeries30.createCopy((int) 'a', (int) (byte) 1);
        boolean boolean66 = xYSeries1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 10 + "'", comparable35, (short) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(xYSeries65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        xYSeries61.add((double) 100, (java.lang.Number) (byte) -1);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        xYSeries1.add(1.0d, (java.lang.Number) (-1.0f), true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries3.getDataItem((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
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
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries1.remove((java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        boolean boolean14 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        xYSeries23.fireSeriesChanged();
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        xYSeries1.setNotify(false);
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.lang.Class<?> wildcardClass34 = xYSeries23.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries3.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.util.List list77 = xYSeries16.data;
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
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        java.lang.Object obj15 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries1.removeChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((double) 0.0f, (double) 0L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) 1, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.Number number18 = xYSeries1.getY((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 1 + "'", number18, 1);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(10, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass24 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        xYSeries1.add((double) (short) 1, (java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        xYSeries1.add((double) '#', (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries1.getItems();
        xYSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries1.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0d + "'", comparable8, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        boolean boolean35 = xYSeries1.getNotify();
        java.lang.Object obj36 = xYSeries1.clone();
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) (byte) 100);
        java.lang.Class<?> wildcardClass40 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.add((double) 0.0f, (java.lang.Number) 100.0d, false);
        boolean boolean12 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.Comparable comparable24 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 10 + "'", comparable24, (short) 10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.setDescription("");
        xYSeries1.setMaximumItemCount((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        int int9 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        xYSeries3.add((double) (-2), (-1.0d));
        xYSeries3.add((double) (-5908509288197150436L), (double) 10L, false);
        xYSeries3.updateByIndex(0, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove((java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj9 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries21.clear();
        java.lang.String str23 = xYSeries21.getDescription();
        xYSeries21.add(10.0d, (java.lang.Number) (-1.0d));
        int int28 = xYSeries21.indexOf((java.lang.Number) (short) -1);
        java.util.List list29 = xYSeries21.getItems();
        xYSeries1.data = list29;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0d + "'", comparable19, 10.0d);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries5.clear();
        java.lang.Comparable comparable7 = xYSeries5.getKey();
        xYSeries5.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray11 = xYSeries5.toArray();
        java.util.List list12 = xYSeries5.getItems();
        xYSeries3.data = list12;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100.0f, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0d + "'", comparable7, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) -1, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries1.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.util.List list20 = xYSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries38.delete((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.String str39 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-2));
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        xYSeries12.setMaximumItemCount((int) (byte) 10);
        xYSeries12.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries12.clear();
        xYSeries12.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries24.clear();
        java.lang.String str26 = xYSeries24.getDescription();
        xYSeries24.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean31 = xYSeries24.equals((java.lang.Object) 2147483647);
        boolean boolean32 = xYSeries12.equals((java.lang.Object) 2147483647);
        java.lang.String str33 = xYSeries12.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries12.addOrUpdate((double) (short) -1, (-1.0d));
        boolean boolean37 = xYSeries12.getAutoSort();
        java.util.List list38 = xYSeries12.data;
        xYSeries1.data = list38;
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int9 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        java.lang.Object obj10 = xYSeries1.clone();
        xYSeries1.add((double) ' ', (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries9.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        xYSeries1.addPropertyChangeListener(propertyChangeListener29);
        java.lang.Number number32 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 100, number32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener9);
        xYSeries3.setNotify(false);
        double[][] doubleArray13 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
            java.lang.Number number20 = xYSeries3.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (-1L), (double) (-5908509288197150436L));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.delete(100, (int) (byte) 10);
        java.lang.Number number10 = xYSeries1.getY((int) (short) 0);
        org.junit.Assert.assertEquals("'" + number10 + "' != '" + (-1) + "'", number10, (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(0, number9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        xYSeries9.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries9.createCopy((int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries14.remove((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        boolean boolean10 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        xYSeries1.add((double) (short) 0, (java.lang.Number) 10.0d);
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Comparable comparable37 = xYSeries1.getKey();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10.0d + "'", comparable37, 10.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries16.clear();
        java.lang.Comparable comparable18 = xYSeries16.getKey();
        int int20 = xYSeries16.indexOf((java.lang.Number) 10);
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
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries24.remove(0);
        xYSeries16.add(xYDataItem83);
        xYSeries1.add(xYDataItem83);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0d + "'", comparable18, 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
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
        org.junit.Assert.assertNotNull(xYDataItem83);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.Class<?> wildcardClass37 = xYDataItem34.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        boolean boolean29 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        xYSeries21.clear();
        java.lang.String str23 = xYSeries21.getDescription();
        xYSeries21.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean28 = xYSeries21.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries30.clear();
        java.lang.String str32 = xYSeries30.getDescription();
        xYSeries30.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean37 = xYSeries30.equals((java.lang.Object) 2147483647);
        boolean boolean38 = xYSeries21.equals((java.lang.Object) xYSeries30);
        xYSeries21.fireSeriesChanged();
        xYSeries21.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries21.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries46.setNotify(true);
        java.lang.Number number50 = null;
        xYSeries46.add((double) (-1), number50);
        java.util.List list52 = xYSeries46.getItems();
        boolean boolean53 = xYSeries46.getAllowDuplicateXValues();
        boolean boolean54 = xYSeries46.getNotify();
        org.jfree.data.xy.XYSeries xYSeries57 = xYSeries46.createCopy(2147483647, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries57.addPropertyChangeListener(propertyChangeListener58);
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
        xYSeries57.add(xYDataItem87, true);
        xYSeries21.add(xYDataItem87);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(xYSeries57);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + (short) 10 + "'", comparable64, (short) 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-2) + "'", int69 == (-2));
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(xYDataItem87);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add((double) 10L, (double) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        double[][] doubleArray2 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        xYSeries17.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.updateByIndex((-2), (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries1.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 0.0d);
        boolean boolean14 = xYSeries1.getNotify();
        xYSeries1.clear();
        java.lang.Class<?> wildcardClass16 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Class<?> wildcardClass13 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries1.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (-1.0f), (double) (-1));
        java.util.List list13 = xYSeries1.getItems();
        xYSeries1.updateByIndex(0, (java.lang.Number) 10.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.addOrUpdate((double) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        xYSeries1.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        boolean boolean35 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries1.getDataItem((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.update((java.lang.Number) 2147483647, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2147483647");
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
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.util.List list77 = xYSeries16.getItems();
        xYSeries16.add((double) 100, (double) 0L);
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
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
            xYSeries1.update((java.lang.Number) (-1.0f), (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add(1.0d, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries18 = xYSeries1.createCopy(4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.Number number37 = null;
        xYSeries1.add((double) 1L, number37);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries(comparable0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries9.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, true, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.setDescription("");
        java.lang.String str14 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.getNotify();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.clear();
        java.lang.String str10 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        xYSeries3.setNotify(false);
        xYSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 0.0f, (java.lang.Number) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((double) (byte) 1, 0.0d);
        boolean boolean15 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, true);
        java.lang.Class<?> wildcardClass67 = xYSeries66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        int int4 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) -1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        java.lang.Class<?> wildcardClass13 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries56.delete((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
            org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries18.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 10 + "'", comparable19, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = xYSeries41.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.Class<?> wildcardClass34 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        boolean boolean61 = xYSeries1.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        xYSeries1.add((double) 2147483647, (double) (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass12 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYSeries1.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
            xYSeries49.delete((int) (byte) 1, 2147483647);
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries1.addOrUpdate((double) (short) 1, (double) (byte) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        boolean boolean13 = xYSeries1.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (short) 100, (int) (byte) 10);
        double[][] doubleArray17 = xYSeries16.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries16.updateByIndex(2, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        int int13 = xYSeries1.indexOf((java.lang.Number) 1);
        java.lang.String str14 = xYSeries1.getDescription();
        double[][] doubleArray15 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        java.util.List list5 = xYSeries3.data;
        int int6 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        xYSeries8.setMaximumItemCount((int) (byte) 10);
        xYSeries8.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries8.clear();
        java.util.List list17 = xYSeries8.data;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries8.removeChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries25.addChangeListener(seriesChangeListener26);
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
        xYSeries25.add(xYDataItem45);
        xYSeries8.add(xYDataItem45);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem45);
        java.lang.Number number50 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10L, number50);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries1.remove((java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        int int13 = xYSeries1.indexOf((java.lang.Number) 1);
        xYSeries1.add((double) (short) 1, (double) (short) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries1.getX(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        double[][] doubleArray10 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number13, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) 100.0d);
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean15 = xYSeries1.getAutoSort();
        java.lang.String str16 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        double[][] doubleArray32 = xYSeries1.toArray();
        java.lang.Class<?> wildcardClass33 = doubleArray32.getClass();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries2.remove((java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries14.remove((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        xYSeries68.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 0, false);
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries1.remove((java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYSeries10.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries1.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1L), (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
            java.lang.Number number54 = xYSeries1.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        xYSeries28.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        java.util.List list10 = xYSeries1.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) (short) 100, (int) (byte) -1);
        xYSeries13.clear();
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = xYSeries3.getX((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.String str15 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        int int13 = xYSeries1.indexOf((java.lang.Number) 1);
        xYSeries1.add((double) (byte) -1, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries10.updateByIndex((int) ' ', (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
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
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.add((double) 100.0f, 100.0d);
        double[][] doubleArray15 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries2.remove((java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        int int24 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) 1, (double) 10, false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove((java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries10.add((java.lang.Number) 100, (java.lang.Number) 1.0d, true);
        xYSeries10.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNull(xYDataItem43);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.String str27 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0d + "'", comparable15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        boolean boolean9 = xYSeries1.getAutoSort();
        boolean boolean10 = xYSeries1.getNotify();
        java.util.List list11 = xYSeries1.data;
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) 100.0f);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries3.getItemCount();
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        double[][] doubleArray5 = xYSeries3.toArray();
        java.lang.String str6 = xYSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        xYSeries6.add((double) (-1L), (double) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries6.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries1.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener7);
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 2, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Object obj9 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((-3), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries1.addChangeListener(seriesChangeListener19);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries22.clear();
        xYSeries22.setMaximumItemCount((int) (byte) 10);
        xYSeries22.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list30 = xYSeries22.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries22.removeChangeListener(seriesChangeListener31);
        boolean boolean34 = xYSeries22.equals((java.lang.Object) 1L);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries22.getDataItem(0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries52.remove((java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        java.lang.Class<?> wildcardClass15 = xYSeries14.getClass();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
            xYSeries1.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true, false);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries12.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Number number24 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number24, (java.lang.Number) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        int int11 = xYSeries1.indexOf((java.lang.Number) (short) 1);
        xYSeries1.fireSeriesChanged();
        xYSeries1.add((double) (-5908509288197150436L), 0.0d, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) (-1.0f), (double) (-1));
        java.util.List list13 = xYSeries1.getItems();
        java.lang.Comparable comparable14 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(2147483647, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0d + "'", comparable14, 10.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (-1.0f));
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 4, (double) (byte) 100);
        java.lang.Comparable comparable13 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0d + "'", comparable13, 10.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        xYSeries1.setDescription("");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem17, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries19.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        boolean boolean11 = xYSeries1.isEmpty();
        java.lang.String str12 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries1.delete(100, (int) (byte) 10);
        java.util.List list9 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, false, true);
        java.lang.String str32 = xYSeries31.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries1.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        int int31 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        java.util.List list5 = xYSeries1.data;
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) 2147483647, (java.lang.Number) (byte) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.lang.String str16 = xYSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.String str37 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        int int13 = xYSeries1.indexOf((java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.util.List list16 = xYSeries1.data;
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        xYSeries3.addPropertyChangeListener(propertyChangeListener66);
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
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        int int10 = xYSeries1.getMaximumItemCount();
        java.lang.String str11 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = xYSeries14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries18.updateByIndex((int) (byte) 100, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
            java.lang.Number number27 = xYSeries1.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 10 + "'", comparable18, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate(100.0d, (double) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.Class<?> wildcardClass60 = doubleArray59.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false);
        xYSeries2.setMaximumItemCount((int) 'a');
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
            org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries10.remove((java.lang.Number) 1);
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        boolean boolean10 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries12.clear();
        java.lang.String str14 = xYSeries12.getDescription();
        xYSeries12.add(10.0d, (java.lang.Number) (-1.0d));
        int int19 = xYSeries12.indexOf((java.lang.Number) (short) -1);
        boolean boolean20 = xYSeries12.getAutoSort();
        boolean boolean21 = xYSeries12.getNotify();
        java.util.List list22 = xYSeries12.data;
        xYSeries1.data = list22;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.lang.Class<?> wildcardClass4 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        xYSeries3.add((double) 2147483647, (double) (short) 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((double) 1L, (java.lang.Number) 10.0f);
        java.util.List list16 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.add((double) 2147483647, (double) (short) 10, true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        java.lang.Object obj10 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.getNotify();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (short) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries10.remove((java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries1.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries10.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
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
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Object obj85 = xYSeries84.clone();
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
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener72);
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        int int96 = xYSeries95.getMaximumItemCount();
        xYSeries95.setKey((java.lang.Comparable) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2147483647 + "'", int96 == 2147483647);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.String str10 = xYSeries8.getDescription();
        xYSeries8.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean15 = xYSeries8.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries17.clear();
        java.lang.String str19 = xYSeries17.getDescription();
        xYSeries17.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean24 = xYSeries17.equals((java.lang.Object) 2147483647);
        boolean boolean25 = xYSeries8.equals((java.lang.Object) xYSeries17);
        xYSeries8.fireSeriesChanged();
        xYSeries8.add((java.lang.Number) 1, (java.lang.Number) (-1));
        xYSeries8.setNotify(false);
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
        xYSeries8.add(xYDataItem74);
        xYSeries1.add(xYDataItem74);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0d + "'", comparable12, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getY((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        xYSeries1.setMaximumItemCount((int) (byte) 100);
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100L);
        xYSeries1.add((double) 0.0f, (double) 0L);
        java.lang.Object obj18 = xYSeries1.clone();
        int int20 = xYSeries1.indexOf((java.lang.Number) 100L);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3) + "'", int20 == (-3));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        xYSeries1.setMaximumItemCount(3);
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
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.addChangeListener(seriesChangeListener2);
        xYSeries1.clear();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        xYSeries1.fireSeriesChanged();
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        xYSeries2.add((double) 2147483647, (java.lang.Number) 0.0f);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries3.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries1.createCopy((int) (byte) 0, 0);
        boolean boolean17 = xYSeries1.getAllowDuplicateXValues();
        int int18 = xYSeries1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        int int5 = xYSeries1.indexOf((java.lang.Number) 10);
        xYSeries1.add((double) 10L, (java.lang.Number) 0.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        int int5 = xYSeries1.indexOf((java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) (-2));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + number41 + "' != '" + 100.0d + "'", number41, 100.0d);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNull(xYDataItem45);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        java.lang.String str7 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        xYSeries1.add((double) '#', (double) 10L);
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        boolean boolean34 = xYSeries1.getNotify();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) 100.0f, (double) (byte) 10, false);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 1L);
        boolean boolean12 = xYSeries3.getAutoSort();
        boolean boolean13 = xYSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getY(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        int int8 = xYSeries1.indexOf((java.lang.Number) (byte) -1);
        java.util.List list9 = xYSeries1.data;
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        boolean boolean59 = xYSeries1.getAutoSort();
        double[][] doubleArray60 = xYSeries1.toArray();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.Class<?> wildcardClass31 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        java.util.List list4 = xYSeries1.getItems();
        boolean boolean5 = xYSeries1.getNotify();
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 1, (double) (-1L));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0d + "'", comparable6, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0d + "'", comparable7, 10.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        boolean boolean35 = xYSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries1.addChangeListener(seriesChangeListener36);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYSeries10.getX((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.Number number42 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number42, (java.lang.Number) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false, true);
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries72.addOrUpdate((double) 10L, (double) (-1.0f));
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
        org.junit.Assert.assertNull(xYDataItem75);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true);
        xYSeries2.setNotify(false);
        boolean boolean5 = xYSeries2.isEmpty();
        java.util.List list6 = xYSeries2.getItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 0, (double) ' ');
        xYSeries3.setDescription("");
        xYSeries3.delete((int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        java.util.List list5 = xYSeries3.data;
        java.lang.Class<?> wildcardClass6 = xYSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Number number24 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number24, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries17.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYDataItem15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries1.addOrUpdate((double) (-1), (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 3, false);
        boolean boolean17 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries1.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries1.clear();
        xYSeries1.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy((int) (short) 100, (-1));
        java.lang.Object obj15 = xYSeries1.clone();
        java.lang.String str16 = xYSeries1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.Class<?> wildcardClass12 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, true, false);
        boolean boolean4 = xYSeries3.getNotify();
        boolean boolean5 = xYSeries3.getAllowDuplicateXValues();
        int int6 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
            org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries56.remove((java.lang.Number) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        xYSeries1.add((java.lang.Number) (-1L), (java.lang.Number) (byte) 0, true);
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), true, true);
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        boolean boolean7 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100, true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries12.updateByIndex((int) (byte) 100, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries1.remove((java.lang.Number) (short) -1);
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        int int10 = xYSeries1.getItemCount();
        xYSeries1.setKey((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        int int13 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-3), (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        java.util.List list5 = xYSeries3.data;
        int int6 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        xYSeries8.setMaximumItemCount((int) (byte) 10);
        xYSeries8.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        xYSeries8.clear();
        java.util.List list17 = xYSeries8.data;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries8.removeChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries25.addChangeListener(seriesChangeListener26);
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
        xYSeries25.add(xYDataItem45);
        xYSeries8.add(xYDataItem45);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem45);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.add((double) (-3), (java.lang.Number) 0L, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries60.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = xYSeries3.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (short) 100);
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
        int int99 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(str3);
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
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 3 + "'", int99 == 3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.String str66 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (short) 10 + "'", comparable36, (short) 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2) + "'", int41 == (-2));
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(xYDataItem59);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
            java.lang.Number number20 = xYSeries1.getY((int) (short) 10);
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries2.addPropertyChangeListener(propertyChangeListener3);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries1.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries4.clear();
        xYSeries4.setMaximumItemCount((int) (byte) 10);
        xYSeries4.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list12 = xYSeries4.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries4.removeChangeListener(seriesChangeListener13);
        xYSeries4.add((double) 100.0f, 100.0d);
        boolean boolean18 = xYSeries4.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries4.remove((int) (byte) 1);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem20);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries1.indexOf((java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
            xYSeries1.add((java.lang.Number) 0, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries8.clear();
        java.lang.String str10 = xYSeries8.getDescription();
        xYSeries8.add((double) 100.0f, (double) 1L, false);
        xYSeries8.setNotify(true);
        boolean boolean18 = xYSeries8.equals((java.lang.Object) 100.0d);
        xYSeries8.add((java.lang.Number) 10.0f, (java.lang.Number) 0L);
        boolean boolean22 = xYSeries8.isEmpty();
        java.util.List list23 = xYSeries8.getItems();
        boolean boolean24 = xYSeries1.equals((java.lang.Object) list23);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.addOrUpdate((java.lang.Number) 10.0f, (java.lang.Number) (short) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0d + "'", comparable5, 10.0d);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        boolean boolean8 = xYSeries1.equals((java.lang.Object) 2147483647);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) -1);
        int int13 = xYSeries1.indexOf((java.lang.Number) (-1L));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 100, 2);
        java.util.List list10 = xYSeries1.getItems();
        boolean boolean11 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.addOrUpdate((double) 0L, (double) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        xYSeries1.add((double) 2, (double) (byte) -1, false);
        java.lang.Number number12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number12, (java.lang.Number) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        int int10 = xYSeries1.indexOf((java.lang.Number) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 3, false);
        java.lang.Class<?> wildcardClass17 = xYSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        xYSeries1.add((double) (-1L), (java.lang.Number) (-1.0f), true);
        java.util.List list9 = xYSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        xYSeries1.setNotify(true);
        java.lang.Object obj14 = xYSeries1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries1.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setDescription("hi!");
        xYSeries1.add((double) (byte) 100, (java.lang.Number) (short) 100);
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
        java.util.List list99 = xYSeries1.getItems();
        org.junit.Assert.assertNull(str3);
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
        org.junit.Assert.assertNotNull(list99);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((double) 100, 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries1.getX(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        boolean boolean4 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray5 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries9.update((java.lang.Number) (byte) 100, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.lang.Class<?> wildcardClass23 = xYSeries10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        int int3 = xYSeries1.getMaximumItemCount();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) 0.0d);
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0d);
        xYSeries1.add((double) '#', (double) 10L);
        java.lang.String str13 = xYSeries1.getDescription();
        xYSeries1.add((double) 2, (double) 2);
        xYSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries10.add((java.lang.Number) 100, (java.lang.Number) 1.0d, true);
        int int16 = xYSeries10.indexOf((java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries10.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.setNotify(false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, false, false);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) false);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove(0);
        xYSeries1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries1.addOrUpdate((double) (-3), (double) (-2));
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(xYDataItem13);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        xYSeries3.add((java.lang.Number) 2, (java.lang.Number) (byte) 10, false);
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        xYSeries1.add((double) (-1), (double) (byte) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 10 + "'", comparable11, (short) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        xYSeries1.add((double) (byte) 0, (java.lang.Number) 2147483647, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries1.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        xYSeries1.add((double) 0, (java.lang.Number) (short) 1, false);
        boolean boolean63 = xYSeries1.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) '4', (int) (short) 10);
        boolean boolean7 = xYSeries6.isEmpty();
        java.lang.Comparable comparable8 = xYSeries6.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10.0d + "'", comparable3, 10.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0d + "'", comparable8, 10.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries1.removeChangeListener(seriesChangeListener35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = xYSeries1.getY((int) (short) 100);
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.add((double) 4, (double) 10.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0d + "'", comparable9, 10.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries28.update((java.lang.Number) 0L, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        double[][] doubleArray23 = xYSeries1.toArray();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        xYSeries1.add((double) 1, (java.lang.Number) 0, false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add(10.0d, (java.lang.Number) (-1.0d));
        xYSeries1.add((java.lang.Number) 100.0d, (java.lang.Number) 1.0d);
        int int10 = xYSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) 0.0f);
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setKey(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries46.addPropertyChangeListener(propertyChangeListener52);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries46.update((java.lang.Number) 100.0d, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.util.List list20 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.setNotify(true);
        java.lang.Number number5 = null;
        xYSeries1.add((double) (-1), number5);
        java.util.List list7 = xYSeries1.getItems();
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries1.createCopy(2147483647, (int) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, false, true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.add((double) 100.0f, (double) 1L, false);
        xYSeries1.setNotify(true);
        boolean boolean10 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries1.createCopy((int) 'a', (int) '4');
        xYSeries10.add((java.lang.Number) 100, (java.lang.Number) 1.0d, true);
        boolean boolean15 = xYSeries10.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        xYSeries1.add((double) ' ', (java.lang.Number) (byte) 10);
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-1));
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
}

