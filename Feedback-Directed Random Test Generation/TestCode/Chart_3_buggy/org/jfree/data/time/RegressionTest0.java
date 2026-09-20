package org.jfree.data.time;

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
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Time" + "'", str0, "Time");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod13, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_RANGE_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Value" + "'", str0, "Value");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod15, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(10, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries3.addOrUpdate(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries3.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries3.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries5.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getRawDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod4, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection8 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries3.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getRawDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries10.addOrUpdate(regularTimePeriod29, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries1.addOrUpdate(regularTimePeriod31, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.getRawDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Class class14 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        int int6 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod32, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        timeSeries3.data = list25;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod28, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        java.lang.Number number34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod33, number34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        timeSeries3.data = list25;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = timeSeries3.getIndex(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries3.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = timeSeries3.getIndex(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries18.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod32, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        timeSeries9.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries9.addOrUpdate(regularTimePeriod13, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries3.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemAge((long) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries17.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries17.addOrUpdate(timeSeriesDataItem28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getRawDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(regularTimePeriod8, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.update((int) (byte) 0, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) 'a', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        java.util.Collection collection14 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.util.Collection collection32 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod33, (double) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod32, (double) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries30.getDataItem(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod4, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        boolean boolean15 = timeSeries14.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod16, (java.lang.Number) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double41 = timeSeries40.getMaxY();
        java.util.List list42 = timeSeries40.data;
        timeSeries35.data = list42;
        java.util.List list44 = timeSeries35.getItems();
        timeSeries3.data = list44;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries48 = timeSeries3.createCopy(regularTimePeriod46, regularTimePeriod47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries1.getRawDataItem(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod35, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod32, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries3.createCopy((int) (byte) 10, (int) ' ');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries3.addOrUpdate(timeSeriesDataItem50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries3.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod15, (double) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod2, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getRawDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        double double31 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries1.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.lang.Object obj5 = timeSeries3.clone();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = timeSeries27.getValue(regularTimePeriod47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getRawDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        boolean boolean29 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        double double24 = timeSeries3.getMinY();
        double double25 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getRawDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        java.util.List list26 = timeSeries24.data;
        timeSeries19.data = list26;
        java.lang.Class class28 = timeSeries19.getTimePeriodClass();
        java.lang.Class class29 = timeSeries19.getTimePeriodClass();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        java.util.List list41 = timeSeries39.data;
        timeSeries34.data = list41;
        java.lang.Class class43 = timeSeries34.getTimePeriodClass();
        java.lang.Class class44 = timeSeries34.getTimePeriodClass();
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries19.addAndOrUpdate(timeSeries34);
        java.util.List list47 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries19.data = list60;
        timeSeries3.data = list60;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem63 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        int int6 = timeSeries3.getItemCount();
        timeSeries3.setKey((java.lang.Comparable) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        timeSeries14.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.addAndOrUpdate(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries10.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.timePeriodClass;
        timeSeries24.setKey((java.lang.Comparable) 0);
        java.util.List list37 = timeSeries24.getItems();
        java.lang.Class<?> wildcardClass38 = list37.getClass();
        timeSeries10.timePeriodClass = wildcardClass38;
        double double40 = timeSeries10.getMaxY();
        boolean boolean41 = timeSeries3.equals((java.lang.Object) double40);
        double double42 = timeSeries3.getMinY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 0, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        timeSeries9.setDomainDescription("Time");
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries9.addOrUpdate(regularTimePeriod14, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (double) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        int int18 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries3.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection8 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setMaximumItemAge((long) (short) 0);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        timeSeries1.setDescription("Time");
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getRawDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '4', (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries1.getRangeDescription();
        java.lang.String str13 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries3.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        timeSeries9.setDomainDescription("Time");
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        java.lang.Class class14 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries9.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        double double31 = timeSeries1.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod32, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        int int15 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, Double.NaN, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (double) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getRawDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        boolean boolean15 = timeSeries14.getNotify();
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long21 = timeSeries20.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        java.util.List list32 = timeSeries30.data;
        timeSeries25.data = list32;
        java.util.List list34 = timeSeries25.getItems();
        java.lang.Class<?> wildcardClass35 = timeSeries25.getClass();
        timeSeries20.timePeriodClass = wildcardClass35;
        timeSeries14.timePeriodClass = wildcardClass35;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.delete((-1), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.lang.Object obj5 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getRawDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        java.lang.Object obj7 = timeSeries3.clone();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) -1 + "'", comparable8, (short) -1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0.0", "Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double41 = timeSeries40.getMaxY();
        java.util.List list42 = timeSeries40.data;
        timeSeries35.data = list42;
        java.util.List list44 = timeSeries35.getItems();
        timeSeries3.data = list44;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries17.getDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setDescription("Overwritten values from: 0.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries3.createCopy(regularTimePeriod18, regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(regularTimePeriod2, regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        double double33 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries3.addOrUpdate(timeSeriesDataItem34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries3.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        int int11 = timeSeries9.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update(regularTimePeriod12, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        long long8 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        timeSeries46.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.add(regularTimePeriod48, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        timeSeries1.removeAgedItems((long) (byte) 1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries1.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        timeSeries3.setRangeDescription("Overwritten values from: 0.0");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod26, 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        boolean boolean18 = timeSeries3.getNotify();
        java.lang.Object obj19 = timeSeries3.clone();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        boolean boolean9 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("hi!");
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        java.util.List list20 = timeSeries18.data;
        timeSeries13.data = list20;
        java.lang.Class class22 = timeSeries13.timePeriodClass;
        timeSeries13.fireSeriesChanged();
        java.util.Collection collection24 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(10, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries3.getDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.addOrUpdate(regularTimePeriod6, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        boolean boolean18 = timeSeries3.getNotify();
        java.lang.Object obj19 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod21, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        double double31 = timeSeries1.getMaxY();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        java.util.List list40 = timeSeries39.getItems();
        timeSeries39.setKey((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries39.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        java.lang.String str18 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getRawDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long22 = timeSeries21.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        java.util.List list33 = timeSeries31.data;
        timeSeries26.data = list33;
        java.util.List list35 = timeSeries26.getItems();
        java.lang.Class<?> wildcardClass36 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass36;
        timeSeries3.timePeriodClass = wildcardClass36;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = timeSeries3.getIndex(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(regularTimePeriod5, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(regularTimePeriod5, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        int int11 = timeSeries9.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries9.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        java.lang.Comparable comparable24 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries3.getRawDataItem(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) -1 + "'", comparable24, (short) -1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod19, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries1.getRangeDescription();
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries1.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemAge((long) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        double double24 = timeSeries3.getMinY();
        java.lang.Object obj25 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod26, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        timeSeries46.fireSeriesChanged();
        boolean boolean48 = timeSeries46.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries46.getDataItem(regularTimePeriod49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        timeSeries3.setRangeDescription("Overwritten values from: 0.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        timeSeries1.removeAgedItems((long) (byte) 1, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        int int18 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getRawDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        java.util.List list26 = timeSeries24.data;
        timeSeries19.data = list26;
        java.lang.Class class28 = timeSeries19.getTimePeriodClass();
        java.lang.Class class29 = timeSeries19.getTimePeriodClass();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        java.util.List list41 = timeSeries39.data;
        timeSeries34.data = list41;
        java.lang.Class class43 = timeSeries34.getTimePeriodClass();
        java.lang.Class class44 = timeSeries34.getTimePeriodClass();
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries19.addAndOrUpdate(timeSeries34);
        java.util.List list47 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries19.data = list60;
        timeSeries3.data = list60;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries3.getRawDataItem(regularTimePeriod63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getRawDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        java.lang.Comparable comparable35 = timeSeries24.getKey();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double45 = timeSeries44.getMaxY();
        java.util.List list46 = timeSeries44.data;
        timeSeries39.data = list46;
        java.lang.Class class48 = timeSeries39.getTimePeriodClass();
        java.lang.Class class49 = timeSeries39.getTimePeriodClass();
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries24.addAndOrUpdate(timeSeries39);
        java.lang.String str52 = timeSeries24.getDescription();
        timeSeries24.clear();
        timeSeries24.removeAgedItems(true);
        boolean boolean56 = timeSeries3.equals((java.lang.Object) timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries59 = timeSeries24.createCopy(regularTimePeriod57, regularTimePeriod58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) -1 + "'", comparable35, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertNull(class49);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries3.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.lang.Object obj5 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.removeAgedItems((long) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeries3.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries13.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries13.removeChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double23 = timeSeries22.getMaxY();
        java.util.List list24 = timeSeries22.data;
        timeSeries13.data = list24;
        timeSeries13.setMaximumItemAge((long) '#');
        boolean boolean28 = timeSeries13.getNotify();
        java.lang.Object obj29 = timeSeries13.clone();
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.addAndOrUpdate(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries3.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener20);
        boolean boolean22 = timeSeries3.getNotify();
        java.lang.Class<?> wildcardClass23 = timeSeries3.getClass();
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries27.getRawDataItem(regularTimePeriod47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.util.Collection collection32 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (java.lang.Number) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) 1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        timeSeries3.setRangeDescription("Overwritten values from: 0.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries3.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.lang.String str16 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) -1, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setDescription("Overwritten values from: 0.0");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries5.addOrUpdate(regularTimePeriod10, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        double double10 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries3.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj8 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getRawDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        int int7 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        java.lang.Comparable comparable47 = timeSeries46.getKey();
        timeSeries46.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.update(100, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + "Overwritten values from: 0" + "'", comparable47, "Overwritten values from: 0");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries3.getValue(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries3.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.util.Collection collection32 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries3.addOrUpdate(regularTimePeriod33, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getRawDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeSeries3.getIndex(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double14 = timeSeries13.getMaxY();
        java.util.List list15 = timeSeries13.data;
        timeSeries8.data = list15;
        java.util.List list17 = timeSeries8.getItems();
        java.lang.Class<?> wildcardClass18 = timeSeries8.getClass();
        timeSeries3.timePeriodClass = wildcardClass18;
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries3.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        java.util.List list26 = timeSeries24.data;
        timeSeries19.data = list26;
        java.lang.Class class28 = timeSeries19.getTimePeriodClass();
        java.lang.Class class29 = timeSeries19.getTimePeriodClass();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        java.util.List list41 = timeSeries39.data;
        timeSeries34.data = list41;
        java.lang.Class class43 = timeSeries34.getTimePeriodClass();
        java.lang.Class class44 = timeSeries34.getTimePeriodClass();
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries19.addAndOrUpdate(timeSeries34);
        java.util.List list47 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries19.data = list60;
        timeSeries3.data = list60;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem65 = timeSeries3.addOrUpdate(regularTimePeriod63, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        java.util.List list40 = timeSeries39.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries39.getRawDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries54.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries54.removeChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries54.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        java.util.List list65 = timeSeries63.data;
        timeSeries54.data = list65;
        timeSeries54.setMaximumItemAge((long) '#');
        timeSeries54.removeAgedItems((long) (short) 100, true);
        boolean boolean72 = timeSeries9.equals((java.lang.Object) timeSeries54);
        boolean boolean73 = timeSeries54.getNotify();
        int int74 = timeSeries54.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries54.update(0, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        timeSeries1.setDescription("Time");
        timeSeries1.setDescription("Time");
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries17.addChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries17.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = timeSeries17.getValue(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.removeAgedItems((long) (short) 0, false);
        int int32 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod33, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries13.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries13.removeChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double23 = timeSeries22.getMaxY();
        java.util.List list24 = timeSeries22.data;
        timeSeries13.data = list24;
        timeSeries13.setMaximumItemAge((long) '#');
        boolean boolean28 = timeSeries13.getNotify();
        java.lang.Object obj29 = timeSeries13.clone();
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries13.addOrUpdate(regularTimePeriod32, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Overwritten values from: 0.0", "Time");
        java.lang.Class class4 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setMaximumItemAge((long) (short) 0);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        timeSeries14.setNotify(true);
        java.lang.Object obj17 = timeSeries14.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries14.getRawDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        double double9 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getRawDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getRawDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        int int8 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(2147483647, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(regularTimePeriod2, regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.lang.String str4 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries3.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        java.util.List list16 = timeSeries14.data;
        timeSeries9.data = list16;
        java.lang.Class class18 = timeSeries9.getTimePeriodClass();
        java.lang.Class class19 = timeSeries9.getTimePeriodClass();
        java.lang.Comparable comparable20 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries9.addAndOrUpdate(timeSeries24);
        java.util.List list37 = timeSeries9.getItems();
        java.util.Collection collection38 = timeSeries9.getTimePeriods();
        timeSeries9.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        java.util.List list16 = timeSeries14.data;
        timeSeries9.data = list16;
        java.lang.Class class18 = timeSeries9.getTimePeriodClass();
        java.lang.Class class19 = timeSeries9.getTimePeriodClass();
        java.lang.Comparable comparable20 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries9.addAndOrUpdate(timeSeries24);
        java.util.List list37 = timeSeries9.getItems();
        java.util.Collection collection38 = timeSeries9.getTimePeriods();
        timeSeries9.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries3.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = timeSeries41.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries35.setDomainDescription("");
        java.lang.String str38 = timeSeries35.getDomainDescription();
        java.util.List list39 = timeSeries35.data;
        timeSeries3.data = list39;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = timeSeries3.getIndex(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        java.lang.Object obj8 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        long long14 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries3.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        java.util.List list12 = timeSeries10.data;
        timeSeries5.data = list12;
        java.lang.Class class14 = timeSeries5.getTimePeriodClass();
        java.lang.Class class15 = timeSeries5.getTimePeriodClass();
        java.lang.Comparable comparable16 = timeSeries5.getKey();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        java.util.List list27 = timeSeries25.data;
        timeSeries20.data = list27;
        java.lang.Class class29 = timeSeries20.getTimePeriodClass();
        java.lang.Class class30 = timeSeries20.getTimePeriodClass();
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries5.addAndOrUpdate(timeSeries20);
        java.lang.String str33 = timeSeries5.getDescription();
        timeSeries5.clear();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries38.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries5.addAndOrUpdate(timeSeries38);
        java.util.List list42 = timeSeries38.getItems();
        timeSeries1.data = list42;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) -1 + "'", comparable16, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem51, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        double double24 = timeSeries3.getMinY();
        java.lang.Object obj25 = timeSeries3.clone();
        timeSeries3.removeAgedItems((long) (short) 0, true);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.createCopy((int) (byte) 0, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries3.getValue(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        long long20 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.getRawDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        double double10 = timeSeries3.getMinY();
        int int11 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.createCopy(10, (int) (short) 10);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries3.getDataItem(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        java.lang.Class class20 = timeSeries3.getTimePeriodClass();
        boolean boolean21 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(1, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        timeSeries3.setKey((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        timeSeries20.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable25 = timeSeries24.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries3.addAndOrUpdate(timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries26.getRawDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Overwritten values from: 0.0" + "'", comparable25, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries12.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries12.removeChangeListener(seriesChangeListener15);
        timeSeries12.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener18);
        timeSeries12.fireSeriesChanged();
        java.util.Collection collection21 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.String str22 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod23, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        java.lang.Class class12 = timeSeries9.timePeriodClass;
        timeSeries9.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries18.setDomainDescription("");
        java.lang.String str21 = timeSeries18.getDomainDescription();
        java.util.List list22 = timeSeries18.data;
        timeSeries9.data = list22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries9.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) -1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        java.lang.String str51 = timeSeries9.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod52, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        timeSeries1.fireSeriesChanged();
        java.lang.String str3 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        timeSeries3.setRangeDescription("Overwritten values from: 0.0");
        timeSeries3.removeAgedItems(true);
        java.util.List list8 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries54.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries54.removeChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries54.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        java.util.List list65 = timeSeries63.data;
        timeSeries54.data = list65;
        timeSeries54.setMaximumItemAge((long) '#');
        timeSeries54.removeAgedItems((long) (short) 100, true);
        boolean boolean72 = timeSeries9.equals((java.lang.Object) timeSeries54);
        boolean boolean73 = timeSeries54.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries54.delete((int) '4', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.lang.String str4 = timeSeries3.getDescription();
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries3.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.lang.Object obj5 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries54.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries54.removeChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries54.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        java.util.List list65 = timeSeries63.data;
        timeSeries54.data = list65;
        timeSeries54.setMaximumItemAge((long) '#');
        timeSeries54.removeAgedItems((long) (short) 100, true);
        boolean boolean72 = timeSeries9.equals((java.lang.Object) timeSeries54);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = timeSeries54.getRawDataItem(regularTimePeriod73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries1.getRangeDescription();
        java.lang.String str13 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries1.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getRawDataItem(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        boolean boolean9 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries36.removeChangeListener(seriesChangeListener40);
        timeSeries36.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries36.delete(regularTimePeriod43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod17, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries5.addOrUpdate(regularTimePeriod10, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        java.util.List list16 = timeSeries14.data;
        timeSeries9.data = list16;
        java.lang.Class class18 = timeSeries9.getTimePeriodClass();
        java.lang.Class class19 = timeSeries9.getTimePeriodClass();
        java.lang.Comparable comparable20 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries9.addAndOrUpdate(timeSeries24);
        java.util.List list37 = timeSeries9.getItems();
        java.util.Collection collection38 = timeSeries9.getTimePeriods();
        timeSeries9.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries3.addAndOrUpdate(timeSeries9);
        timeSeries41.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double48 = timeSeries47.getMaxY();
        java.util.List list49 = timeSeries47.data;
        timeSeries47.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double55 = timeSeries54.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double60 = timeSeries59.getMaxY();
        java.util.List list61 = timeSeries59.data;
        timeSeries54.data = list61;
        java.lang.Class class63 = timeSeries54.getTimePeriodClass();
        java.lang.Class class64 = timeSeries54.timePeriodClass;
        timeSeries54.setKey((java.lang.Comparable) 0);
        java.util.List list67 = timeSeries54.getItems();
        timeSeries54.removeAgedItems(true);
        timeSeries54.removeAgedItems(false);
        java.util.Collection collection72 = timeSeries47.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        timeSeries47.removeAgedItems((long) (short) 0, false);
        int int76 = timeSeries47.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double81 = timeSeries80.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries85 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double86 = timeSeries85.getMaxY();
        java.util.List list87 = timeSeries85.data;
        timeSeries80.data = list87;
        java.lang.Class class89 = timeSeries80.getTimePeriodClass();
        java.lang.Class class90 = timeSeries80.timePeriodClass;
        java.util.List list91 = timeSeries80.getItems();
        timeSeries47.data = list91;
        timeSeries41.data = list91;
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNull(class63);
        org.junit.Assert.assertNull(class64);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNull(class89);
        org.junit.Assert.assertNull(class90);
        org.junit.Assert.assertNotNull(list91);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        boolean boolean18 = timeSeries3.getNotify();
        java.lang.Object obj19 = timeSeries3.clone();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems(100L, false);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        java.lang.Class class12 = timeSeries9.timePeriodClass;
        timeSeries9.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries18.setDomainDescription("");
        java.lang.String str21 = timeSeries18.getDomainDescription();
        java.util.List list22 = timeSeries18.data;
        timeSeries9.data = list22;
        timeSeries9.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries9.getRawDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        timeSeries1.setDomainDescription("");
        java.util.List list17 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries1.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.lang.String str4 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.addOrUpdate(regularTimePeriod32, (java.lang.Number) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.getRawDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        java.lang.Comparable comparable35 = timeSeries24.getKey();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double45 = timeSeries44.getMaxY();
        java.util.List list46 = timeSeries44.data;
        timeSeries39.data = list46;
        java.lang.Class class48 = timeSeries39.getTimePeriodClass();
        java.lang.Class class49 = timeSeries39.getTimePeriodClass();
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries24.addAndOrUpdate(timeSeries39);
        java.lang.String str52 = timeSeries24.getDescription();
        timeSeries24.clear();
        timeSeries24.removeAgedItems(true);
        boolean boolean56 = timeSeries3.equals((java.lang.Object) timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number58 = timeSeries24.getValue(regularTimePeriod57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) -1 + "'", comparable35, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertNull(class49);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double8 = timeSeries7.getMaxY();
        java.util.List list9 = timeSeries7.data;
        timeSeries3.data = list9;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries14.getMinY();
        long long16 = timeSeries14.getMaximumItemAge();
        timeSeries14.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod18, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        java.util.List list40 = timeSeries39.getItems();
        java.lang.Class class41 = timeSeries39.timePeriodClass;
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries39.add(regularTimePeriod43, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNull(class41);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int26 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        double double24 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        timeSeries32.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries28.addAndOrUpdate(timeSeries32);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries28.removeChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double48 = timeSeries47.getMaxY();
        java.util.List list49 = timeSeries47.data;
        timeSeries42.data = list49;
        java.lang.Class class51 = timeSeries42.getTimePeriodClass();
        java.lang.Class class52 = timeSeries42.timePeriodClass;
        timeSeries42.setKey((java.lang.Comparable) 0);
        java.util.List list55 = timeSeries42.getItems();
        java.lang.Class<?> wildcardClass56 = list55.getClass();
        timeSeries28.timePeriodClass = wildcardClass56;
        timeSeries28.setDescription("Time");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod61, (double) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNull(class51);
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries14.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update((int) (byte) 100, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        timeSeries9.setDomainDescription("Time");
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0", "Overwritten values from: 0.0");
        boolean boolean18 = timeSeries9.equals((java.lang.Object) timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries17.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(10, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        int int18 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge(10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.getRawDataItem(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.createCopy(10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries3.getRawDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        timeSeries3.removeAgedItems(0L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod12, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (double) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        java.lang.Comparable comparable35 = timeSeries24.getKey();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double45 = timeSeries44.getMaxY();
        java.util.List list46 = timeSeries44.data;
        timeSeries39.data = list46;
        java.lang.Class class48 = timeSeries39.getTimePeriodClass();
        java.lang.Class class49 = timeSeries39.getTimePeriodClass();
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries24.addAndOrUpdate(timeSeries39);
        java.lang.String str52 = timeSeries24.getDescription();
        timeSeries24.clear();
        timeSeries24.removeAgedItems(true);
        boolean boolean56 = timeSeries3.equals((java.lang.Object) timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem59 = timeSeries24.addOrUpdate(regularTimePeriod57, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) -1 + "'", comparable35, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertNull(class49);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) 10);
        int int11 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        int int18 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries36.removeChangeListener(seriesChangeListener40);
        long long42 = timeSeries36.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries36.getRawDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("hi!");
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        java.util.List list20 = timeSeries18.data;
        timeSeries13.data = list20;
        java.lang.Class class22 = timeSeries13.timePeriodClass;
        timeSeries13.fireSeriesChanged();
        java.util.Collection collection24 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries27 = timeSeries13.createCopy(regularTimePeriod25, regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.lang.String str4 = timeSeries3.getDescription();
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.getTimePeriodClass();
        java.lang.Comparable comparable21 = timeSeries10.getKey();
        timeSeries10.fireSeriesChanged();
        boolean boolean23 = timeSeries3.equals((java.lang.Object) timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod24, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (short) -1 + "'", comparable21, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.createCopy(10, (int) (short) 10);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        java.util.List list16 = timeSeries14.data;
        timeSeries9.data = list16;
        java.lang.Class class18 = timeSeries9.getTimePeriodClass();
        java.lang.Class class19 = timeSeries9.getTimePeriodClass();
        java.lang.Comparable comparable20 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        java.util.List list31 = timeSeries29.data;
        timeSeries24.data = list31;
        java.lang.Class class33 = timeSeries24.getTimePeriodClass();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries9.addAndOrUpdate(timeSeries24);
        java.util.List list37 = timeSeries9.getItems();
        java.util.Collection collection38 = timeSeries9.getTimePeriods();
        timeSeries9.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries3.addAndOrUpdate(timeSeries9);
        timeSeries41.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries41.add(regularTimePeriod44, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) -1 + "'", comparable20, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        timeSeries3.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries3.createCopy((int) (byte) 10, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries49.addOrUpdate(regularTimePeriod50, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        boolean boolean15 = timeSeries14.getNotify();
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long21 = timeSeries20.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        java.util.List list32 = timeSeries30.data;
        timeSeries25.data = list32;
        java.util.List list34 = timeSeries25.getItems();
        java.lang.Class<?> wildcardClass35 = timeSeries25.getClass();
        timeSeries20.timePeriodClass = wildcardClass35;
        timeSeries14.timePeriodClass = wildcardClass35;
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double46 = timeSeries45.getMaxY();
        timeSeries45.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries41.addAndOrUpdate(timeSeries45);
        timeSeries49.setDescription("");
        java.lang.Class class52 = timeSeries49.timePeriodClass;
        timeSeries49.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries58.setDomainDescription("");
        java.lang.String str61 = timeSeries58.getDomainDescription();
        java.util.List list62 = timeSeries58.data;
        timeSeries49.data = list62;
        timeSeries49.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries14.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number68 = timeSeries66.getValue(regularTimePeriod67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(timeSeries66);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) -1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.createCopy((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        boolean boolean15 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries3.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        boolean boolean19 = timeSeries3.isEmpty();
        int int20 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries3.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double8 = timeSeries7.getMaxY();
        timeSeries7.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries11.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double18 = timeSeries17.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double23 = timeSeries22.getMaxY();
        java.util.List list24 = timeSeries22.data;
        timeSeries17.data = list24;
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries17.createCopy((int) (short) 1, (int) '#');
        boolean boolean29 = timeSeries28.getNotify();
        java.util.Collection collection30 = timeSeries28.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long35 = timeSeries34.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double45 = timeSeries44.getMaxY();
        java.util.List list46 = timeSeries44.data;
        timeSeries39.data = list46;
        java.util.List list48 = timeSeries39.getItems();
        java.lang.Class<?> wildcardClass49 = timeSeries39.getClass();
        timeSeries34.timePeriodClass = wildcardClass49;
        timeSeries28.timePeriodClass = wildcardClass49;
        timeSeries11.timePeriodClass = wildcardClass49;
        java.util.Collection collection53 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries11.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.lang.String str10 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double41 = timeSeries40.getMaxY();
        java.util.List list42 = timeSeries40.data;
        timeSeries35.data = list42;
        java.util.List list44 = timeSeries35.getItems();
        timeSeries3.data = list44;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long22 = timeSeries21.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        java.util.List list33 = timeSeries31.data;
        timeSeries26.data = list33;
        java.util.List list35 = timeSeries26.getItems();
        java.lang.Class<?> wildcardClass36 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass36;
        timeSeries3.timePeriodClass = wildcardClass36;
        timeSeries3.setKey((java.lang.Comparable) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries3.getDataItem(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.lang.Object obj5 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        timeSeries3.setDescription("Overwritten values from: 0.0");
        java.lang.Class class21 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        timeSeries46.fireSeriesChanged();
        boolean boolean48 = timeSeries46.getNotify();
        java.lang.Class class49 = timeSeries46.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.update(100, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(class49);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Class class10 = timeSeries5.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries5.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNull(class10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        long long8 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) Double.NaN, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        java.util.List list47 = timeSeries27.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.add(regularTimePeriod48, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.createCopy(10, (int) (short) 10);
        java.lang.Number number39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(2147483647, number39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod15, (java.lang.Number) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        java.lang.Class class5 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(class5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        timeSeries1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        timeSeries46.fireSeriesChanged();
        boolean boolean48 = timeSeries46.getNotify();
        long long49 = timeSeries46.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries46.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        java.util.List list40 = timeSeries39.getItems();
        java.lang.Class class41 = timeSeries39.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long46 = timeSeries45.getMaximumItemAge();
        boolean boolean47 = timeSeries39.equals((java.lang.Object) timeSeries45);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries45.update(regularTimePeriod48, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9223372036854775807L + "'", long46 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double14 = timeSeries13.getMaxY();
        java.util.List list15 = timeSeries13.data;
        timeSeries8.data = list15;
        java.util.List list17 = timeSeries8.getItems();
        java.lang.Class<?> wildcardClass18 = timeSeries8.getClass();
        timeSeries3.timePeriodClass = wildcardClass18;
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries3.addOrUpdate(regularTimePeriod21, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "", "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list9 = timeSeries8.data;
        java.util.List list10 = timeSeries8.getItems();
        java.lang.Object obj11 = timeSeries8.clone();
        java.util.Collection collection12 = timeSeries8.getTimePeriods();
        timeSeries8.setMaximumItemAge((long) 1);
        java.lang.String str15 = timeSeries8.getDomainDescription();
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) -1, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        java.util.List list26 = timeSeries24.data;
        timeSeries19.data = list26;
        java.lang.Class class28 = timeSeries19.getTimePeriodClass();
        java.lang.Class class29 = timeSeries19.getTimePeriodClass();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        java.util.List list41 = timeSeries39.data;
        timeSeries34.data = list41;
        java.lang.Class class43 = timeSeries34.getTimePeriodClass();
        java.lang.Class class44 = timeSeries34.getTimePeriodClass();
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries19.addAndOrUpdate(timeSeries34);
        java.util.List list47 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries19.data = list60;
        timeSeries3.data = list60;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double67 = timeSeries66.getMaxY();
        java.util.List list68 = timeSeries66.data;
        timeSeries66.fireSeriesChanged();
        timeSeries66.setDomainDescription("hi!");
        boolean boolean72 = timeSeries66.getNotify();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double77 = timeSeries76.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double82 = timeSeries81.getMaxY();
        java.util.List list83 = timeSeries81.data;
        timeSeries76.data = list83;
        java.lang.Class class85 = timeSeries76.timePeriodClass;
        timeSeries76.fireSeriesChanged();
        java.util.Collection collection87 = timeSeries66.getTimePeriodsUniqueToOtherSeries(timeSeries76);
        java.lang.Class<?> wildcardClass88 = timeSeries76.getClass();
        timeSeries3.timePeriodClass = wildcardClass88;
        timeSeries3.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 1, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNull(class85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemAge((long) '#');
        timeSeries3.removeAgedItems((long) (short) 100, true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list9 = timeSeries8.data;
        java.util.List list10 = timeSeries8.getItems();
        java.lang.Object obj11 = timeSeries8.clone();
        java.util.Collection collection12 = timeSeries8.getTimePeriods();
        timeSeries8.setMaximumItemAge((long) 1);
        java.lang.String str15 = timeSeries8.getDomainDescription();
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        java.lang.Class class17 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries3.createCopy(regularTimePeriod18, regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(class17);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        java.util.List list26 = timeSeries24.data;
        timeSeries19.data = list26;
        java.lang.Class class28 = timeSeries19.getTimePeriodClass();
        java.lang.Class class29 = timeSeries19.getTimePeriodClass();
        java.lang.Comparable comparable30 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        java.util.List list41 = timeSeries39.data;
        timeSeries34.data = list41;
        java.lang.Class class43 = timeSeries34.getTimePeriodClass();
        java.lang.Class class44 = timeSeries34.getTimePeriodClass();
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries19.addAndOrUpdate(timeSeries34);
        java.util.List list47 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries19.data = list60;
        timeSeries3.data = list60;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double67 = timeSeries66.getMaxY();
        java.util.List list68 = timeSeries66.data;
        timeSeries66.fireSeriesChanged();
        timeSeries66.setDomainDescription("hi!");
        boolean boolean72 = timeSeries66.getNotify();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double77 = timeSeries76.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double82 = timeSeries81.getMaxY();
        java.util.List list83 = timeSeries81.data;
        timeSeries76.data = list83;
        java.lang.Class class85 = timeSeries76.timePeriodClass;
        timeSeries76.fireSeriesChanged();
        java.util.Collection collection87 = timeSeries66.getTimePeriodsUniqueToOtherSeries(timeSeries76);
        java.lang.Class<?> wildcardClass88 = timeSeries76.getClass();
        timeSeries3.timePeriodClass = wildcardClass88;
        timeSeries3.setRangeDescription("");
        timeSeries3.setMaximumItemAge((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) -1 + "'", comparable30, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNull(class85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.addOrUpdate(regularTimePeriod16, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) (byte) -1, true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        long long8 = timeSeries3.getMaximumItemAge();
        timeSeries3.setMaximumItemAge((long) 2147483647);
        timeSeries3.removeAgedItems((long) '#', true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod14, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.addOrUpdate(regularTimePeriod13, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.setKey((java.lang.Comparable) "");
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        boolean boolean9 = timeSeries3.getNotify();
        java.util.List list10 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(0, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries1.getRangeDescription();
        timeSeries1.removeAgedItems(false);
        java.lang.String str15 = timeSeries1.getDomainDescription();
        java.lang.String str16 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(true);
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 0, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) -1 + "'", comparable11, (short) -1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list9 = timeSeries8.data;
        java.util.List list10 = timeSeries8.getItems();
        java.lang.Object obj11 = timeSeries8.clone();
        java.util.Collection collection12 = timeSeries8.getTimePeriods();
        timeSeries8.setMaximumItemAge((long) 1);
        java.lang.String str15 = timeSeries8.getDomainDescription();
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries8.addOrUpdate(regularTimePeriod17, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        boolean boolean29 = timeSeries10.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries10.addOrUpdate(regularTimePeriod30, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list9 = timeSeries8.data;
        java.util.List list10 = timeSeries8.getItems();
        java.lang.Object obj11 = timeSeries8.clone();
        java.util.Collection collection12 = timeSeries8.getTimePeriods();
        timeSeries8.setMaximumItemAge((long) 1);
        java.lang.String str15 = timeSeries8.getDomainDescription();
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDomainDescription();
        java.lang.Class<?> wildcardClass10 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        int int6 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.setKey((java.lang.Comparable) "");
        int int4 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries1.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries3.getMinY();
        java.lang.Class<?> wildcardClass16 = timeSeries3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries17.addChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod31, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries13.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries13.removeChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double23 = timeSeries22.getMaxY();
        java.util.List list24 = timeSeries22.data;
        timeSeries13.data = list24;
        timeSeries13.setMaximumItemAge((long) '#');
        boolean boolean28 = timeSeries13.getNotify();
        java.lang.Object obj29 = timeSeries13.clone();
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.addAndOrUpdate(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries13.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0.0", "Time");
        double double9 = timeSeries8.getMinY();
        boolean boolean10 = timeSeries3.equals((java.lang.Object) double9);
        int int11 = timeSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        java.lang.Object obj32 = timeSeries3.clone();
        timeSeries3.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries3.addOrUpdate(timeSeriesDataItem36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        double double24 = timeSeries3.getMinY();
        double double25 = timeSeries3.getMinY();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        timeSeries3.removeAgedItems((long) (byte) 0, true);
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        boolean boolean15 = timeSeries14.getNotify();
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long21 = timeSeries20.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        java.util.List list32 = timeSeries30.data;
        timeSeries25.data = list32;
        java.util.List list34 = timeSeries25.getItems();
        java.lang.Class<?> wildcardClass35 = timeSeries25.getClass();
        timeSeries20.timePeriodClass = wildcardClass35;
        timeSeries14.timePeriodClass = wildcardClass35;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries14.removeChangeListener(seriesChangeListener38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries14.getRawDataItem(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = timeSeries36.getIndex(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod10, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        int int15 = timeSeries3.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double17 = timeSeries16.getMaxY();
        java.util.List list18 = timeSeries16.data;
        timeSeries11.data = list18;
        java.lang.Class class20 = timeSeries11.timePeriodClass;
        timeSeries11.fireSeriesChanged();
        java.util.List list22 = timeSeries11.data;
        boolean boolean23 = timeSeries3.equals((java.lang.Object) timeSeries11);
        timeSeries11.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries11.getDataItem(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.util.List list19 = timeSeries10.getItems();
        timeSeries10.setRangeDescription("hi!");
        java.lang.Class class22 = timeSeries10.timePeriodClass;
        timeSeries10.setDescription("Overwritten values from: 0.0");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries29.setDomainDescription("");
        java.lang.String str32 = timeSeries29.getDomainDescription();
        java.lang.Class<?> wildcardClass33 = timeSeries29.getClass();
        timeSeries3.timePeriodClass = wildcardClass33;
        timeSeries3.setDescription("Overwritten values from: -1");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setMaximumItemAge((long) (short) 0);
        boolean boolean11 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        double double33 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries3.getDataItem(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        timeSeries1.setDescription("Time");
        timeSeries1.setDescription("Time");
        timeSeries1.clear();
        java.lang.String str36 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries39 = timeSeries1.createCopy((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Time" + "'", str36, "Time");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries3.addOrUpdate(timeSeriesDataItem40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0");
        timeSeries3.setRangeDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        boolean boolean15 = timeSeries14.getNotify();
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        java.lang.Object obj17 = timeSeries14.clone();
        java.lang.Class class18 = timeSeries14.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update(0, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 100, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("hi!");
        long long10 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list9 = timeSeries8.data;
        java.util.List list10 = timeSeries8.getItems();
        java.lang.Object obj11 = timeSeries8.clone();
        java.util.Collection collection12 = timeSeries8.getTimePeriods();
        timeSeries8.setMaximumItemAge((long) 1);
        java.lang.String str15 = timeSeries8.getDomainDescription();
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        java.util.List list27 = timeSeries25.data;
        timeSeries20.data = list27;
        java.lang.Class class29 = timeSeries20.getTimePeriodClass();
        java.lang.Class class30 = timeSeries20.getTimePeriodClass();
        java.lang.Comparable comparable31 = timeSeries20.getKey();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double41 = timeSeries40.getMaxY();
        java.util.List list42 = timeSeries40.data;
        timeSeries35.data = list42;
        java.lang.Class class44 = timeSeries35.getTimePeriodClass();
        java.lang.Class class45 = timeSeries35.getTimePeriodClass();
        timeSeries35.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries20.addAndOrUpdate(timeSeries35);
        java.lang.String str48 = timeSeries20.getDescription();
        timeSeries20.clear();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries53.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries20.addAndOrUpdate(timeSeries53);
        java.util.List list57 = timeSeries53.getItems();
        boolean boolean58 = timeSeries3.equals((java.lang.Object) timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries60.setKey((java.lang.Comparable) "");
        timeSeries60.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries3.addAndOrUpdate(timeSeries60);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem67 = timeSeries60.getRawDataItem(regularTimePeriod66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) -1 + "'", comparable31, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNull(class45);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(timeSeries65);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double14 = timeSeries13.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        java.util.List list20 = timeSeries18.data;
        timeSeries13.data = list20;
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries13.createCopy((int) (short) 1, (int) '#');
        double double25 = timeSeries24.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.removeChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries31.setRangeDescription("");
        double double34 = timeSeries31.getMaxY();
        java.lang.Object obj35 = timeSeries31.clone();
        long long36 = timeSeries31.getMaximumItemAge();
        java.util.Collection collection37 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        java.util.Collection collection38 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries41 = timeSeries3.createCopy((int) (byte) -1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        timeSeries24.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries20.addAndOrUpdate(timeSeries24);
        java.lang.Comparable comparable29 = timeSeries28.getKey();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        boolean boolean34 = timeSeries28.equals((java.lang.Object) '4');
        java.util.Collection collection35 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Overwritten values from: 0.0" + "'", comparable29, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        timeSeries3.removeAgedItems((long) (short) 0, false);
        java.lang.String str32 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.addOrUpdate(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        java.util.List list14 = timeSeries3.getItems();
        java.util.Collection collection15 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        java.util.Collection collection14 = timeSeries3.getTimePeriods();
        timeSeries3.setDomainDescription("hi!");
        java.lang.String str17 = timeSeries3.getDomainDescription();
        boolean boolean18 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod13, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.addChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double14 = timeSeries13.getMaxY();
        java.util.List list15 = timeSeries13.data;
        timeSeries8.data = list15;
        java.util.List list17 = timeSeries8.getItems();
        java.lang.Class<?> wildcardClass18 = timeSeries8.getClass();
        timeSeries3.timePeriodClass = wildcardClass18;
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        java.lang.Number number14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, number14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries54.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries54.removeChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries54.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        java.util.List list65 = timeSeries63.data;
        timeSeries54.data = list65;
        timeSeries54.setMaximumItemAge((long) '#');
        timeSeries54.removeAgedItems((long) (short) 100, true);
        boolean boolean72 = timeSeries9.equals((java.lang.Object) timeSeries54);
        timeSeries9.setDomainDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem75 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries10.data = list17;
        java.lang.Class class19 = timeSeries10.getTimePeriodClass();
        java.lang.Class class20 = timeSeries10.timePeriodClass;
        timeSeries10.setKey((java.lang.Comparable) 0);
        java.util.List list23 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(true);
        timeSeries10.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        long long8 = timeSeries3.getMaximumItemAge();
        timeSeries3.setMaximumItemAge((long) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries3.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod25, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int26 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        timeSeries32.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries28.addAndOrUpdate(timeSeries32);
        timeSeries36.setDescription("");
        java.lang.Class class39 = timeSeries36.timePeriodClass;
        timeSeries36.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries45.setDomainDescription("");
        java.lang.String str48 = timeSeries45.getDomainDescription();
        java.util.List list49 = timeSeries45.data;
        timeSeries36.data = list49;
        timeSeries3.data = list49;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries3.addOrUpdate(timeSeriesDataItem52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        java.util.Collection collection14 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.util.List list27 = timeSeries18.getItems();
        timeSeries18.setRangeDescription("hi!");
        java.lang.Class class30 = timeSeries18.timePeriodClass;
        timeSeries18.setRangeDescription("");
        int int33 = timeSeries18.getItemCount();
        timeSeries18.setDomainDescription("Value");
        int int36 = timeSeries18.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        int int15 = timeSeries3.getItemCount();
        double double16 = timeSeries3.getMaxY();
        boolean boolean17 = timeSeries3.isEmpty();
        double double18 = timeSeries3.getMaxY();
        double double19 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.getRawDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.getRawDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        java.lang.Class class19 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double29 = timeSeries28.getMaxY();
        java.util.List list30 = timeSeries28.data;
        timeSeries23.data = list30;
        java.lang.Class class32 = timeSeries23.getTimePeriodClass();
        java.lang.Class class33 = timeSeries23.getTimePeriodClass();
        java.lang.Comparable comparable34 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double39 = timeSeries38.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double44 = timeSeries43.getMaxY();
        java.util.List list45 = timeSeries43.data;
        timeSeries38.data = list45;
        java.lang.Class class47 = timeSeries38.getTimePeriodClass();
        java.lang.Class class48 = timeSeries38.getTimePeriodClass();
        timeSeries38.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries23.addAndOrUpdate(timeSeries38);
        java.lang.String str51 = timeSeries23.getDescription();
        timeSeries23.clear();
        boolean boolean53 = timeSeries3.equals((java.lang.Object) timeSeries23);
        boolean boolean54 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (short) -1 + "'", comparable34, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(class47);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0.0", "Time");
        double double9 = timeSeries8.getMinY();
        boolean boolean10 = timeSeries3.equals((java.lang.Object) double9);
        int int11 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems((long) (byte) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        timeSeries1.setNotify(true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries3.addChangeListener(seriesChangeListener17);
        boolean boolean19 = timeSeries3.getNotify();
        java.lang.String str20 = timeSeries3.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        timeSeries3.setDescription("Overwritten values from: 0.0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        java.lang.String str18 = timeSeries3.getDomainDescription();
        double double19 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setDescription("Overwritten values from: 0.0");
        double double18 = timeSeries3.getMinY();
        timeSeries3.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setDescription("");
        java.lang.Class class11 = timeSeries3.timePeriodClass;
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        boolean boolean19 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.createCopy((int) (byte) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries22.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries36.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries36.removeChangeListener(seriesChangeListener40);
        long long42 = timeSeries36.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener43);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries36.update((int) (short) -1, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        timeSeries46.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries51.setRangeDescription("hi!");
        java.lang.Class class63 = timeSeries51.timePeriodClass;
        timeSeries51.setDescription("Overwritten values from: 0.0");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries51.removeChangeListener(seriesChangeListener66);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries46.addAndOrUpdate(timeSeries51);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener69 = null;
        timeSeries51.removeChangeListener(seriesChangeListener69);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(class63);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy((int) (short) 1, (int) '#');
        boolean boolean27 = timeSeries26.getNotify();
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long33 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        java.util.List list44 = timeSeries42.data;
        timeSeries37.data = list44;
        java.util.List list46 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass47 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass47;
        timeSeries26.timePeriodClass = wildcardClass47;
        timeSeries9.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries54.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries54.removeChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries54.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        java.util.List list65 = timeSeries63.data;
        timeSeries54.data = list65;
        timeSeries54.setMaximumItemAge((long) '#');
        timeSeries54.removeAgedItems((long) (short) 100, true);
        boolean boolean72 = timeSeries9.equals((java.lang.Object) timeSeries54);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod73 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = timeSeries9.getRawDataItem(regularTimePeriod73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries17.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.removeChangeListener(seriesChangeListener20);
        timeSeries17.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int26 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener27);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str31 = timeSeries3.getDescription();
        timeSeries3.fireSeriesChanged();
        boolean boolean33 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries3.addChangeListener(seriesChangeListener34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = timeSeries3.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.removeAgedItems(true);
        boolean boolean19 = timeSeries3.isEmpty();
        int int20 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries3.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod23, (java.lang.Number) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.lang.String str32 = timeSeries3.getDomainDescription();
        timeSeries3.setMaximumItemAge((long) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.addChangeListener(seriesChangeListener12);
        timeSeries1.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 10, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "Time", "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        timeSeries1.setDomainDescription("");
        java.util.List list17 = timeSeries1.getItems();
        timeSeries1.setMaximumItemAge((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        int int18 = timeSeries3.getItemCount();
        timeSeries3.setMaximumItemAge(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setMaximumItemAge((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(true);
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(10L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) -1 + "'", comparable11, (short) -1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        java.util.Collection collection14 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.util.List list27 = timeSeries18.getItems();
        timeSeries18.setRangeDescription("hi!");
        java.lang.Class class30 = timeSeries18.timePeriodClass;
        timeSeries18.setRangeDescription("");
        int int33 = timeSeries18.getItemCount();
        timeSeries18.setDomainDescription("Value");
        int int36 = timeSeries18.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        timeSeries3.setDomainDescription("Overwritten values from: 0.0");
        boolean boolean19 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(timeSeriesDataItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setDomainDescription("");
        java.lang.String str6 = timeSeries3.getDomainDescription();
        java.util.List list7 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setMaximumItemAge((long) (short) 0);
        timeSeries3.setDescription("Overwritten values from: 0");
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        timeSeries46.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        timeSeries51.setRangeDescription("hi!");
        java.lang.Class class63 = timeSeries51.timePeriodClass;
        timeSeries51.setDescription("Overwritten values from: 0.0");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries51.removeChangeListener(seriesChangeListener66);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries46.addAndOrUpdate(timeSeries51);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.update((int) (short) 100, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNull(class63);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        timeSeries3.fireSeriesChanged();
        timeSeries3.removeAgedItems((long) (byte) 100, true);
        long long19 = timeSeries3.getMaximumItemAge();
        java.util.List list20 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) '4', true);
        double double24 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        timeSeries32.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries28.addAndOrUpdate(timeSeries32);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries28.removeChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double48 = timeSeries47.getMaxY();
        java.util.List list49 = timeSeries47.data;
        timeSeries42.data = list49;
        java.lang.Class class51 = timeSeries42.getTimePeriodClass();
        java.lang.Class class52 = timeSeries42.timePeriodClass;
        timeSeries42.setKey((java.lang.Comparable) 0);
        java.util.List list55 = timeSeries42.getItems();
        java.lang.Class<?> wildcardClass56 = list55.getClass();
        timeSeries28.timePeriodClass = wildcardClass56;
        timeSeries28.setDescription("Time");
        java.util.Collection collection60 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.lang.String str61 = timeSeries28.getRangeDescription();
        long long62 = timeSeries28.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNull(class51);
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Value" + "'", str61, "Value");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9223372036854775807L + "'", long62 == 9223372036854775807L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        java.util.List list16 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.lang.Class class36 = timeSeries27.getTimePeriodClass();
        java.lang.Class class37 = timeSeries27.timePeriodClass;
        timeSeries27.setKey((java.lang.Comparable) 0);
        java.util.List list40 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        timeSeries27.removeAgedItems(false);
        java.util.Collection collection45 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries3.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries3.createCopy((int) (byte) 10, (int) ' ');
        java.lang.Class class50 = timeSeries3.timePeriodClass;
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNull(class50);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        boolean boolean15 = timeSeries14.getNotify();
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long21 = timeSeries20.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        java.util.List list32 = timeSeries30.data;
        timeSeries25.data = list32;
        java.util.List list34 = timeSeries25.getItems();
        java.lang.Class<?> wildcardClass35 = timeSeries25.getClass();
        timeSeries20.timePeriodClass = wildcardClass35;
        timeSeries14.timePeriodClass = wildcardClass35;
        java.util.Collection collection38 = timeSeries14.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries14.removeChangeListener(seriesChangeListener39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = timeSeries14.getIndex(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        double double31 = timeSeries1.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeries1.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = timeSeries1.getIndex(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        boolean boolean8 = timeSeries3.isEmpty();
        timeSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        timeSeries3.setDomainDescription("Time");
        timeSeries3.setKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod11, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.timePeriodClass;
        timeSeries15.setKey((java.lang.Comparable) 0);
        java.util.List list28 = timeSeries15.getItems();
        java.lang.Class<?> wildcardClass29 = list28.getClass();
        timeSeries1.timePeriodClass = wildcardClass29;
        timeSeries1.setDescription("Time");
        double double33 = timeSeries1.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.util.List list12 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long22 = timeSeries21.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        java.util.List list33 = timeSeries31.data;
        timeSeries26.data = list33;
        java.util.List list35 = timeSeries26.getItems();
        java.lang.Class<?> wildcardClass36 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass36;
        timeSeries3.timePeriodClass = wildcardClass36;
        java.lang.Comparable comparable39 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener40);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries3.removeChangeListener(seriesChangeListener42);
        java.lang.Comparable comparable44 = timeSeries3.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + (short) -1 + "'", comparable39, (short) -1);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + (short) -1 + "'", comparable44, (short) -1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double19 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double24 = timeSeries23.getMaxY();
        java.util.List list25 = timeSeries23.data;
        timeSeries18.data = list25;
        java.lang.Class class27 = timeSeries18.getTimePeriodClass();
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.List list31 = timeSeries3.getItems();
        java.util.Collection collection32 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        timeSeries3.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double12 = timeSeries11.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double17 = timeSeries16.getMaxY();
        java.util.List list18 = timeSeries16.data;
        timeSeries11.data = list18;
        java.lang.Class class20 = timeSeries11.timePeriodClass;
        timeSeries11.fireSeriesChanged();
        java.util.List list22 = timeSeries11.data;
        boolean boolean23 = timeSeries3.equals((java.lang.Object) timeSeries11);
        long long24 = timeSeries11.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries11.addOrUpdate(regularTimePeriod25, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }
}

