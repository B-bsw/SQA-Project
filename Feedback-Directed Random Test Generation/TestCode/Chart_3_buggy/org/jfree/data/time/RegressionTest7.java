package org.jfree.data.time;

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
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        int int8 = timeSeries3.getMaximumItemCount();
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getRawDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double42 = timeSeries41.getMaxY();
        java.util.List list43 = timeSeries41.data;
        timeSeries36.data = list43;
        java.lang.Class class45 = timeSeries36.getTimePeriodClass();
        java.lang.Class class46 = timeSeries36.timePeriodClass;
        java.util.List list47 = timeSeries36.getItems();
        timeSeries3.data = list47;
        timeSeries3.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries3.getRawDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(class45);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) ' ', (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        java.util.Collection collection50 = timeSeries46.getTimePeriods();
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
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        java.util.Collection collection41 = timeSeries39.getTimePeriods();
        timeSeries39.removeAgedItems((long) 2147483647, true);
        boolean boolean45 = timeSeries39.isEmpty();
        timeSeries39.removeAgedItems((long) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries39.getRawDataItem(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((-1), 10, false);
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
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        timeSeries17.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener27);
        double double29 = timeSeries3.getMaxY();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0", "Overwritten values from: 0.0");
        timeSeries3.fireSeriesChanged();
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        java.lang.Comparable comparable16 = timeSeries3.getKey();
        timeSeries3.setDomainDescription("Overwritten values from: 0");
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "" + "'", comparable16, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        timeSeries3.setMaximumItemCount((int) (byte) 1);
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.createCopy((int) (short) 1, (int) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries26.setRangeDescription("");
        double double29 = timeSeries26.getMaxY();
        java.lang.Object obj30 = timeSeries26.clone();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        java.util.List list41 = timeSeries39.data;
        timeSeries34.data = list41;
        java.lang.Class class43 = timeSeries34.timePeriodClass;
        timeSeries34.fireSeriesChanged();
        java.util.List list45 = timeSeries34.data;
        boolean boolean46 = timeSeries26.equals((java.lang.Object) timeSeries34);
        long long47 = timeSeries34.getMaximumItemAge();
        boolean boolean48 = timeSeries34.getNotify();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double53 = timeSeries52.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double58 = timeSeries57.getMaxY();
        java.util.List list59 = timeSeries57.data;
        timeSeries52.data = list59;
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries52.createCopy((int) (short) 1, (int) '#');
        timeSeries63.setNotify(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries63.removeChangeListener(seriesChangeListener66);
        boolean boolean68 = timeSeries34.equals((java.lang.Object) timeSeries63);
        java.util.Collection collection69 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9223372036854775807L + "'", long47 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        timeSeries17.setMaximumItemCount((int) (byte) 10);
        boolean boolean28 = timeSeries17.isEmpty();
        timeSeries17.removeAgedItems((long) 100, true);
        timeSeries17.setNotify(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        int int7 = timeSeries3.getItemCount();
        java.lang.String str8 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.getRawDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.String str12 = timeSeries3.getDomainDescription();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        java.lang.Object obj50 = timeSeries46.clone();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double55 = timeSeries54.getMaxY();
        java.util.List list56 = timeSeries54.data;
        timeSeries54.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double62 = timeSeries61.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double67 = timeSeries66.getMaxY();
        java.util.List list68 = timeSeries66.data;
        timeSeries61.data = list68;
        java.lang.Class class70 = timeSeries61.getTimePeriodClass();
        java.lang.Class class71 = timeSeries61.timePeriodClass;
        timeSeries61.setKey((java.lang.Comparable) 0);
        java.util.List list74 = timeSeries61.getItems();
        timeSeries61.removeAgedItems(true);
        timeSeries61.removeAgedItems(false);
        java.util.Collection collection79 = timeSeries54.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        timeSeries54.removeAgedItems((long) (short) 0, false);
        int int83 = timeSeries54.getItemCount();
        boolean boolean84 = timeSeries54.getNotify();
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries46.addAndOrUpdate(timeSeries54);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener86 = null;
        timeSeries54.removeChangeListener(seriesChangeListener86);
        java.lang.String str88 = timeSeries54.getRangeDescription();
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
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNull(class70);
        org.junit.Assert.assertNull(class71);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        boolean boolean9 = timeSeries3.isEmpty();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        java.lang.Class class34 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(false);
        java.lang.String str37 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries3.addOrUpdate(regularTimePeriod38, (java.lang.Number) 1.0f);
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
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from: 0.0", "hi!");
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeSeries3.getIndex(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        timeSeries1.setRangeDescription("");
        boolean boolean5 = timeSeries1.equals((java.lang.Object) (short) -1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        timeSeries3.setMaximumItemCount((int) (short) 1);
        java.util.List list28 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries3.getRawDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        java.util.List list10 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        java.util.List list16 = timeSeries14.data;
        timeSeries14.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double22 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        java.util.List list28 = timeSeries26.data;
        timeSeries21.data = list28;
        java.lang.Class class30 = timeSeries21.getTimePeriodClass();
        java.lang.Class class31 = timeSeries21.timePeriodClass;
        timeSeries21.setKey((java.lang.Comparable) 0);
        java.util.List list34 = timeSeries21.getItems();
        timeSeries21.removeAgedItems(true);
        timeSeries21.removeAgedItems(false);
        java.util.Collection collection39 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries14.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries46.setDomainDescription("");
        java.lang.String str49 = timeSeries46.getDomainDescription();
        java.util.List list50 = timeSeries46.data;
        timeSeries14.data = list50;
        timeSeries3.data = list50;
        java.lang.Class class53 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries3.createCopy((int) (byte) 0, (int) '4');
        timeSeries56.removeAgedItems((long) (byte) -1, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem61 = timeSeries56.getRawDataItem(regularTimePeriod60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNull(class53);
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries1.getRangeDescription();
        timeSeries1.removeAgedItems(false);
        java.util.Collection collection15 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        double double10 = timeSeries3.getMinY();
        java.util.List list11 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        timeSeries19.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries23.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        java.util.List list36 = timeSeries34.data;
        timeSeries29.data = list36;
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries29.createCopy((int) (short) 1, (int) '#');
        boolean boolean41 = timeSeries40.getNotify();
        java.util.Collection collection42 = timeSeries40.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long47 = timeSeries46.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries51.data = list58;
        java.util.List list60 = timeSeries51.getItems();
        java.lang.Class<?> wildcardClass61 = timeSeries51.getClass();
        timeSeries46.timePeriodClass = wildcardClass61;
        timeSeries40.timePeriodClass = wildcardClass61;
        timeSeries23.timePeriodClass = wildcardClass61;
        java.util.Collection collection65 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        java.lang.String str66 = timeSeries13.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries13.removeChangeListener(seriesChangeListener67);
        timeSeries13.removeAgedItems(false);
        timeSeries13.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries3.addAndOrUpdate(timeSeries13);
        int int74 = timeSeries73.getMaximumItemCount();
        double double75 = timeSeries73.getMaxY();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9223372036854775807L + "'", long47 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Time" + "'", str66, "Time");
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        timeSeries36.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        java.lang.Comparable comparable41 = timeSeries40.getKey();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries30.addAndOrUpdate(timeSeries40);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries30.removeChangeListener(seriesChangeListener43);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.add(timeSeriesDataItem45, false);
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
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + "Overwritten values from: 0.0" + "'", comparable41, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        boolean boolean26 = timeSeries3.equals((java.lang.Object) "");
        double double27 = timeSeries3.getMinY();
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        timeSeries3.setMaximumItemCount((int) (short) 10);
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
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        java.lang.Class class34 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries3.addChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries42.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries42.removeChangeListener(seriesChangeListener45);
        java.lang.Class class47 = timeSeries42.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double52 = timeSeries51.getMaxY();
        java.util.List list53 = timeSeries51.data;
        timeSeries42.data = list53;
        timeSeries42.setMaximumItemAge((long) '#');
        boolean boolean57 = timeSeries42.getNotify();
        java.lang.Object obj58 = timeSeries42.clone();
        timeSeries42.setMaximumItemCount((int) (byte) 1);
        boolean boolean61 = timeSeries3.equals((java.lang.Object) (byte) 1);
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
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNull(class47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        boolean boolean69 = timeSeries68.isEmpty();
        timeSeries68.removeAgedItems(1L, false);
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        java.util.Collection collection20 = timeSeries3.getTimePeriods();
        java.lang.Object obj21 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        java.util.List list32 = timeSeries30.data;
        timeSeries25.data = list32;
        java.lang.Class class34 = timeSeries25.getTimePeriodClass();
        java.lang.Class class35 = timeSeries25.timePeriodClass;
        timeSeries25.setKey((java.lang.Comparable) 0);
        java.util.List list38 = timeSeries25.getItems();
        timeSeries25.removeAgedItems(true);
        java.lang.Class class41 = timeSeries25.timePeriodClass;
        java.lang.String str42 = timeSeries25.getDescription();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries3.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries47.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries47.removeChangeListener(seriesChangeListener50);
        java.lang.Class class52 = timeSeries47.timePeriodClass;
        timeSeries47.setMaximumItemAge((long) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener55);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries3.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries57.add(timeSeriesDataItem58, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener40);
        java.lang.Comparable comparable42 = timeSeries14.getKey();
        java.lang.Class class43 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries14.getDataItem(regularTimePeriod44);
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
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (short) -1 + "'", comparable42, (short) -1);
        org.junit.Assert.assertNotNull(class43);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Value", "Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries3.removeChangeListener(seriesChangeListener21);
        java.lang.String str23 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        java.util.List list34 = timeSeries32.data;
        timeSeries27.data = list34;
        java.util.List list36 = timeSeries27.getItems();
        timeSeries27.setRangeDescription("hi!");
        java.lang.Class class39 = timeSeries27.timePeriodClass;
        timeSeries27.setRangeDescription("");
        java.lang.String str42 = timeSeries27.getDomainDescription();
        timeSeries27.removeAgedItems(false);
        java.util.List list45 = timeSeries27.data;
        timeSeries3.data = list45;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries3.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        java.lang.Object obj7 = timeSeries3.clone();
        long long8 = timeSeries3.getMaximumItemAge();
        timeSeries3.setMaximumItemAge((long) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double20 = timeSeries19.getMaxY();
        java.util.List list21 = timeSeries19.data;
        timeSeries14.data = list21;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries14.createCopy((int) (short) 1, (int) '#');
        java.lang.String str26 = timeSeries25.getDomainDescription();
        java.util.Collection collection27 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        timeSeries25.removeAgedItems((long) (short) 10, false);
        timeSeries25.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean17 = timeSeries16.getNotify();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list22 = timeSeries21.data;
        java.util.List list23 = timeSeries21.getItems();
        java.lang.Object obj24 = timeSeries21.clone();
        java.util.Collection collection25 = timeSeries21.getTimePeriods();
        timeSeries21.setMaximumItemAge((long) 1);
        java.lang.String str28 = timeSeries21.getDomainDescription();
        java.util.Collection collection29 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.util.Collection collection30 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries3.setDescription("");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount(1);
        double double37 = timeSeries3.getMaxY();
        timeSeries3.setNotify(true);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!");
        long long4 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        long long61 = timeSeries28.getMaximumItemAge();
        timeSeries28.setNotify(false);
        java.util.List list64 = timeSeries28.data;
        timeSeries28.setDescription("Value");
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 9223372036854775807L + "'", long61 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        java.util.Collection collection24 = timeSeries3.getTimePeriods();
        timeSeries3.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries3.getNextTimePeriod();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        timeSeries20.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries16.addAndOrUpdate(timeSeries20);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries16.removeChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        java.util.List list37 = timeSeries35.data;
        timeSeries30.data = list37;
        java.lang.Class class39 = timeSeries30.getTimePeriodClass();
        java.lang.Class class40 = timeSeries30.timePeriodClass;
        timeSeries30.setKey((java.lang.Comparable) 0);
        java.util.List list43 = timeSeries30.getItems();
        java.lang.Class<?> wildcardClass44 = list43.getClass();
        timeSeries16.timePeriodClass = wildcardClass44;
        timeSeries16.setDescription("Time");
        timeSeries16.setDescription("Time");
        timeSeries16.clear();
        java.lang.Class class51 = timeSeries16.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double56 = timeSeries55.getMaxY();
        java.util.List list57 = timeSeries55.data;
        timeSeries55.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double63 = timeSeries62.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double68 = timeSeries67.getMaxY();
        java.util.List list69 = timeSeries67.data;
        timeSeries62.data = list69;
        java.util.List list71 = timeSeries62.getItems();
        timeSeries62.setRangeDescription("hi!");
        java.lang.Class class74 = timeSeries62.timePeriodClass;
        timeSeries62.setDescription("Overwritten values from: 0.0");
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries55.addAndOrUpdate(timeSeries62);
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries81.setDomainDescription("");
        java.lang.String str84 = timeSeries81.getDomainDescription();
        java.lang.Class<?> wildcardClass85 = timeSeries81.getClass();
        timeSeries55.timePeriodClass = wildcardClass85;
        timeSeries16.timePeriodClass = wildcardClass85;
        timeSeries1.timePeriodClass = wildcardClass85;
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertNull(class40);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(class51);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNull(class74);
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.removeAgedItems(false);
        java.util.List list10 = timeSeries3.getItems();
        int int11 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        int int35 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries3.getRawDataItem(regularTimePeriod36);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.lang.Class class52 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries3.addChangeListener(seriesChangeListener53);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(class52);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries3.removeChangeListener(seriesChangeListener21);
        int int23 = timeSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) -1 + "'", comparable14, (short) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        double double7 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        long long4 = timeSeries3.getMaximumItemAge();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) 10);
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        java.lang.String str12 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Overwritten values from: 0.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.setMaximumItemAge((long) 1);
        java.lang.String str10 = timeSeries3.getDomainDescription();
        timeSeries3.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean17 = timeSeries16.getNotify();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list22 = timeSeries21.data;
        java.util.List list23 = timeSeries21.getItems();
        java.lang.Object obj24 = timeSeries21.clone();
        java.util.Collection collection25 = timeSeries21.getTimePeriods();
        timeSeries21.setMaximumItemAge((long) 1);
        java.lang.String str28 = timeSeries21.getDomainDescription();
        java.util.Collection collection29 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        java.util.Collection collection30 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries3.setDescription("");
        timeSeries3.setNotify(false);
        timeSeries3.setMaximumItemCount(1);
        double double37 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double42 = timeSeries41.getMaxY();
        java.util.List list43 = timeSeries41.data;
        timeSeries41.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double49 = timeSeries48.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double54 = timeSeries53.getMaxY();
        java.util.List list55 = timeSeries53.data;
        timeSeries48.data = list55;
        java.lang.Class class57 = timeSeries48.getTimePeriodClass();
        java.lang.Class class58 = timeSeries48.timePeriodClass;
        timeSeries48.setKey((java.lang.Comparable) 0);
        java.util.List list61 = timeSeries48.getItems();
        timeSeries48.removeAgedItems(true);
        timeSeries48.removeAgedItems(false);
        java.util.Collection collection66 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        timeSeries41.setKey((java.lang.Comparable) 1.0d);
        boolean boolean69 = timeSeries3.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNull(class57);
        org.junit.Assert.assertNull(class58);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double39 = timeSeries38.getMaxY();
        timeSeries38.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries34.addAndOrUpdate(timeSeries38);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries34.removeChangeListener(seriesChangeListener43);
        timeSeries34.removeAgedItems((long) (byte) 1, false);
        boolean boolean48 = timeSeries3.equals((java.lang.Object) (byte) 1);
        long long49 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod50, (java.lang.Number) 35L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        double double36 = timeSeries1.getMinY();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setKey((java.lang.Comparable) 0);
        int int16 = timeSeries3.getItemCount();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        boolean boolean11 = timeSeries3.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        double double19 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries3.removeChangeListener(seriesChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) '4', (int) (byte) 100);
        timeSeries4.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double15 = timeSeries14.getMaxY();
        timeSeries14.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        boolean boolean24 = timeSeries18.equals((java.lang.Object) '4');
        int int25 = timeSeries18.getItemCount();
        java.util.List list26 = timeSeries18.getItems();
        timeSeries4.data = list26;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod28, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: 0.0" + "'", comparable19, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        double double21 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy(0, 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        timeSeries3.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener8);
        long long10 = timeSeries3.getMaximumItemAge();
        timeSeries3.setMaximumItemAge((long) ' ');
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.setKey((java.lang.Comparable) "");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double10 = timeSeries9.getMaxY();
        timeSeries9.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries5.addAndOrUpdate(timeSeries9);
        java.lang.Comparable comparable14 = timeSeries13.getKey();
        java.util.Collection collection15 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        timeSeries13.setDomainDescription("hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Overwritten values from: 0.0" + "'", comparable14, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        java.util.Collection collection14 = timeSeries3.getTimePeriods();
        timeSeries3.setDescription("");
        java.lang.Class class17 = timeSeries3.timePeriodClass;
        boolean boolean18 = timeSeries3.getNotify();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list8 = timeSeries7.data;
        java.util.List list9 = timeSeries7.getItems();
        java.lang.Object obj10 = timeSeries7.clone();
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        java.lang.Class class12 = timeSeries7.timePeriodClass;
        timeSeries7.setNotify(true);
        java.util.Collection collection15 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries7.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        timeSeries1.removeAgedItems(false);
        java.lang.Object obj4 = timeSeries1.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        boolean boolean15 = timeSeries9.equals((java.lang.Object) '4');
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries9.addChangeListener(seriesChangeListener18);
        boolean boolean20 = timeSeries9.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries9.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "Value");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0d) + "'", comparable4, (-1.0d));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        timeSeries3.setDomainDescription("Time");
        java.lang.Class class11 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (double) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries3.getMaximumItemCount();
        boolean boolean9 = timeSeries3.getNotify();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        timeSeries3.clear();
        java.util.List list13 = timeSeries3.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries3.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        timeSeries26.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries22.addAndOrUpdate(timeSeries26);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries22.removeChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double42 = timeSeries41.getMaxY();
        java.util.List list43 = timeSeries41.data;
        timeSeries36.data = list43;
        java.lang.Class class45 = timeSeries36.getTimePeriodClass();
        java.lang.Class class46 = timeSeries36.timePeriodClass;
        timeSeries36.setKey((java.lang.Comparable) 0);
        java.util.List list49 = timeSeries36.getItems();
        java.lang.Class<?> wildcardClass50 = list49.getClass();
        timeSeries22.timePeriodClass = wildcardClass50;
        timeSeries22.setDescription("Time");
        timeSeries22.setDescription("Time");
        boolean boolean56 = timeSeries3.equals((java.lang.Object) "Time");
        timeSeries3.setMaximumItemAge((long) (byte) 0);
        timeSeries3.setMaximumItemAge((long) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod61, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(class45);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Overwritten values from: 0.0", "Time");
        java.lang.String str4 = timeSeries3.getDescription();
        java.lang.Object obj5 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 10L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        timeSeries1.setKey((java.lang.Comparable) "");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 100);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.util.Collection collection23 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        timeSeries3.setRangeDescription("Overwritten values from: 0.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Value", "Value");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.lang.Object obj6 = timeSeries3.clone();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setMaximumItemAge((long) (short) 0);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        timeSeries3.setKey((java.lang.Comparable) 2147483647);
        timeSeries3.setRangeDescription("Overwritten values from: 0");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.lang.String str10 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries15.data = list22;
        java.lang.Class class24 = timeSeries15.getTimePeriodClass();
        java.lang.Class class25 = timeSeries15.getTimePeriodClass();
        java.lang.Comparable comparable26 = timeSeries15.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        java.util.List list37 = timeSeries35.data;
        timeSeries30.data = list37;
        java.lang.Class class39 = timeSeries30.getTimePeriodClass();
        java.lang.Class class40 = timeSeries30.getTimePeriodClass();
        timeSeries30.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries15.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double49 = timeSeries48.getMaxY();
        timeSeries48.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries44.addAndOrUpdate(timeSeries48);
        java.lang.Comparable comparable53 = timeSeries52.getKey();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries42.addAndOrUpdate(timeSeries52);
        java.util.Collection collection55 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener56);
        timeSeries42.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) -1 + "'", comparable11, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) -1 + "'", comparable26, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertNull(class40);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + "Overwritten values from: 0.0" + "'", comparable53, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection55);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        timeSeries3.setDomainDescription("Value");
        int int21 = timeSeries3.getItemCount();
        timeSeries3.removeAgedItems(0L, true);
        java.lang.Class class25 = timeSeries3.timePeriodClass;
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) 0, true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(class25);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from: 0.0", "hi!");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double8 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries7.data = list14;
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        java.lang.Class class17 = timeSeries7.getTimePeriodClass();
        java.lang.Comparable comparable18 = timeSeries7.getKey();
        timeSeries7.fireSeriesChanged();
        timeSeries7.removeAgedItems((long) (byte) 100, true);
        long long23 = timeSeries7.getMaximumItemAge();
        java.util.List list24 = timeSeries7.getItems();
        timeSeries7.removeAgedItems((long) '4', true);
        double double28 = timeSeries7.getMinY();
        double double29 = timeSeries7.getMinY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        timeSeries35.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries31.addAndOrUpdate(timeSeries35);
        java.lang.Comparable comparable40 = timeSeries39.getKey();
        timeSeries39.setDomainDescription("Time");
        java.util.List list43 = timeSeries39.data;
        timeSeries7.data = list43;
        int int45 = timeSeries7.getItemCount();
        java.lang.Class<?> wildcardClass46 = timeSeries7.getClass();
        timeSeries3.timePeriodClass = wildcardClass46;
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) -1 + "'", comparable18, (short) -1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + "Overwritten values from: 0.0" + "'", comparable40, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double8 = timeSeries7.getMaxY();
        java.util.List list9 = timeSeries7.data;
        timeSeries3.data = list9;
        java.lang.String str11 = timeSeries3.getDescription();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries3.addChangeListener(seriesChangeListener13);
        timeSeries3.setRangeDescription("Value");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = timeSeries3.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries3.data = list14;
        java.lang.Comparable comparable16 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.addOrUpdate(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "" + "'", comparable16, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double42 = timeSeries41.getMaxY();
        java.util.List list43 = timeSeries41.data;
        timeSeries36.data = list43;
        java.lang.Class class45 = timeSeries36.getTimePeriodClass();
        java.lang.Class class46 = timeSeries36.timePeriodClass;
        java.util.List list47 = timeSeries36.getItems();
        timeSeries3.data = list47;
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener49);
        int int51 = timeSeries3.getItemCount();
        java.util.Collection collection52 = timeSeries3.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double62 = timeSeries61.getMaxY();
        java.util.List list63 = timeSeries61.data;
        timeSeries56.data = list63;
        java.lang.Class class65 = timeSeries56.getTimePeriodClass();
        java.lang.Class class66 = timeSeries56.getTimePeriodClass();
        java.lang.Comparable comparable67 = timeSeries56.getKey();
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double72 = timeSeries71.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double77 = timeSeries76.getMaxY();
        java.util.List list78 = timeSeries76.data;
        timeSeries71.data = list78;
        java.lang.Class class80 = timeSeries71.getTimePeriodClass();
        java.lang.Class class81 = timeSeries71.getTimePeriodClass();
        timeSeries71.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries83 = timeSeries56.addAndOrUpdate(timeSeries71);
        java.util.List list84 = timeSeries56.getItems();
        long long85 = timeSeries56.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries86 = timeSeries3.addAndOrUpdate(timeSeries56);
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
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(class45);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNull(class65);
        org.junit.Assert.assertNull(class66);
        org.junit.Assert.assertEquals("'" + comparable67 + "' != '" + (short) -1 + "'", comparable67, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNull(class80);
        org.junit.Assert.assertNull(class81);
        org.junit.Assert.assertNotNull(timeSeries83);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 9223372036854775807L + "'", long85 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries86);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        java.lang.Object obj7 = timeSeries3.clone();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        boolean boolean9 = timeSeries3.getNotify();
        java.lang.Object obj10 = timeSeries3.clone();
        timeSeries3.removeAgedItems(9223372036854775807L, false);
        int int14 = timeSeries3.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) -1 + "'", comparable8, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries32.addChangeListener(seriesChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries30.addAndOrUpdate(timeSeries32);
        java.lang.String str36 = timeSeries32.getRangeDescription();
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
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        boolean boolean2 = timeSeries1.getNotify();
        long long3 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double8 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double13 = timeSeries12.getMaxY();
        java.util.List list14 = timeSeries12.data;
        timeSeries7.data = list14;
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        java.lang.Class class17 = timeSeries7.timePeriodClass;
        timeSeries7.setKey((java.lang.Comparable) 0);
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
        java.util.List list51 = timeSeries23.getItems();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double56 = timeSeries55.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double61 = timeSeries60.getMaxY();
        java.util.List list62 = timeSeries60.data;
        timeSeries55.data = list62;
        java.util.List list64 = timeSeries55.getItems();
        timeSeries23.data = list64;
        timeSeries7.data = list64;
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double71 = timeSeries70.getMaxY();
        java.util.List list72 = timeSeries70.data;
        timeSeries70.fireSeriesChanged();
        timeSeries70.setDomainDescription("hi!");
        boolean boolean76 = timeSeries70.getNotify();
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double81 = timeSeries80.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries85 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double86 = timeSeries85.getMaxY();
        java.util.List list87 = timeSeries85.data;
        timeSeries80.data = list87;
        java.lang.Class class89 = timeSeries80.timePeriodClass;
        timeSeries80.fireSeriesChanged();
        java.util.Collection collection91 = timeSeries70.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        java.lang.Class<?> wildcardClass92 = timeSeries80.getClass();
        timeSeries7.timePeriodClass = wildcardClass92;
        timeSeries1.timePeriodClass = wildcardClass92;
        timeSeries1.removeAgedItems((long) (short) 100, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(class17);
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
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(list87);
        org.junit.Assert.assertNull(class89);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries3.getDataItem((int) (short) -1);
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
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "Time");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        timeSeries28.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries41.setRangeDescription("");
        double double44 = timeSeries41.getMaxY();
        java.lang.Object obj45 = timeSeries41.clone();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double50 = timeSeries49.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double55 = timeSeries54.getMaxY();
        java.util.List list56 = timeSeries54.data;
        timeSeries49.data = list56;
        java.lang.Class class58 = timeSeries49.timePeriodClass;
        timeSeries49.fireSeriesChanged();
        java.util.List list60 = timeSeries49.data;
        boolean boolean61 = timeSeries41.equals((java.lang.Object) timeSeries49);
        long long62 = timeSeries49.getMaximumItemAge();
        java.util.Collection collection63 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries49);
        timeSeries28.setDescription("Overwritten values from: -1");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete((int) '#', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNull(class58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9223372036854775807L + "'", long62 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        java.lang.Class class40 = timeSeries36.getTimePeriodClass();
        timeSeries36.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double49 = timeSeries48.getMaxY();
        timeSeries48.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries44.addAndOrUpdate(timeSeries48);
        java.lang.Comparable comparable53 = timeSeries52.getKey();
        timeSeries52.setDomainDescription("Time");
        java.util.List list56 = timeSeries52.data;
        timeSeries52.setMaximumItemAge((long) 'a');
        java.lang.String str59 = timeSeries52.getRangeDescription();
        java.util.List list60 = timeSeries52.data;
        timeSeries36.data = list60;
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
        org.junit.Assert.assertNull(class40);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + "Overwritten values from: 0.0" + "'", comparable53, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        timeSeries3.setDomainDescription("Overwritten values from: 0");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double7 = timeSeries6.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double12 = timeSeries11.getMaxY();
        java.util.List list13 = timeSeries11.data;
        timeSeries6.data = list13;
        java.lang.Class class15 = timeSeries6.getTimePeriodClass();
        java.lang.Class class16 = timeSeries6.timePeriodClass;
        java.util.Collection collection17 = timeSeries6.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double22 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        java.util.List list28 = timeSeries26.data;
        timeSeries21.data = list28;
        java.util.List list30 = timeSeries21.getItems();
        timeSeries21.setRangeDescription("hi!");
        java.lang.Class class33 = timeSeries21.timePeriodClass;
        timeSeries21.setRangeDescription("");
        int int36 = timeSeries21.getItemCount();
        timeSeries21.setDomainDescription("Value");
        int int39 = timeSeries21.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries6.addAndOrUpdate(timeSeries21);
        java.util.Collection collection41 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        java.lang.Comparable comparable31 = timeSeries18.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries18.addOrUpdate(regularTimePeriod32, (java.lang.Number) 100.0f);
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
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) -1 + "'", comparable31, (short) -1);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries3.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries3.getDomainDescription();
        timeSeries3.fireSeriesChanged();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double16 = timeSeries15.getMaxY();
        java.util.List list17 = timeSeries15.data;
        timeSeries15.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        java.util.List list29 = timeSeries27.data;
        timeSeries22.data = list29;
        java.util.List list31 = timeSeries22.getItems();
        timeSeries22.setRangeDescription("hi!");
        java.lang.Class class34 = timeSeries22.timePeriodClass;
        timeSeries22.setDescription("Overwritten values from: 0.0");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries15.addAndOrUpdate(timeSeries22);
        double double38 = timeSeries37.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries3.addAndOrUpdate(timeSeries37);
        timeSeries39.setMaximumItemCount(1);
        timeSeries39.setMaximumItemCount(10);
        timeSeries39.removeAgedItems(true);
        java.lang.String str46 = timeSeries39.getDescription();
        boolean boolean47 = timeSeries39.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(1L, false);
        timeSeries3.removeAgedItems(true);
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
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        java.util.List list12 = timeSeries10.data;
        timeSeries5.data = list12;
        java.lang.Class class14 = timeSeries5.getTimePeriodClass();
        java.lang.Class class15 = timeSeries5.getTimePeriodClass();
        java.lang.Class class16 = timeSeries5.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries5.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries1.equals((java.lang.Object) timeSeries5);
        timeSeries1.setDescription("Time");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        long long22 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries3.getIndex(regularTimePeriod23);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double40 = timeSeries39.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double45 = timeSeries44.getMaxY();
        java.util.List list46 = timeSeries44.data;
        timeSeries39.data = list46;
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries39.createCopy((int) (short) 1, (int) '#');
        boolean boolean51 = timeSeries50.getNotify();
        java.util.Collection collection52 = timeSeries50.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long57 = timeSeries56.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double62 = timeSeries61.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double67 = timeSeries66.getMaxY();
        java.util.List list68 = timeSeries66.data;
        timeSeries61.data = list68;
        java.util.List list70 = timeSeries61.getItems();
        java.lang.Class<?> wildcardClass71 = timeSeries61.getClass();
        timeSeries56.timePeriodClass = wildcardClass71;
        timeSeries50.timePeriodClass = wildcardClass71;
        boolean boolean74 = timeSeries1.equals((java.lang.Object) timeSeries50);
        java.util.Collection collection75 = timeSeries1.getTimePeriods();
        java.lang.Class<?> wildcardClass76 = collection75.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNull(class25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 9223372036854775807L + "'", long57 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
            timeSeries3.delete((int) (byte) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("hi!");
        long long10 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries14.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries14.removeChangeListener(seriesChangeListener17);
        timeSeries14.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener22);
        timeSeries14.setKey((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        timeSeries31.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries27.addAndOrUpdate(timeSeries31);
        java.lang.Comparable comparable36 = timeSeries35.getKey();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries14.addAndOrUpdate(timeSeries35);
        java.lang.Class class38 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener39);
        java.util.Collection collection41 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double46 = timeSeries45.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double51 = timeSeries50.getMaxY();
        java.util.List list52 = timeSeries50.data;
        timeSeries45.data = list52;
        java.util.List list54 = timeSeries45.getItems();
        timeSeries45.setRangeDescription("hi!");
        java.lang.Class class57 = timeSeries45.timePeriodClass;
        timeSeries45.setRangeDescription("");
        double double60 = timeSeries45.getMinY();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries14.addAndOrUpdate(timeSeries45);
        timeSeries14.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries14.addChangeListener(seriesChangeListener64);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: 0.0" + "'", comparable36, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNull(class57);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(timeSeries61);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        timeSeries28.setDescription("Time");
        java.lang.Class class38 = timeSeries28.getTimePeriodClass();
        double double39 = timeSeries28.getMinY();
        java.util.Collection collection40 = timeSeries28.getTimePeriods();
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
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        java.lang.Object obj50 = timeSeries46.clone();
        boolean boolean51 = timeSeries46.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean56 = timeSeries55.getNotify();
        timeSeries55.setKey((java.lang.Comparable) (short) 0);
        timeSeries55.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list65 = timeSeries64.data;
        boolean boolean66 = timeSeries55.equals((java.lang.Object) list65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries55.removePropertyChangeListener(propertyChangeListener67);
        long long69 = timeSeries55.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries46.addAndOrUpdate(timeSeries55);
        int int71 = timeSeries55.getItemCount();
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
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 9223372036854775807L + "'", long69 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        timeSeries36.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries36.removeChangeListener(seriesChangeListener39);
        timeSeries36.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries45.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries45.removeChangeListener(seriesChangeListener48);
        timeSeries45.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries45.addPropertyChangeListener(propertyChangeListener51);
        timeSeries45.fireSeriesChanged();
        java.util.Collection collection54 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        java.lang.String str55 = timeSeries36.getDomainDescription();
        java.lang.Class<?> wildcardClass56 = timeSeries36.getClass();
        timeSeries3.timePeriodClass = wildcardClass56;
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod60, (double) (byte) 0, false);
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
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double33 = timeSeries32.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double38 = timeSeries37.getMaxY();
        java.util.List list39 = timeSeries37.data;
        timeSeries32.data = list39;
        java.util.List list41 = timeSeries32.getItems();
        timeSeries32.setRangeDescription("hi!");
        java.lang.Class class44 = timeSeries32.timePeriodClass;
        double double45 = timeSeries32.getMaxY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries32.removeChangeListener(seriesChangeListener46);
        java.util.List list48 = timeSeries32.getItems();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries10.addAndOrUpdate(timeSeries32);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((-1), (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        timeSeries1.setNotify(false);
        java.lang.Object obj14 = timeSeries1.clone();
        java.lang.Object obj15 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy((int) 'a', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.removeAgedItems(false);
        java.util.List list10 = timeSeries3.getItems();
        java.lang.String str11 = timeSeries3.getDescription();
        timeSeries3.setDescription("Value");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        double double18 = timeSeries3.getMinY();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod21);
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
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries14.setRangeDescription("");
        double double17 = timeSeries14.getMaxY();
        java.lang.Object obj18 = timeSeries14.clone();
        long long19 = timeSeries14.getMaximumItemAge();
        timeSeries14.setMaximumItemAge((long) 2147483647);
        timeSeries14.removeAgedItems((long) '#', true);
        timeSeries14.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        java.util.List list38 = timeSeries36.data;
        timeSeries31.data = list38;
        java.lang.Class class40 = timeSeries31.getTimePeriodClass();
        java.lang.Class class41 = timeSeries31.timePeriodClass;
        timeSeries31.setKey((java.lang.Comparable) 0);
        java.util.List list44 = timeSeries31.getItems();
        timeSeries31.removeAgedItems(true);
        java.lang.Class class47 = timeSeries31.timePeriodClass;
        double double48 = timeSeries31.getMinY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries3.addAndOrUpdate(timeSeries31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = timeSeries49.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNull(class40);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNull(class47);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        java.util.List list33 = timeSeries31.data;
        timeSeries26.data = list33;
        java.lang.Class class35 = timeSeries26.getTimePeriodClass();
        java.lang.Class class36 = timeSeries26.timePeriodClass;
        timeSeries26.setKey((java.lang.Comparable) 0);
        timeSeries26.setKey((java.lang.Comparable) (short) 1);
        java.lang.String str41 = timeSeries26.getDomainDescription();
        java.util.Collection collection42 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries26.addOrUpdate(regularTimePeriod43, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.setRangeDescription("hi!");
        long long10 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries14.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries14.removeChangeListener(seriesChangeListener17);
        timeSeries14.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener22);
        timeSeries14.setKey((java.lang.Comparable) Double.NaN);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        timeSeries31.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries27.addAndOrUpdate(timeSeries31);
        java.lang.Comparable comparable36 = timeSeries35.getKey();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries14.addAndOrUpdate(timeSeries35);
        java.lang.Class class38 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener39);
        java.util.Collection collection41 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double46 = timeSeries45.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double51 = timeSeries50.getMaxY();
        java.util.List list52 = timeSeries50.data;
        timeSeries45.data = list52;
        java.util.List list54 = timeSeries45.getItems();
        timeSeries45.setRangeDescription("hi!");
        java.lang.Class class57 = timeSeries45.timePeriodClass;
        timeSeries45.setRangeDescription("");
        double double60 = timeSeries45.getMinY();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries14.addAndOrUpdate(timeSeries45);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries45.addChangeListener(seriesChangeListener62);
        timeSeries45.setRangeDescription("Overwritten values from: -1");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: 0.0" + "'", comparable36, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNull(class57);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(timeSeries61);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        long long6 = timeSeries3.getMaximumItemAge();
        long long7 = timeSeries3.getMaximumItemAge();
        timeSeries3.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.addOrUpdate(regularTimePeriod12, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "", "hi!");
        double double4 = timeSeries3.getMaxY();
        long long5 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        timeSeries14.setNotify(true);
        java.lang.Object obj17 = timeSeries14.clone();
        timeSeries14.setMaximumItemAge((long) (short) 1);
        long long20 = timeSeries14.getMaximumItemAge();
        timeSeries14.removeAgedItems(0L, true);
        int int24 = timeSeries14.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener40);
        java.lang.Comparable comparable42 = timeSeries14.getKey();
        java.lang.Class class43 = timeSeries14.getTimePeriodClass();
        timeSeries14.clear();
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
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (short) -1 + "'", comparable42, (short) -1);
        org.junit.Assert.assertNotNull(class43);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        timeSeries3.setMaximumItemCount((int) (short) 10);
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("Overwritten values from: -1");
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener61);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries3.getDataItem(regularTimePeriod63);
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
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Time", "Value");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        java.lang.Comparable comparable2 = timeSeries1.getKey();
        timeSeries1.setDomainDescription("");
        boolean boolean5 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) 'a', (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (-1.0f) + "'", comparable2, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.lang.Class class14 = timeSeries3.timePeriodClass;
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.addAndOrUpdate(timeSeries16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) -1 + "'", comparable15, (short) -1);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        java.lang.Class class13 = timeSeries3.getTimePeriodClass();
        java.util.List list14 = timeSeries3.data;
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        long long31 = timeSeries3.getMaximumItemAge();
        boolean boolean32 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double42 = timeSeries41.getMaxY();
        java.util.List list43 = timeSeries41.data;
        timeSeries36.data = list43;
        java.util.List list45 = timeSeries36.getItems();
        timeSeries36.setRangeDescription("hi!");
        java.lang.Class class48 = timeSeries36.timePeriodClass;
        timeSeries36.setRangeDescription("");
        int int51 = timeSeries36.getItemCount();
        timeSeries36.setMaximumItemAge(10L);
        java.lang.String str54 = timeSeries36.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries3.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries55.getDataItem(regularTimePeriod56);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(timeSeries55);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double8 = timeSeries7.getMaxY();
        java.util.List list9 = timeSeries7.data;
        timeSeries3.data = list9;
        java.lang.String str11 = timeSeries3.getDescription();
        boolean boolean12 = timeSeries3.getNotify();
        java.lang.String str13 = timeSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        timeSeries3.setMaximumItemCount((int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod21);
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
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        java.lang.String str12 = timeSeries3.getDomainDescription();
        double double13 = timeSeries3.getMinY();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        timeSeries3.removeAgedItems(35L, true);
        java.lang.Class<?> wildcardClass11 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getRawDataItem(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.lang.String str32 = timeSeries3.getDescription();
        timeSeries3.setKey((java.lang.Comparable) (-1));
        timeSeries3.removeAgedItems((long) 10, true);
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
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        boolean boolean74 = timeSeries54.isEmpty();
        java.lang.String str75 = timeSeries54.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod76 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem78 = timeSeries54.addOrUpdate(regularTimePeriod76, (java.lang.Number) 1.0f);
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        timeSeries9.removeAgedItems((long) (-1), true);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries9.addAndOrUpdate(timeSeries15);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        java.util.List list27 = timeSeries24.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries24.removeChangeListener(seriesChangeListener28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries24.addOrUpdate(regularTimePeriod30, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Overwritten values from: 0.0" + "'", comparable25, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        java.lang.Object obj35 = timeSeries1.clone();
        timeSeries1.setRangeDescription("Overwritten values from: 0.0");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries1.createCopy((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = timeSeries1.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(true);
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(10L, false);
        java.lang.Class class15 = timeSeries3.timePeriodClass;
        java.lang.String str16 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        java.util.List list27 = timeSeries25.data;
        timeSeries20.data = list27;
        java.lang.Class class29 = timeSeries20.getTimePeriodClass();
        java.lang.Class class30 = timeSeries20.getTimePeriodClass();
        java.lang.Comparable comparable31 = timeSeries20.getKey();
        timeSeries20.fireSeriesChanged();
        timeSeries20.removeAgedItems((long) (byte) 100, true);
        java.util.Collection collection36 = timeSeries20.getTimePeriods();
        java.lang.Comparable comparable37 = timeSeries20.getKey();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries41.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries41.removeChangeListener(seriesChangeListener44);
        java.lang.Class class46 = timeSeries41.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double51 = timeSeries50.getMaxY();
        java.util.List list52 = timeSeries50.data;
        timeSeries41.data = list52;
        timeSeries41.setMaximumItemAge((long) '#');
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries41.removeChangeListener(seriesChangeListener56);
        long long58 = timeSeries41.getMaximumItemAge();
        timeSeries41.setDescription("Overwritten values from: 0.0");
        java.util.Collection collection61 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries3.addAndOrUpdate(timeSeries20);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener63);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) -1 + "'", comparable11, (short) -1);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) -1 + "'", comparable31, (short) -1);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (short) -1 + "'", comparable37, (short) -1);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 35L + "'", long58 == 35L);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(timeSeries62);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 0.0", "Overwritten values from: -1", "Overwritten values from: 0.0");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double31 = timeSeries30.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double36 = timeSeries35.getMaxY();
        java.util.List list37 = timeSeries35.data;
        timeSeries30.data = list37;
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries30.createCopy((int) (short) 1, (int) '#');
        double double42 = timeSeries30.getMinY();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double49 = timeSeries48.getMaxY();
        timeSeries48.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries44.addAndOrUpdate(timeSeries48);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries44.removeChangeListener(seriesChangeListener53);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double59 = timeSeries58.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        java.util.List list65 = timeSeries63.data;
        timeSeries58.data = list65;
        java.lang.Class class67 = timeSeries58.getTimePeriodClass();
        java.lang.Class class68 = timeSeries58.timePeriodClass;
        timeSeries58.setKey((java.lang.Comparable) 0);
        java.util.List list71 = timeSeries58.getItems();
        java.lang.Class<?> wildcardClass72 = list71.getClass();
        timeSeries44.timePeriodClass = wildcardClass72;
        timeSeries30.timePeriodClass = wildcardClass72;
        timeSeries3.timePeriodClass = wildcardClass72;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries3.removeChangeListener(seriesChangeListener76);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int79 = timeSeries3.getIndex(regularTimePeriod78);
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNull(class67);
        org.junit.Assert.assertNull(class68);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDomainDescription("hi!");
        timeSeries3.setKey((java.lang.Comparable) 0);
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0.0", "Time");
        double double4 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries6.addAndOrUpdate(timeSeries10);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries6.removeChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        java.util.List list27 = timeSeries25.data;
        timeSeries20.data = list27;
        java.lang.Class class29 = timeSeries20.getTimePeriodClass();
        java.lang.Class class30 = timeSeries20.timePeriodClass;
        timeSeries20.setKey((java.lang.Comparable) 0);
        java.util.List list33 = timeSeries20.getItems();
        java.lang.Class<?> wildcardClass34 = list33.getClass();
        timeSeries6.timePeriodClass = wildcardClass34;
        timeSeries3.timePeriodClass = wildcardClass34;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries3.removeChangeListener(seriesChangeListener37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod39, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Value", "Time");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        timeSeries45.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries45.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries45.add(regularTimePeriod52, (java.lang.Number) (short) -1, true);
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
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 35L);
        timeSeries1.clear();
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        double double4 = timeSeries1.getMinY();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "");
        timeSeries3.setDescription("");
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.Object obj7 = timeSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100 + "'", comparable6, 100);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        timeSeries28.setDescription("Time");
        java.lang.Class class38 = timeSeries28.getTimePeriodClass();
        double double39 = timeSeries28.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries28.getTimePeriod((int) ' ');
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
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Overwritten values from: 0.0" + "'", comparable29, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        java.lang.Comparable comparable24 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double29 = timeSeries28.getMaxY();
        java.util.List list30 = timeSeries28.data;
        timeSeries28.fireSeriesChanged();
        timeSeries28.setNotify(true);
        timeSeries28.removeAgedItems(1L, false);
        timeSeries28.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries42.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries42.removeChangeListener(seriesChangeListener45);
        timeSeries42.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries42.addPropertyChangeListener(propertyChangeListener48);
        java.util.Collection collection50 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        timeSeries42.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double57 = timeSeries56.getMaxY();
        java.util.List list58 = timeSeries56.data;
        timeSeries56.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double64 = timeSeries63.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double69 = timeSeries68.getMaxY();
        java.util.List list70 = timeSeries68.data;
        timeSeries63.data = list70;
        java.util.List list72 = timeSeries63.getItems();
        timeSeries63.setRangeDescription("hi!");
        java.lang.Class class75 = timeSeries63.timePeriodClass;
        timeSeries63.setDescription("Overwritten values from: 0.0");
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries56.addAndOrUpdate(timeSeries63);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener79 = null;
        timeSeries63.addChangeListener(seriesChangeListener79);
        timeSeries63.setDescription("");
        java.lang.Class<?> wildcardClass83 = timeSeries63.getClass();
        timeSeries42.timePeriodClass = wildcardClass83;
        timeSeries9.timePeriodClass = wildcardClass83;
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Overwritten values from: 0.0" + "'", comparable24, "Overwritten values from: 0.0");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNull(class75);
        org.junit.Assert.assertNotNull(timeSeries78);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        timeSeries1.setRangeDescription("");
        boolean boolean5 = timeSeries1.equals((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        java.util.List list38 = timeSeries3.data;
        java.lang.Class<?> wildcardClass39 = timeSeries3.getClass();
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
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.addChangeListener(seriesChangeListener9);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries49.addPropertyChangeListener(propertyChangeListener67);
        timeSeries49.setNotify(true);
        timeSeries49.setDescription("Value");
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
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        java.lang.String str43 = timeSeries36.getRangeDescription();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries10.addChangeListener(seriesChangeListener26);
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double34 = timeSeries33.getMaxY();
        java.util.List list35 = timeSeries33.data;
        timeSeries33.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries33.addChangeListener(seriesChangeListener37);
        java.util.List list39 = timeSeries33.data;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries43.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries43.removeChangeListener(seriesChangeListener46);
        java.lang.Class class48 = timeSeries43.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double53 = timeSeries52.getMaxY();
        java.util.List list54 = timeSeries52.data;
        timeSeries43.data = list54;
        timeSeries43.setMaximumItemAge((long) '#');
        boolean boolean58 = timeSeries43.getNotify();
        java.lang.Object obj59 = timeSeries43.clone();
        timeSeries43.clear();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries33.addAndOrUpdate(timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries10.addAndOrUpdate(timeSeries43);
        java.lang.Comparable comparable63 = timeSeries10.getKey();
        boolean boolean64 = timeSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number66 = timeSeries10.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + (short) -1 + "'", comparable63, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "", "");
        timeSeries3.setNotify(false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener18);
        java.lang.String str20 = timeSeries3.getDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries10.addChangeListener(seriesChangeListener26);
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double34 = timeSeries33.getMaxY();
        java.util.List list35 = timeSeries33.data;
        timeSeries33.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries33.addChangeListener(seriesChangeListener37);
        java.util.List list39 = timeSeries33.data;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries43.setKey((java.lang.Comparable) "");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries43.removeChangeListener(seriesChangeListener46);
        java.lang.Class class48 = timeSeries43.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double53 = timeSeries52.getMaxY();
        java.util.List list54 = timeSeries52.data;
        timeSeries43.data = list54;
        timeSeries43.setMaximumItemAge((long) '#');
        boolean boolean58 = timeSeries43.getNotify();
        java.lang.Object obj59 = timeSeries43.clone();
        timeSeries43.clear();
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries33.addAndOrUpdate(timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries10.addAndOrUpdate(timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double69 = timeSeries68.getMaxY();
        timeSeries68.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries64.addAndOrUpdate(timeSeries68);
        java.lang.Comparable comparable73 = timeSeries72.getKey();
        timeSeries72.setDomainDescription("Time");
        java.util.List list76 = timeSeries72.data;
        timeSeries72.setMaximumItemAge((long) 'a');
        int int79 = timeSeries72.getMaximumItemCount();
        java.util.Collection collection80 = timeSeries62.getTimePeriodsUniqueToOtherSeries(timeSeries72);
        long long81 = timeSeries62.getMaximumItemAge();
        java.lang.String str82 = timeSeries62.getDescription();
        int int83 = timeSeries62.getMaximumItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertEquals("'" + comparable73 + "' != '" + "Overwritten values from: 0.0" + "'", comparable73, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 9223372036854775807L + "'", long81 == 9223372036854775807L);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2147483647 + "'", int83 == 2147483647);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Overwritten values from: 0.0", "Time");
        double double54 = timeSeries53.getMinY();
        java.util.List list55 = timeSeries53.getItems();
        boolean boolean56 = timeSeries3.equals((java.lang.Object) timeSeries53);
        java.lang.String str57 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem58 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem58);
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
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setRangeDescription("Time");
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries10.createCopy(1, 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries32.getRawDataItem(regularTimePeriod33);
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
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        java.lang.Comparable comparable18 = timeSeries14.getKey();
        boolean boolean19 = timeSeries14.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries14.addOrUpdate(timeSeriesDataItem20);
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
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) -1 + "'", comparable18, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Overwritten values from: 0", "Overwritten values from: 0");
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        timeSeries28.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double44 = timeSeries43.getMaxY();
        timeSeries43.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries39.addAndOrUpdate(timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries28.addAndOrUpdate(timeSeries47);
        int int49 = timeSeries47.getMaximumItemCount();
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
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.Object obj40 = timeSeries14.clone();
        timeSeries14.removeAgedItems(false);
        int int43 = timeSeries14.getMaximumItemCount();
        timeSeries14.setDescription("Overwritten values from: 0.0");
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
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        java.lang.Object obj21 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener22);
        timeSeries3.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        java.lang.Comparable comparable21 = timeSeries3.getKey();
        timeSeries3.setMaximumItemCount(2147483647);
        boolean boolean24 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod25, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "" + "'", comparable21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries3.getMinY();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double22 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double27 = timeSeries26.getMaxY();
        java.util.List list28 = timeSeries26.data;
        timeSeries21.data = list28;
        java.lang.Class class30 = timeSeries21.getTimePeriodClass();
        java.lang.Class class31 = timeSeries21.timePeriodClass;
        timeSeries21.setKey((java.lang.Comparable) 0);
        java.util.List list34 = timeSeries21.getItems();
        timeSeries21.removeAgedItems(true);
        boolean boolean37 = timeSeries21.isEmpty();
        int int38 = timeSeries21.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries21.removeChangeListener(seriesChangeListener39);
        java.util.Collection collection41 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries1.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        java.lang.String str42 = timeSeries3.getDomainDescription();
        java.lang.Class class43 = timeSeries3.timePeriodClass;
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(class43);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        timeSeries3.fireSeriesChanged();
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
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) 10);
        int int11 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setMaximumItemCount((int) 'a');
        int int15 = timeSeries3.getMaximumItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Time", "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list4 = timeSeries3.data;
        java.util.List list5 = timeSeries3.getItems();
        java.lang.Object obj6 = timeSeries3.clone();
        java.util.Collection collection7 = timeSeries3.getTimePeriods();
        java.lang.Class class8 = timeSeries3.timePeriodClass;
        java.util.List list9 = timeSeries3.getItems();
        boolean boolean10 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) 'a');
        boolean boolean13 = timeSeries3.getNotify();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        timeSeries3.clear();
        timeSeries3.clear();
        java.lang.Class class23 = timeSeries3.timePeriodClass;
        double double24 = timeSeries3.getMinY();
        timeSeries3.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod27, (java.lang.Number) (byte) 10);
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
        org.junit.Assert.assertNull(class23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        java.util.List list31 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries35.setRangeDescription("");
        double double38 = timeSeries35.getMaxY();
        long long39 = timeSeries35.getMaximumItemAge();
        timeSeries35.setRangeDescription("hi!");
        long long42 = timeSeries35.getMaximumItemAge();
        java.util.List list43 = timeSeries35.getItems();
        timeSeries3.data = list43;
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries3.addOrUpdate(regularTimePeriod47, (double) (byte) -1);
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
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Overwritten values from: 0", "Overwritten values from: 0");
        timeSeries3.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        double double20 = timeSeries3.getMinY();
        int int21 = timeSeries3.getItemCount();
        boolean boolean22 = timeSeries3.isEmpty();
        timeSeries3.removeAgedItems((long) '4', false);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        java.util.List list36 = timeSeries34.data;
        timeSeries29.data = list36;
        java.util.List list38 = timeSeries29.getItems();
        timeSeries29.setRangeDescription("hi!");
        timeSeries29.fireSeriesChanged();
        java.util.List list42 = timeSeries29.data;
        timeSeries3.data = list42;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries3.getDataItem((int) (short) 1);
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
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        double double10 = timeSeries1.getMaxY();
        boolean boolean11 = timeSeries1.isEmpty();
        boolean boolean12 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        java.lang.String str21 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list26 = timeSeries25.data;
        java.util.List list27 = timeSeries25.getItems();
        java.lang.Object obj28 = timeSeries25.clone();
        java.util.Collection collection29 = timeSeries25.getTimePeriods();
        java.lang.Class class30 = timeSeries25.timePeriodClass;
        timeSeries25.setDomainDescription("Overwritten values from: 0");
        boolean boolean33 = timeSeries3.equals((java.lang.Object) timeSeries25);
        timeSeries25.fireSeriesChanged();
        int int35 = timeSeries25.getItemCount();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        boolean boolean18 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double25 = timeSeries24.getMaxY();
        timeSeries24.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries20.addAndOrUpdate(timeSeries24);
        java.lang.Comparable comparable29 = timeSeries28.getKey();
        java.lang.Class class30 = timeSeries28.timePeriodClass;
        java.lang.String str31 = timeSeries28.getDomainDescription();
        java.util.Collection collection32 = timeSeries28.getTimePeriods();
        boolean boolean33 = timeSeries3.equals((java.lang.Object) timeSeries28);
        int int34 = timeSeries28.getMaximumItemCount();
        java.lang.Comparable comparable35 = timeSeries28.getKey();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Overwritten values from: 0.0" + "'", comparable29, "Overwritten values from: 0.0");
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + "Overwritten values from: 0.0" + "'", comparable35, "Overwritten values from: 0.0");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        timeSeries3.setDescription("");
        java.lang.Object obj7 = timeSeries3.clone();
        timeSeries3.setDescription("Overwritten values from: 0");
        java.lang.String str10 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double37 = timeSeries36.getMaxY();
        timeSeries36.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries32.addAndOrUpdate(timeSeries36);
        java.lang.Comparable comparable41 = timeSeries40.getKey();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries30.addAndOrUpdate(timeSeries40);
        java.lang.Comparable comparable43 = timeSeries40.getKey();
        java.lang.Object obj44 = timeSeries40.clone();
        timeSeries40.removeAgedItems((long) (short) 100, false);
        java.util.List list48 = timeSeries40.data;
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
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + "Overwritten values from: 0.0" + "'", comparable41, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + "Overwritten values from: 0.0" + "'", comparable43, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        java.util.List list26 = timeSeries9.data;
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        timeSeries3.removeAgedItems(false);
        long long21 = timeSeries3.getMaximumItemAge();
        java.lang.Comparable comparable22 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries3.getIndex(regularTimePeriod23);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) -1 + "'", comparable22, (short) -1);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        double double10 = timeSeries9.getMaxY();
        timeSeries9.fireSeriesChanged();
        java.lang.String str12 = timeSeries9.getDomainDescription();
        timeSeries9.setNotify(true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        boolean boolean4 = timeSeries3.getNotify();
        timeSeries3.setKey((java.lang.Comparable) (short) 0);
        timeSeries3.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list13 = timeSeries12.data;
        boolean boolean14 = timeSeries3.equals((java.lang.Object) list13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener15);
        long long17 = timeSeries3.getMaximumItemAge();
        timeSeries3.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener24);
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
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        java.util.List list5 = timeSeries3.data;
        timeSeries3.fireSeriesChanged();
        timeSeries3.setNotify(true);
        timeSeries3.setKey((java.lang.Comparable) (byte) 10);
        int int11 = timeSeries3.getItemCount();
        timeSeries3.fireSeriesChanged();
        timeSeries3.setMaximumItemCount((int) 'a');
        java.lang.String str15 = timeSeries3.getRangeDescription();
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
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double53 = timeSeries52.getMaxY();
        timeSeries52.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries48.addAndOrUpdate(timeSeries52);
        java.lang.Comparable comparable57 = timeSeries56.getKey();
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries46.addAndOrUpdate(timeSeries56);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        timeSeries58.addPropertyChangeListener(propertyChangeListener59);
        boolean boolean61 = timeSeries3.equals((java.lang.Object) timeSeries58);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries64 = timeSeries58.createCopy(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
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
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + "Overwritten values from: 0.0" + "'", comparable57, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        java.util.List list10 = timeSeries9.data;
        java.util.List list11 = timeSeries9.getItems();
        java.lang.Object obj12 = timeSeries9.clone();
        java.util.Collection collection13 = timeSeries9.getTimePeriods();
        timeSeries9.setMaximumItemAge((long) 1);
        java.lang.String str16 = timeSeries9.getDomainDescription();
        timeSeries9.setMaximumItemCount((int) (byte) 10);
        long long19 = timeSeries9.getMaximumItemAge();
        java.util.Collection collection20 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "Value");
        java.lang.Comparable comparable4 = timeSeries3.getKey();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timeSeries3.getDomainDescription();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: 0");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (-1.0d) + "'", comparable4, (-1.0d));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        double double6 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) (byte) -1, true);
        timeSeries3.setDescription("Overwritten values from: 0");
        timeSeries3.removeAgedItems(true);
        java.util.List list14 = timeSeries3.getItems();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.createCopy((int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double6 = timeSeries5.getMaxY();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        timeSeries9.setDomainDescription("Time");
        java.util.List list13 = timeSeries9.data;
        long long14 = timeSeries9.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        java.util.List list22 = timeSeries20.data;
        timeSeries20.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries20.addChangeListener(seriesChangeListener24);
        java.lang.String str26 = timeSeries20.getDomainDescription();
        java.util.List list27 = timeSeries20.getItems();
        timeSeries9.data = list27;
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 0.0" + "'", comparable10, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        timeSeries3.setKey((java.lang.Comparable) 10.0d);
        timeSeries3.setDescription("Overwritten values from: 0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem22, true);
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
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double46 = timeSeries45.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double51 = timeSeries50.getMaxY();
        java.util.List list52 = timeSeries50.data;
        timeSeries45.data = list52;
        java.util.List list54 = timeSeries45.getItems();
        timeSeries45.setRangeDescription("hi!");
        java.lang.Class class57 = timeSeries45.timePeriodClass;
        timeSeries45.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long64 = timeSeries63.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double69 = timeSeries68.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double74 = timeSeries73.getMaxY();
        java.util.List list75 = timeSeries73.data;
        timeSeries68.data = list75;
        java.util.List list77 = timeSeries68.getItems();
        java.lang.Class<?> wildcardClass78 = timeSeries68.getClass();
        timeSeries63.timePeriodClass = wildcardClass78;
        timeSeries45.timePeriodClass = wildcardClass78;
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries41.addAndOrUpdate(timeSeries45);
        double double82 = timeSeries81.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries81.createCopy(1, (int) '4');
        java.lang.String str86 = timeSeries85.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number88 = timeSeries85.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNull(class57);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9223372036854775807L + "'", long64 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Time" + "'", str86, "Time");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        timeSeries28.setDescription("Time");
        java.lang.Class class38 = timeSeries28.getTimePeriodClass();
        timeSeries28.setMaximumItemAge(10L);
        double double41 = timeSeries28.getMaxY();
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
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        timeSeries3.removeAgedItems(false);
        java.lang.String str35 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        timeSeries3.removeAgedItems((long) '4', true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries3.getDataItem(1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        java.lang.String str15 = timeSeries14.getDomainDescription();
        int int16 = timeSeries14.getItemCount();
        timeSeries14.setMaximumItemCount(100);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double56 = timeSeries55.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double61 = timeSeries60.getMaxY();
        java.util.List list62 = timeSeries60.data;
        timeSeries55.data = list62;
        java.lang.Class class64 = timeSeries55.getTimePeriodClass();
        java.lang.Class class65 = timeSeries55.getTimePeriodClass();
        java.lang.Comparable comparable66 = timeSeries55.getKey();
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double71 = timeSeries70.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double76 = timeSeries75.getMaxY();
        java.util.List list77 = timeSeries75.data;
        timeSeries70.data = list77;
        java.lang.Class class79 = timeSeries70.getTimePeriodClass();
        java.lang.Class class80 = timeSeries70.getTimePeriodClass();
        timeSeries70.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries55.addAndOrUpdate(timeSeries70);
        java.lang.String str83 = timeSeries55.getDescription();
        timeSeries55.clear();
        timeSeries55.removeAgedItems(true);
        int int87 = timeSeries55.getItemCount();
        java.lang.Class<?> wildcardClass88 = timeSeries55.getClass();
        timeSeries9.timePeriodClass = wildcardClass88;
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
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNull(class64);
        org.junit.Assert.assertNull(class65);
        org.junit.Assert.assertEquals("'" + comparable66 + "' != '" + (short) -1 + "'", comparable66, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNull(class79);
        org.junit.Assert.assertNull(class80);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double4 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double9 = timeSeries8.getMaxY();
        java.util.List list10 = timeSeries8.data;
        timeSeries3.data = list10;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy((int) (short) 1, (int) '#');
        double double15 = timeSeries14.getMinY();
        long long16 = timeSeries14.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double23 = timeSeries22.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double28 = timeSeries27.getMaxY();
        java.util.List list29 = timeSeries27.data;
        timeSeries22.data = list29;
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries22.createCopy((int) (short) 1, (int) '#');
        timeSeries33.setNotify(true);
        java.lang.Object obj36 = timeSeries33.clone();
        timeSeries33.setMaximumItemAge((long) (short) 1);
        long long39 = timeSeries33.getMaximumItemAge();
        timeSeries33.removeAgedItems(0L, true);
        java.util.Collection collection43 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double11 = timeSeries10.getMaxY();
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries6.addAndOrUpdate(timeSeries10);
        timeSeries14.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double21 = timeSeries20.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double26 = timeSeries25.getMaxY();
        java.util.List list27 = timeSeries25.data;
        timeSeries20.data = list27;
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries20.createCopy((int) (short) 1, (int) '#');
        boolean boolean32 = timeSeries31.getNotify();
        java.util.Collection collection33 = timeSeries31.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "hi!", "hi!");
        long long38 = timeSeries37.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double43 = timeSeries42.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double48 = timeSeries47.getMaxY();
        java.util.List list49 = timeSeries47.data;
        timeSeries42.data = list49;
        java.util.List list51 = timeSeries42.getItems();
        java.lang.Class<?> wildcardClass52 = timeSeries42.getClass();
        timeSeries37.timePeriodClass = wildcardClass52;
        timeSeries31.timePeriodClass = wildcardClass52;
        timeSeries14.timePeriodClass = wildcardClass52;
        java.lang.String str56 = timeSeries14.getDescription();
        java.util.Collection collection57 = timeSeries14.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener58);
        java.lang.Class<?> wildcardClass60 = timeSeries14.getClass();
        timeSeries1.timePeriodClass = wildcardClass60;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        timeSeries3.setRangeDescription("");
        boolean boolean6 = timeSeries3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries3.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        boolean boolean25 = timeSeries11.getNotify();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        java.util.List list36 = timeSeries34.data;
        timeSeries29.data = list36;
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries29.createCopy((int) (short) 1, (int) '#');
        timeSeries40.setNotify(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries40.removeChangeListener(seriesChangeListener43);
        boolean boolean45 = timeSeries11.equals((java.lang.Object) timeSeries40);
        timeSeries40.removeAgedItems((long) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries40.getRawDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        timeSeries3.setNotify(true);
        boolean boolean92 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem93 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem94 = timeSeries3.addOrUpdate(timeSeriesDataItem93);
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
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNull(class85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDescription("");
        int int37 = timeSeries3.getItemCount();
        java.util.Collection collection38 = timeSeries3.getTimePeriods();
        timeSeries3.setDomainDescription("Value");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable43 = timeSeries3.getKey();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + (short) -1 + "'", comparable43, (short) -1);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double32 = timeSeries31.getMaxY();
        timeSeries31.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries27.addAndOrUpdate(timeSeries31);
        java.lang.Comparable comparable36 = timeSeries35.getKey();
        timeSeries35.setDomainDescription("Time");
        java.util.List list39 = timeSeries35.data;
        timeSeries3.data = list39;
        int int41 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection43 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + "Overwritten values from: 0.0" + "'", comparable36, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        java.lang.Class class34 = timeSeries3.timePeriodClass;
        timeSeries3.setNotify(false);
        java.lang.Object obj37 = timeSeries3.clone();
        int int38 = timeSeries3.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod39, (java.lang.Number) 9223372036854775807L);
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
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        boolean boolean25 = timeSeries11.getNotify();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double30 = timeSeries29.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double35 = timeSeries34.getMaxY();
        java.util.List list36 = timeSeries34.data;
        timeSeries29.data = list36;
        java.lang.Class class38 = timeSeries29.getTimePeriodClass();
        java.lang.Class class39 = timeSeries29.getTimePeriodClass();
        java.lang.Comparable comparable40 = timeSeries29.getKey();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double45 = timeSeries44.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double50 = timeSeries49.getMaxY();
        java.util.List list51 = timeSeries49.data;
        timeSeries44.data = list51;
        java.lang.Class class53 = timeSeries44.getTimePeriodClass();
        java.lang.Class class54 = timeSeries44.getTimePeriodClass();
        timeSeries44.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries29.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "");
        double double63 = timeSeries62.getMaxY();
        timeSeries62.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries58.addAndOrUpdate(timeSeries62);
        java.lang.Comparable comparable67 = timeSeries66.getKey();
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries56.addAndOrUpdate(timeSeries66);
        java.lang.Object obj69 = timeSeries68.clone();
        timeSeries68.removeAgedItems(0L, true);
        java.util.Collection collection73 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries68);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries76 = timeSeries11.createCopy(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNull(class39);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (short) -1 + "'", comparable40, (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNull(class53);
        org.junit.Assert.assertNull(class54);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertEquals("'" + comparable67 + "' != '" + "Overwritten values from: 0.0" + "'", comparable67, "Overwritten values from: 0.0");
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(collection73);
    }
}

